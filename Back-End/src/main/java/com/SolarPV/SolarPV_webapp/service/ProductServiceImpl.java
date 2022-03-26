package com.SolarPV.SolarPV_webapp.service;

import com.SolarPV.SolarPV_webapp.model.Product;
import com.SolarPV.SolarPV_webapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product get(Integer id) {
        return productRepo.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        productRepo.deleteById(id);
    }
}
