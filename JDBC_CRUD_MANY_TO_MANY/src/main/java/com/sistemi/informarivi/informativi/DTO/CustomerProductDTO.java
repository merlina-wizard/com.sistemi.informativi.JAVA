package com.sistemi.informarivi.informativi.DTO;

public class CustomerProductDTO {

    private int customerId;
    private int productId;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public CustomerProductDTO(int customerId, int productId) {
        this.customerId = customerId;
        this.productId = productId;
    }
}
