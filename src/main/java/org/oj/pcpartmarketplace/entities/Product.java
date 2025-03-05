package org.oj.pcpartmarketplace.entities;

import jakarta.persistence.*;
import lombok.*;

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
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(nullable = false)
    private String itemCondition;

    @Column(nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    private String location;

    @ElementCollection
    @CollectionTable(
            name = "product_images",
            joinColumns = @JoinColumn(name = "product_id")
    )
    @Column(name = "image_id")
    private List<Long> images;

    private Date creationDate;

    private Date lastUpdate;

}
