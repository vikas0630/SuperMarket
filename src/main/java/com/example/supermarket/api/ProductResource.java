package com.example.supermarket.api;

import com.example.supermarket.model.Product;
import com.example.supermarket.service.SuperMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {
    @Autowired
    private SuperMarketService supermarketservice;

    @PostMapping
   public  Product addProduct(@RequestBody Product product){
    return supermarketservice.addProduct(product);
   }

   @GetMapping
    public List<Product> getProduct(){
        return supermarketservice.getProductList();
    }

    @GetMapping("/{customerId}")
   public Product getProduct( @PathVariable("customerId") int pid){
        return supermarketservice.getProduct(pid);
    }

    @PutMapping("/{customerId}")
    public Product updateProduct(@PathVariable("customerId") int pid ,@RequestBody Product product){
        return supermarketservice.updateProduct(pid, product);
    }

    @DeleteMapping("/{customerId}")
    public void deleteProduct(@PathVariable("customerId") int pid){
        supermarketservice.deleteProduct(pid);
    }

}
