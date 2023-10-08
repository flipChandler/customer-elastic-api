package com.felipesantos.customerelasticapi.controller;

import com.felipesantos.customerelasticapi.model.CustomerElastic;
import com.felipesantos.customerelasticapi.service.CustomerElasticService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
@RequiredArgsConstructor
public class CustomerElasticController {

    private final CustomerElasticService service;

    @GetMapping()
    public Iterable<CustomerElastic> findAllCustomers() {
        return service.findAll();
    }

    @GetMapping("/first-name")
    public List<CustomerElastic> findBy(@RequestParam String firstName) {
        return service.findByFirstName(firstName);
    }

    @PostMapping()
    public int saveCustomer(@RequestBody List<CustomerElastic> customers) {
        service.saveAll(customers);
        return customers.size();
    }
}
