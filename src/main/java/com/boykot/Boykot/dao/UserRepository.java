package com.boykot.Boykot.dao;

import com.boykot.Boykot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
