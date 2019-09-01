package com.boykot.Boykot.business;

import com.boykot.Boykot.model.User;

public interface UserService {

    void registerUser(User user);

    void loginUser(User user);
}
