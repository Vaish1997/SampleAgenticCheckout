package com.example.demo.model.product;

import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;

public class Product {

    private String sku;
    private String name;
    private BigDecimal price;
    private String currency;
    private String imageUrl;
    private String shortDescription;
    private String availability;
    private String description;
    private @Nullable String length;
    private @Nullable String width;
    private @Nullable String height;

    // Required by Jackson
    public Product() {
    }

    public Product(String sku,
                   String name,
                   BigDecimal price,
                   String currency,
                   String imageUrl,
                   String shortDescription,
                   String availability,
                   String description,
                   @Nullable String length,
                   @Nullable String width,
                   @Nullable String height) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.currency = currency;
        this.imageUrl = imageUrl;
        this.shortDescription = shortDescription;
        this.availability = availability;
        this.description = description;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Nullable
    public String getLength() {
        return length;
    }

    public void setLength(@Nullable String length) {
        this.length = length;
    }

    @Nullable
    public String getWidth() {
        return width;
    }

    public void setWidth(@Nullable String width) {
        this.width = width;
    }

    @Nullable
    public String getHeight() {
        return height;
    }

    public void setHeight(@Nullable String height) {
        this.height = height;
    }
}
