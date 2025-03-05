package org.oj.pcpartmarketplace.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "buyerId")
    private User buyer;

    @ManyToOne
    @JoinColumn(name = "sellerId")
    private User seller;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    private double totalPrice;

    private String status;

    private Date orderDate;
}
