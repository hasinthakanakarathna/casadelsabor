package com.casadelsabor.pos.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    private String paymentMethod;
    private String status = "PAID";
    private Double subtotal;
    private Double tax;
    private Double serviceCharge;
    private Double total;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Long getId() { return id; }
    public String getOrderNumber() { return orderNumber; }
    public String getPaymentMethod() { return paymentMethod; }
    public String getStatus() { return status; }
    public Double getSubtotal() { return subtotal; }
    public Double getTax() { return tax; }
    public Double getServiceCharge() { return serviceCharge; }
    public Double getTotal() { return total; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setId(Long id) { this.id = id; }
    public void setOrderNumber(String o) { this.orderNumber = o; }
    public void setPaymentMethod(String p) { this.paymentMethod = p; }
    public void setStatus(String s) { this.status = s; }
    public void setSubtotal(Double s) { this.subtotal = s; }
    public void setTax(Double t) { this.tax = t; }
    public void setServiceCharge(Double s) { this.serviceCharge = s; }
    public void setTotal(Double t) { this.total = t; }
    public void setCreatedAt(LocalDateTime c) { this.createdAt = c; }
}