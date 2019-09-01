package com.boykot.Boykot.business.ımpl;

import com.boykot.Boykot.business.UserService;
import com.boykot.Boykot.dao.UserRepository;
import com.boykot.Boykot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void loginUser(User user) {

    }
}
