package org.oj.pcpartmarketplace.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "listings")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sellerId")
    private User seller;

    private String status;

    private Date createdAt;

    private Date updatedAt;
}
