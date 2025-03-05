package org.oj.pcpartmarketplace.controllers;

import lombok.Data;
import org.oj.pcpartmarketplace.entities.DTOs.ListingDto;
import org.oj.pcpartmarketplace.services.ListingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/listings")
@Data
public class ListingController {

    ListingService listingService;

    @PutMapping("/add")
    public ListingDto addListing(@RequestBody ListingDto listingDto){
        return listingService.createListing(listingDto);
    }

    @PostMapping("/{id}")
    public ListingDto updateListing(@PathVariable Long id, @RequestBody ListingDto listingDto){
        return listingService.updateListing(id, listingDto);
    }
}
