package com.boykot.Boykot.dao;

import com.boykot.Boykot.model.Boycott;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoycottRepository extends JpaRepository<Boycott,Long> {
}
