package com.kelaskoding.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.kelaskoding.models.entities.User;
import com.kelaskoding.models.repositories.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserRepo repo;

    public User saveUser(User user){
        return repo.save(user);
    }

    public Iterable<User> findAll(){
        return repo.findAll();
    }

    public Optional<User> findOne(Long id){
        return repo.findById(id);
    }
}
