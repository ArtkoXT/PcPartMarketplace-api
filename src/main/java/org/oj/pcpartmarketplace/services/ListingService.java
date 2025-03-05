package org.oj.pcpartmarketplace.services;

import lombok.Data;
import org.oj.pcpartmarketplace.entities.DTOs.ListingDto;
import org.oj.pcpartmarketplace.entities.Listing;
import org.oj.pcpartmarketplace.exceptions.NotFoundException;
import org.oj.pcpartmarketplace.repositories.ListingRepository;
import org.oj.pcpartmarketplace.repositories.ProductRepository;
import org.oj.pcpartmarketplace.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
@Data
public class ListingService {

    ListingRepository listingRepo;
    ProductRepository productRepo;
    UserRepository userRepo;

    public ListingDto createListing(ListingDto listingDto){
        return toListingDto(listingRepo
                .save(createListingFromDTO(listingDto)));
    }

    public ListingDto updateListing(Long listingId, ListingDto listingDto){

        Listing listing = listingRepo.findById(listingId)
                .orElseThrow(() -> new NotFoundException("Listing not found"));

        listing.setProduct(productRepo.findById(listingDto.getProductId())
                .orElseThrow( () -> new NotFoundException("Product not found!")));
        listing.setSeller(userRepo.findById(listingDto.getSellerId())
                .orElseThrow( () -> new NotFoundException("User not found!")));
        listing.setStatus(listingDto.getStatus());
        listing.setUpdatedAt(listingDto.getUpdatedAt());

        return toListingDto(listingRepo.save(listing));
    }

    private Listing createListingFromDTO(ListingDto listingDto){

        Listing listing = new Listing();

        listing.setId(listingDto.getId());
        listing.setProduct(productRepo.findById(listingDto.getProductId())
                .orElseThrow( () -> new NotFoundException("Product not found!")));
        listing.setSeller(userRepo.findById(listingDto.getSellerId())
                .orElseThrow( () -> new NotFoundException("User not found!")));
        listing.setStatus(listingDto.getStatus());
        listing.setCreatedAt(listingDto.getCreatedAt());
        listing.setUpdatedAt(listingDto.getUpdatedAt());

        return listing;
    }

    private ListingDto toListingDto(Listing listing){

        ListingDto listingDto = new ListingDto();

        listingDto.setId(listing.getId());
        listingDto.setProductId(listing.getProduct().getId());
        listingDto.setSellerId(listing.getSeller().getId());
        listingDto.setStatus(listing.getStatus());
        listingDto.setCreatedAt(listing.getCreatedAt());
        listingDto.setUpdatedAt(listing.getUpdatedAt());

        return listingDto;
    }

}
