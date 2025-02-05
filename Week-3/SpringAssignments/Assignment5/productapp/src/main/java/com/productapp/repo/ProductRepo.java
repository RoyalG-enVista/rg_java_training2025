package com.productapp.repo;

import com.productapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


    @Query("select p from Product p where p.name = :name")
    Product findByNameFoo(String name);

    @Query("select p from Product p")
    List<Product> getAllProducts();

    @Query("select p from Product p where p.name = ?1 and p.price = ?2")
    public Product findByNameAndPrice1(String name, BigDecimal price);

    @Query("select p from Product p where p.name = :name and p.price = :price")
    public Product findByNameAndPrice2(@Param("name") String name, @Param("price") BigDecimal price);

}
