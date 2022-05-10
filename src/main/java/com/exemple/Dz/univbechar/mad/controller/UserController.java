package com.exemple.Dz.univbechar.mad.controller;


import com.exemple.Dz.univbechar.mad.Entity.User;
import com.exemple.Dz.univbechar.mad.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/Users")
    public List<User> findAll(){
      return this.userRepository.findAll();
    }

    @GetMapping("/Users/{id}")
    public User findById(@PathVariable Integer id) throws Exception {
        return this.userRepository.findById(id).orElseThrow(()-> new Exception("User n'existe pas"));
    }

    @PostMapping("/Users")
    public User saveUser(@RequestBody User user){
        return this.userRepository.save(user);
    }


}
