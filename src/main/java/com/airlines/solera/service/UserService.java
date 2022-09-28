package com.airlines.solera.service;

import java.util.List;
import com.airlines.solera.model.Users;
public interface UserService {
    public Users saveUser(Users user);
    public List<Users> getAllUsers();
}