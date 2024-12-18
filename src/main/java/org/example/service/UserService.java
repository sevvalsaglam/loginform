package org.example.service;

import org.example.Entity.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public boolean validateUser(String username, String password) {
        // Kullanıcıyı username ile bul
        User user = userRepository.findByUsername(username);

        // Eğer kullanıcı varsa ve şifre doğruysa true döndür
        return user != null && user.getPassword().equals(password);
    }
}