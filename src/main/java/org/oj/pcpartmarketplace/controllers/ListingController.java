package org.oj.pcpartmarketplace.controllers;

import lombok.Data;
import org.oj.pcpartmarketplace.entities.DTOs.ListingDto;
import org.oj.pcpartmarketplace.services.ListingService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/listings")
@Data
public class ListingController {


}
