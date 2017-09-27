package com.tuannh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tuannh.model.CartCenters;
import com.tuannh.service.CardCenterService;

@RestController
@RequestMapping("/api") 
public class CarterCenterController {
	@Autowired
	CardCenterService cardCenterService;
	
	@RequestMapping(value = "/cardcenter/", method = RequestMethod.GET)
    public ResponseEntity<List<CartCenters>> listAllUsers() {
        List<CartCenters> list = cardCenterService.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<CartCenters>>(list, HttpStatus.OK);
    }
 
}
