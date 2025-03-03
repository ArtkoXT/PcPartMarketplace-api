package org.oj.pcpartmarketplace.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    private String description;

}
