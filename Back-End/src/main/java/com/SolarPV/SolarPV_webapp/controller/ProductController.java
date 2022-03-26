package com.SolarPV.SolarPV_webapp.controller;

import com.SolarPV.SolarPV_webapp.model.Product;
import com.SolarPV.SolarPV_webapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    public List<Product> list(){
        return productService.getAllProducts();
    }

    @PostMapping("/add")
    public String add(@RequestBody Product product){
        productService.saveProduct(product);
        return "New Product Added";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> get(@PathVariable Integer id){
        try{
            Product product= productService.get(id);
            return new ResponseEntity<Product>(product,HttpStatus.OK);

        }catch(NoSuchElementException e){
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@RequestBody Product product, @PathVariable Integer id){
        try{
            Product existingProduct = productService.get(id);
            productService.saveProduct(product);
            return new ResponseEntity<Product>(product,HttpStatus.OK);

        }catch(NoSuchElementException e){
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        productService.delete(id);
        return "Deleted Product with id"+id;
    }


}
