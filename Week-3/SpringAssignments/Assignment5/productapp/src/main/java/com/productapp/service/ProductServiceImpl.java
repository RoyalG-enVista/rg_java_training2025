package com.productapp.service;

import com.productapp.entities.Product;
import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepo productRepo;

    @Autowired
    private ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product findByName(String name) {
        return productRepo.findByNameFoo(name);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.getAllProducts();
    }

    @Override
    public Product getProductById(int id) {
        return productRepo.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product productToUpdate = getProductById(id);
        productToUpdate.setPrice(product.getPrice());
        productRepo.save(productToUpdate);
        return productToUpdate;
    }

    @Override
    public void deleteProduct(int id) {
        Product productToDelete = getProductById(id);
        productRepo.delete(productToDelete);
    }

    @Override
    public List<Product> getAllProductSorted(String field) {
        return productRepo.findAll(Sort.by(Sort.Direction.DESC, field));
    }



    @Override
    public Page<Product> getAllProductPage(int offset, int pageSize) {
        return productRepo.findAll(PageRequest.of(offset, pageSize));
    }

    @Override
    public Page<Product> getAllProductPageSorted(String sortField, int offset, int pageSize) {
        return productRepo.findAll(PageRequest.of(offset, pageSize, Sort.by(Sort.Direction.DESC, sortField)));
    }
}
