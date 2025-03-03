package org.oj.pcpartmarketplace.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @Column(nullable = false)
    private String condition;

    @Column(nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn(name = "sellerId")
    private User seller;

    private String location;

    private List<?> images;

    private Date creationDate;

    private Date lastUpdate;



}
