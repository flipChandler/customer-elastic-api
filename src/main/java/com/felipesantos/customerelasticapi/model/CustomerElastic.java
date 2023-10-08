package com.felipesantos.customerelasticapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "customers")
@NoArgsConstructor
@AllArgsConstructor
public class CustomerElastic {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
