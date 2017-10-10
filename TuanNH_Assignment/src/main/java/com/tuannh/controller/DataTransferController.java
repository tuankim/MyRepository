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
import com.tuannh.model.DataTransfers;
import com.tuannh.model.Merchants;
import com.tuannh.service.DataTransferService;
import com.tuannh.service.MerchantsService;

@RestController
@RequestMapping("/api")
public class DataTransferController {
	@Autowired
	DataTransferService dataTransferService;
	
				//	get list CardCenters
	
	@RequestMapping(value = "/datatransfer/", method = RequestMethod.GET)
    public ResponseEntity<List<DataTransfers>> listAll() {
        List<DataTransfers> list = dataTransferService.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<DataTransfers>>(list, HttpStatus.OK);
    }

					// save a CardCenter
	
	@RequestMapping(value = "/datatransfer/", method = RequestMethod.POST)
    public ResponseEntity<?> createTransactionData(@RequestBody DataTransfers dataTransfers, UriComponentsBuilder ucBuilder) {
		dataTransfers.setDataTranferId(UUID.randomUUID());
		dataTransferService.save(dataTransfers);
        
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/cartcenter/{id}").buildAndExpand(dataTransfers.getDataTranferId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
	
	 // ------------------- Update a CardCenters ------------------------------------------------
	 
    @RequestMapping(value = "/datatransfer/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable("id") UUID id, @RequestBody DataTransfers dataTranfer) {
        DataTransfers dataTransfers=new DataTransfers();
    	dataTransfers.setDataTranferId(dataTranfer.getDataTranferId());
    	dataTransfers.setAcquisitions(dataTranfer.getAcquisitions());
    	dataTransfers.setMerchants(dataTranfer.getMerchants());
    	dataTransfers.setMerchantsFees(dataTranfer.getMerchantsFees());
    	dataTransfers.setOtherDetail(dataTranfer.getOtherDetail());
    	
        dataTransferService.save(dataTransfers);
      
        return new ResponseEntity<DataTransfers>(dataTransfers, HttpStatus.OK);
    }
 
    // ------------------- Delete a CardCenters-----------------------------------------
 
    @RequestMapping(value = "/datatransfer/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable("id") UUID id) {
       
        DataTransfers dataTransfers = dataTransferService.findOne(id);
        
        dataTransferService.deleteById(id);
        return new ResponseEntity<DataTransfers>(HttpStatus.NO_CONTENT);
    }
 
    // ------------------- Delete All CardCenters-----------------------------
 
    @RequestMapping(value = "/datatransfer/", method = RequestMethod.DELETE)
    public ResponseEntity<DataTransfers> deleteAll() {
 
    	dataTransferService.deleteAll();
        return new ResponseEntity<DataTransfers>(HttpStatus.NO_CONTENT);
    }
}
