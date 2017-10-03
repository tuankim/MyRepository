package com.tuannh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.tuannh.model.TransactionData;
import com.tuannh.service.TransactionDataService;

@RestController
@RequestMapping("/api") 
public class TransactionDataController {
	@Autowired
	TransactionDataService transactionDataService;
	
	@RequestMapping(value = "/transactionData/", method = RequestMethod.POST)
    public ResponseEntity<?> createTransactionData(@RequestBody TransactionData transactionData, UriComponentsBuilder ucBuilder) {
        transactionDataService.save(transactionData);
        transactionDataService.ProcessAmountCardCenter(transactionData);
        transactionDataService.ProcessAmountMerchants(transactionData);
        
        HttpHeaders headers = new HttpHeaders();
        
        
        
    
        headers.setLocation(ucBuilder.path("/api/transactionData/{id}").buildAndExpand(transactionData.getTransactionId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
	
	@RequestMapping(value = "/transactionData/", method = RequestMethod.GET)
    public ResponseEntity<List<TransactionData>> listAllTransactionData() {
        List<TransactionData> list = transactionDataService.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<TransactionData>>(list, HttpStatus.OK);
    }
}
