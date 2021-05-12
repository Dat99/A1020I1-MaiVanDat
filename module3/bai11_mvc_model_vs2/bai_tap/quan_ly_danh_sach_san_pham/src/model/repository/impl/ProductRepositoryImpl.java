package model.repository.impl;

import model.bean.Product;
import model.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductReponsitoryImpl implements ProductRepository {
    private static Map<Integer,Product> productMap=new TreeMap<>();
    static {
        productMap.put(1,new Product(1,"book",20000,"2000"));
        productMap.put(2,new Product(1,"rule",5000,"500"));
        productMap.put(3,new Product(1,"notebook",10000,"1000"));
        productMap.put(4,new Product(1,"pen",3000,"100"));
        productMap.put(5,new Product(1,"Pencil case",50000,"5000"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public boolean save(Product product) {
        return false;
    }

    @Override
    public boolean edit(int id, Product product) {
        return false;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
