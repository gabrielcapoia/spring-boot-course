package com.eureka.course.services;

import com.eureka.course.entities.User;
import com.eureka.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> optUser = repository.findById(id);
        return optUser.get();
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete (Long id) {
        repository.deleteById(id);
    }
}
