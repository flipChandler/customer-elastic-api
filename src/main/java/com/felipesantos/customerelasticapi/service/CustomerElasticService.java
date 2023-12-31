package com.felipesantos.customerelasticapi.service;

import com.felipesantos.customerelasticapi.model.CustomerElastic;
import com.felipesantos.customerelasticapi.repository.CustomerElasticRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerElasticService {

    private final CustomerElasticRepository repository;
    private final ElasticsearchOperations elasticsearchOperations;

    public Iterable<CustomerElastic> findAll() {
        return repository.findAll();
    }

    public List<CustomerElastic> findByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }

    public void saveAll(List<CustomerElastic> customers) {
        repository.saveAll(customers);
    }

    public List<CustomerElastic> findByLastNameAndEmail(String lastName, String email) {
        return repository.findByLastNameAndEmail(lastName, email);
    }
}
