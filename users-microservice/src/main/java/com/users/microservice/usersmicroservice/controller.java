package com.users.microservice.usersmicroservice;

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
@RequestMapping(value = "api/users")
public class controller {

    @GetMapping
    public ResponseEntity<String> getUsers() throws JsonProcessingException {
        String[] people = {"John Smith", "Emily Johnson", "Michael Williams", "Jessica Brown", "Christopher Jones"};
        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> campos = new HashMap<>();
        campos.put("status", "200");
        campos.put("users", people);

        String json = mapper.writeValueAsString(campos);

        return new ResponseEntity<>(json, HttpStatus.OK);
    }
}
