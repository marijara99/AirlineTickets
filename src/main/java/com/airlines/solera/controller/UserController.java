package com.airlines.solera.controller;

import java.util.List;
import com.airlines.solera.model.Users;
import com.airlines.solera.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/users")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public String add(@RequestBody Users user){
        userService.saveUser(user);
        return "New student is added";
    }
 @GetMapping("/getAll")
    public List<Users> list(){
        return userService.getAllUsers();
    }
}