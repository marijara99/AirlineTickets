package com.airlines.solera.service;

import java.util.List;
import com.airlines.solera.dbrepousers.UserDBRepository;
import com.airlines.solera.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImplementation implements UserService{
    @Autowired
    private UserDBRepository userRepository;
    @Override
    public Users saveUser (Users user) {
        return userRepository.save(user);
    }
    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}