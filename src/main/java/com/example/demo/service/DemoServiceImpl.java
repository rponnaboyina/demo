package com.example.demo.service;

import com.example.demo.domain.Person;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public List<Person> getPeople() {
        return Arrays.asList(
          new Person("1","one"),
          new Person("2","3")
        );
    }

}
