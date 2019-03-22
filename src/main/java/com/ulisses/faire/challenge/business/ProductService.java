package com.ulisses.faire.challenge.business;

import com.ulisses.faire.challenge.domain.Product;
import com.ulisses.faire.challenge.domain.Products;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductService {

    @Autowired
    ApplicationArguments applicationArguments;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private final String BASE_URL = "https://www.faire-stage.com/api/v1";
    private final String API_TOKEN_HEADER = "X-FAIRE-ACCESS-TOKEN";
    private final String TEA_DROPS_BRAND_ID = "b_d2481b88";

    public Products consumeAllProducts() {
        String apiToken = applicationArguments.getSourceArgs()[0];

        WebClient client = WebClient.builder()
                .baseUrl(BASE_URL)
                .defaultHeader(API_TOKEN_HEADER, apiToken)
                .build();

        WebClient.ResponseSpec responseSpec = client.get().uri("/products").retrieve();
        Mono<Products> products = responseSpec.bodyToMono(Products.class);

        return products.block();

    }
}
