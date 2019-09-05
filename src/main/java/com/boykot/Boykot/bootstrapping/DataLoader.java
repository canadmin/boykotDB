package com.boykot.Boykot.bootstrapping;

import com.boykot.Boykot.dao.RoleRepository;
import com.boykot.Boykot.model.Role;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {

        Role role = new Role();
        role.setRole("USER");

        this.roleRepository.save(role);

        Role role2 = new Role();
        role2.setRole("ADMIN");

        this.roleRepository.save(role2);

    }
}
