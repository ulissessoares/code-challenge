package com.ulisses.faire.challenge.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Option {

    private String id;

    @JsonProperty("product_id")
    private String productId;

    private Boolean active;

    private String name;

    private String sku;

    @JsonProperty("available_quantity")
    private Integer availableQuantity;

    @JsonProperty("backordered_until")
    private String backorderedUntil;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;

}
