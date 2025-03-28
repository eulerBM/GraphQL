package com.example.graphqlserver.Controller;

import com.example.graphqlserver.Entity.ProductEntity;
import com.example.graphqlserver.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @QueryMapping
    public ProductEntity productById(@Argument long id){

        var productGet = this.productRepository.findById(id);

        if (productGet.isPresent()){
            return productGet.get();
        }

        throw new RuntimeException("Nenhum produto com esse ID");

    }


}
