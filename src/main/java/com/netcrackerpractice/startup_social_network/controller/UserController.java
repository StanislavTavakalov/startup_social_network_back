package com.netcrackerpractice.startup_social_network.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.netcrackerpractice.startup_social_network.model.entity.User;
import com.netcrackerpractice.startup_social_network.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("/user-list")
    public List<User> getCustomersTest() {
        System.out.println("Get all accounts...");
        List<User> accounts = new ArrayList<>();
        repository.findAll().forEach(accounts::add);
        return accounts;
    }


//    @PostMapping(value = "/customers/create")
//    public Account postCustomer(@RequestBody Account customer) {
//
//        Account _customer = repository.save(new Account(customer.getName(), customer.getRole()));
//        return _customer;
//    }

//    @DeleteMapping("/customers/{id}")
//    public ResponseEntity<String> deleteCustomer(@PathVariable("id") long id) {
//        System.out.println("Delete Customer with ID = " + id + "...");
//
//        repository.deleteById(id);
//
//        return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
//    }

//    @DeleteMapping("/customers/delete")
//    public ResponseEntity<String> deleteAllCustomers() {
//        System.out.println("Delete All Customers...");
//
//        repository.deleteAll();
//
//        return new ResponseEntity<>("All customers have been deleted!", HttpStatus.OK);
//    }

//    @GetMapping(value = "customers/age/{age}")
//    public List<Customer> findByAge(@PathVariable int age) {
//
//        List<Customer> customers = repository.findByAge(age);
//        return customers;
//    }

//    @PutMapping("/customers/{id}")
//    public ResponseEntity<Customer> updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
//        System.out.println("Update Customer with ID = " + id + "...");
//
//        Optional<Customer> customerData = repository.findById(id);
//
//        if (customerData.isPresent()) {
//            Customer _customer = customerData.get();
//            _customer.setName(customer.getName());
//            _customer.setAge(customer.getAge());
//            _customer.setActive(customer.isActive());
//            return new ResponseEntity<>(repository.save(_customer), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }


}