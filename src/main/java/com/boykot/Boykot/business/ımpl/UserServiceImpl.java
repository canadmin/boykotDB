package com.boykot.Boykot.business.ımpl;

import com.boykot.Boykot.business.UserService;
import com.boykot.Boykot.dao.UserRepository;
import com.boykot.Boykot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void registerUser(User user) {
        User regUser=new User();
        regUser.setFullName(user.getFullName());
        regUser.setEmail(user.getEmail());
        regUser.setROLE("member");
        regUser.setPassword(encoder(user.getPassword()));
        userRepository.save(regUser);
    }

    @Override
    public void loginUser(User user) {

    }

    private String encoder(String password){
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(password);
    }

}
