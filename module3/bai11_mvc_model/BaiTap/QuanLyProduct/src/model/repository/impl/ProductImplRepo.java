package model.repository.impl;

import model.bean.Product;
import model.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ProductImplRepo implements ProductRepository {
    private static Map<Integer,Product> productMap=new TreeMap<>();
    static {
            productMap.put(1,new Product(1,"IphoneX",30000,"Đẹp","Apple",12,"red"));
            productMap.put(2,new Product(2,"Iphone12",40000,"Đẹp","Apple",3,"blue"));
            productMap.put(3,new Product(3,"Iphone13",45000,"Rất Đẹp","Apple",3,"blue"));
            productMap.put(4,new Product(4,"SamsungPrime",20000,"Đẹp","Samsung",3,"blue"));
            productMap.put(5,new Product(5,"Nokia4",15000,"Đẹp","Nokia",3,"blue"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public boolean save(Product product) {
        int idProduct = (int) (Math.random() * 100);
        product.setId(idProduct);
        productMap.put(idProduct,product);
        return true;
    }

    @Override
    public boolean edit(int id, Product product) {
        productMap.put(id,product);
        return true;
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return productMap.values()
                .stream()
                .filter(cus -> cus.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }
}
