package com.felipesantos.customerelasticapi.repository;

import com.felipesantos.customerelasticapi.model.CustomerElastic;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CustomerElasticRepository extends ElasticsearchRepository<CustomerElastic, String> {

    List<CustomerElastic> findByFirstName(String firstName);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"lastName\": \"?0\"}}, {\"match\": {\"email\": \"?1\"}}]}}")
    List<CustomerElastic> findByLastNameAndEmail(String name, String email);
}
