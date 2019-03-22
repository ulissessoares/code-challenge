package com.ulisses.faire.challenge.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.util.List;

@Getter
@Setter
@ToString
public class Product {

    private String id;

    @JsonProperty("brand_id")
    private String brandId;

    @JsonProperty("short_description")
    private String shortDescription;

    private String description;

    @JsonProperty("wholesale_price_cents")
    private Integer wholesalePriceCents;

    @JsonProperty("retail_price_cents")
    private Integer retailPriceCents;

    private Boolean active;

    private String name;

    @JsonProperty("unit_multiplier")
    private Integer unitMultiplier;

    @JsonProperty("options")
    private List<Option> options;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;


}
