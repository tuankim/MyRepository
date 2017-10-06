package com.tuannh.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.tuannh.model.CartCenters;
import com.tuannh.model.Merchants;
import com.tuannh.service.MerchantsService;

@RestController
@RequestMapping("/api")
public class MerchantsController {
	@Autowired
	MerchantsService merchantService;
	
				//	get list CardCenters
	
	@RequestMapping(value = "/merchants/", method = RequestMethod.GET)
    public ResponseEntity<List<Merchants>> listAll() {
        List<Merchants> list = merchantService.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Merchants>>(list, HttpStatus.OK);
    }

					// save a CardCenter
	
	@RequestMapping(value = "/merchants/", method = RequestMethod.POST)
    public ResponseEntity<?> createTransactionData(@RequestBody Merchants merchants, UriComponentsBuilder ucBuilder) {
		merchants.setMerchantId(UUID.randomUUID());
        merchantService.save(merchants);
        
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/cartcenter/{id}").buildAndExpand(merchants.getMerchantId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
	
	 // ------------------- Update a CardCenters ------------------------------------------------
	 
    @RequestMapping(value = "/merchants/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable("id") UUID id, @RequestBody Merchants merchants) {
        Merchants merchant=new Merchants();
        merchant.setMerchantId(merchants.getMerchantId());
        merchant.setMerchantName(merchants.getMerchantName());
        merchant.setAmount(merchants.getAmount());
        merchant.setOtherDetails(merchants.getOtherDetails());
    	merchantService.save(merchant);
      
        return new ResponseEntity<Merchants>(merchant, HttpStatus.OK);
    }
 
    // ------------------- Delete a CardCenters-----------------------------------------
 
    @RequestMapping(value = "/merchants/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable("id") UUID id) {
       
        Merchants merchants = merchantService.findOne(id);
        
        merchantService.deleteById(id);
        return new ResponseEntity<CartCenters>(HttpStatus.NO_CONTENT);
    }
 
    // ------------------- Delete All CardCenters-----------------------------
 
    @RequestMapping(value = "/merchants/", method = RequestMethod.DELETE)
    public ResponseEntity<CartCenters> deleteAll() {
 
    	merchantService.deleteAll();
        return new ResponseEntity<CartCenters>(HttpStatus.NO_CONTENT);
    }

	
}
