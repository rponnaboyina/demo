package com.example.demo.controller;

import com.example.demo.domain.Person;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DemoController {

@Autowired
    DemoService demoService;

    @RequestMapping("/name")
    public ResponseEntity<List<Person> > getNames(){
        return new ResponseEntity<>(demoService.getPeople(), HttpStatus.ACCEPTED);
    }
}

