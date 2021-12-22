package com.example.controller;


import com.example.entity.Values;
import com.example.interfaces.OperationCalculatrice;
import com.example.service.Sevice;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculatrice/")
public class Controlleur {

    @PostMapping(value = "addition",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public float addition(@RequestBody Values values){
        OperationCalculatrice operation=new Sevice();
        return operation.addition(values.getX(),values.getY());
    }

    @PostMapping(value = "division",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public float division(@RequestBody Values values){
        OperationCalculatrice operation=new Sevice();
        return operation.division(values.getX(),values.getY());
    }

    @PostMapping(value = "multiplication",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public float multiplication(@RequestBody Values values){
        OperationCalculatrice operation=new Sevice();
        return operation.multiplication(values.getX(),values.getY());
    }
}
