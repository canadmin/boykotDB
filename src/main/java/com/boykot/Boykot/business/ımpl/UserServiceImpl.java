package com.boykot.Boykot.business.ımpl;

import com.boykot.Boykot.business.UserService;
import com.boykot.Boykot.dao.RoleRepository;
import com.boykot.Boykot.dao.UserRepository;
import com.boykot.Boykot.model.Role;
import com.boykot.Boykot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void registerUser(User user) {
        User regUser = new User();
        regUser.setFullName(user.getFullName());
        regUser.setEmail(user.getEmail());
        regUser.setPassword(encoder(user.getPassword()));
        regUser.setActive(1);
        Role role = this.roleRepository.findByRole("USER");
        regUser.setRoles(new HashSet<>(Arrays.asList(role)));
        userRepository.save(regUser);
    }

    @Override
    public void loginUser(User user) {

    }

    private String encoder(String password) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(password);
    }


}
