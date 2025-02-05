package com.productapp.controller;

import com.productapp.entities.Product;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //http://localhost:8082/productapp/productsorted?field=id
    @GetMapping(path = "/productsorted")
    public List<Product> getAllProductSorted(@RequestParam(value = "field") String field) {
        return productService.getAllProductSorted(field);
    }


    // http://localhost:8082/productapp/productspage?offset=1&pageSize=4
    @GetMapping(path = "/productspage")
    public Page<Product> getAllProductPage(@RequestParam(value = "offset") int offset,
                                           @RequestParam(value = "pageSize") int pageSize) {
        return productService.getAllProductPage(offset, pageSize);
    }



    @GetMapping(path = "productspage2")
    public Page<Product> getAllProductPage2(@RequestParam(name="offset")  int offset,
                                            @RequestParam(name = "pageSize")  int pageSize,
                                            @RequestParam(name = "field") String field){
        return productService.getAllProductPageSorted(field, offset, pageSize);
    }

//-------------------------------------
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("products/{name}")
    public Product getProductByName(@PathVariable String name) {
        return productService.findByName(name);
    }

}
