package com.SolarPV.SolarPV_webapp.service;

import com.SolarPV.SolarPV_webapp.model.User;
import com.SolarPV.SolarPV_webapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepository;

    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }

}
