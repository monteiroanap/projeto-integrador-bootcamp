package com.example.projetointegrador.service;

import com.example.projetointegrador.model.UserU;
import com.example.projetointegrador.repository.UserRepository;
import com.example.projetointegrador.repository.UserTypeRepository;
import com.example.projetointegrador.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepo;

    public UserU saveUser(UserU user) {
        user.setSecretPassword(new BCryptPasswordEncoder().encode(user.getSecretPassword()));
        return userRepo.save(user);
    }

    public boolean existsById(Long userId) {
        return userRepo.existsById(userId);
    }
}
