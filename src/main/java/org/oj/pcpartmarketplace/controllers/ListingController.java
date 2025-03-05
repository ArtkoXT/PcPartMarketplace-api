package org.oj.pcpartmarketplace.controllers;

import lombok.Data;
import org.oj.pcpartmarketplace.entities.DTOs.ListingDto;
import org.oj.pcpartmarketplace.services.ListingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/listings")
@Data
public class ListingController {

    ListingService listingService;

    @GetMapping("/all")
    public List<ListingDto> getAllListings(){
        return listingService.getAllListings();
    }

    @PostMapping("/add")
    public ListingDto addListing(@RequestBody ListingDto listingDto){
        return listingService.createListing(listingDto);
    }

    @PutMapping("/{id}")
    public ListingDto updateListing(@PathVariable Long id, @RequestBody ListingDto listingDto){
        return listingService.updateListing(id, listingDto);
    }
}
