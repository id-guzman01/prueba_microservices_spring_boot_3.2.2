package com.producs.productsmicroservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "api/products")
public class controller {

    @GetMapping
    public ResponseEntity<String> getProducts() throws JsonProcessingException {
        String[] products = {"Laptop", "Smartphone", "Headphones", "Camera", "Tablet"};
        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> campos = new HashMap<>();
        campos.put("status", "200");
        campos.put("products", products);

        String json = mapper.writeValueAsString(campos);

        return new ResponseEntity<>(json, HttpStatus.OK);
    }

}
