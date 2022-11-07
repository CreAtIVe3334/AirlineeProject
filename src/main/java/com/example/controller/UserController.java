package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/user/")
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> registration(@RequestBody User user){
        return new ResponseEntity<User>(userService.registration(user), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id){
        return new ResponseEntity<User>(userService.getUserById(id),HttpStatus.OK);
    }

    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestParam("username") String username,@RequestParam("password") String password){

        return new ResponseEntity<String>(userService.login(username,password)?"Succesfully login":"Incorrect username or password",HttpStatus.ACCEPTED);
    }



}
