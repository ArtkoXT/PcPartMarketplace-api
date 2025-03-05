package org.oj.pcpartmarketplace.repositories;

import org.oj.pcpartmarketplace.entities.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepository extends JpaRepository<Listing,Long> {
}
