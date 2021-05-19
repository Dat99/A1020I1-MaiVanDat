package model.service.impl;

import model.bean.Customer;
import model.repository.CustomerRepository;
import model.repository.impl.CustomerRepositoryImpl;
import model.service.CustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean save(Customer customer) {
        if (customer.getName().matches("[A-Za-z ]+")) {
            return customerRepository.save(customer);
        }
        return false;
    }

    @Override
    public Customer findById(int idCustomer) {
        return customerRepository.findById(idCustomer);
    }

    @Override
    public boolean edit(int idCustomer, Customer customer) {
        if (customer.getName().matches("[A-Za-z ]+")) {
            return customerRepository.edit(idCustomer, customer);
        }
        return false;
    }

    @Override
    public void delete(int idCustomer) {
     customerRepository.delete(idCustomer);
    }
}
