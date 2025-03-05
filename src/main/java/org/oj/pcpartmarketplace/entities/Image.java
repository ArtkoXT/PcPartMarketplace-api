package org.oj.pcpartmarketplace.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "images")
@Data
public class Image {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] imageData;
}
