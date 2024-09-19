package com.example.backend_frontend.controller;

import com.example.backend_frontend.model.User;
import com.example.backend_frontend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    private UserRepository userRepo;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user){
        return userRepo.save(user);
    }

    @GetMapping("/getusers")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
}
