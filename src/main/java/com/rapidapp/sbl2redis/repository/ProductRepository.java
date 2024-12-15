package com.rapidapp.sbl2redis.repository;

import com.rapidapp.sbl2redis.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
