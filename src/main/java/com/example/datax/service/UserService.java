    package com.example.datax.service;

    import java.util.List;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import com.example.datax.model.User;
    import com.example.datax.repository.UserRepository;

    @Service
    public class UserService {
        @Autowired
        private UserRepository userRepository;

        public List<User> getAll(){
            return userRepository.findAll();
        }
        
        
    }
