package org.oj.pcpartmarketplace.entities.DTOs;

import lombok.Data;

import java.util.Date;

@Data
public class ListingDto {

    private Long id;

    private Long productId;

    private Long sellerId;

    private String status;

    private Date createdAt;

    private Date updatedAt;
}
