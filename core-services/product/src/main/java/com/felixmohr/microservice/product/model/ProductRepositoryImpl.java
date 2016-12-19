package com.felixmohr.microservice.product.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductRepositoryImpl implements ProductRepositoryCustom {

    @Autowired
    private ProductRepository repo;

    @Override
    public List<Product> search(String search) {
        List<Product> products = (List<Product>) repo.findAll();
        List<Product> ret = new ArrayList<Product>();
        for (Product p : products) {
            String[] splitDescription = p.getDetails().split(" ");
            String[] splitSearch = search.split(" ");
            boolean add = true;
            for (String i : splitSearch) {
                boolean contained = false;
                for (String j : splitDescription) {
                    if (i.equals(j)) {
                        contained = true;
                        break;
                    }
                }
                if (!contained) {
                    add = false;
                    break;
                }
            }
            if (add) {
                ret.add(p);
            }
        }
        return ret;
    }

    @Override
    public List<Product> findByCategoryId(final long categoryId) {
        return ((List<Product>) repo.findAll()).stream()
                .filter(product -> product.getCategoryId() == categoryId)
                .collect(Collectors.toList());
    }

}
