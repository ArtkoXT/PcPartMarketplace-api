package org.oj.pcpartmarketplace.repositories;

import org.oj.pcpartmarketplace.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
