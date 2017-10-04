package com.tuannh.controller;

import java.util.List;

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
import com.tuannh.service.CardCenterService;

@RestController
@RequestMapping("/api") 
public class CarterCenterController {
	@Autowired
	CardCenterService cardCenterService;
	
				//	get list CardCenters
	
	@RequestMapping(value = "/cardcenter/", method = RequestMethod.GET)
    public ResponseEntity<List<CartCenters>> listAll() {
        List<CartCenters> list = cardCenterService.findAll();
        System.out.println("ssssssss"+list.get(0).getCardCenterId());
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<CartCenters>>(list, HttpStatus.OK);
    }

					// save a CardCenter
	
	@RequestMapping(value = "/cardcenter/", method = RequestMethod.POST)
    public ResponseEntity<?> createTransactionData(@RequestBody CartCenters cartCenter, UriComponentsBuilder ucBuilder) {
		
        cardCenterService.save(cartCenter);
        
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/cartcenter/{id}").buildAndExpand(cartCenter.getCardCenterId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
	
	 // ------------------- Update a CardCenters ------------------------------------------------
	 
    @RequestMapping(value = "/cardcenter/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable("id") int id, @RequestBody CartCenters cartCenter) {
        
        CartCenters card = cardCenterService.findOne(id);
        card.setCardCenterId(cartCenter.getCardCenterId());
        card.setCartCenterDetails(cartCenter.getCartCenterDetails());
        card.setAmount(cartCenter.getAmount());
        cardCenterService.save(card);
        return new ResponseEntity<CartCenters>(card, HttpStatus.OK);
    }
 
    // ------------------- Delete a CardCenters-----------------------------------------
 
    @RequestMapping(value = "/cardcenter/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable("id") int id) {
       
        CartCenters card = cardCenterService.findOne(id);
        
        cardCenterService.deleteById(id);
        return new ResponseEntity<CartCenters>(HttpStatus.NO_CONTENT);
    }
 
    // ------------------- Delete All CardCenters-----------------------------
 
    @RequestMapping(value = "/cardcenter/", method = RequestMethod.DELETE)
    public ResponseEntity<CartCenters> deleteAll() {
 
        cardCenterService.deleteAll();
        return new ResponseEntity<CartCenters>(HttpStatus.NO_CONTENT);
    }

	
 
}
