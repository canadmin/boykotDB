package com.boykot.Boykot.dao;

import com.boykot.Boykot.model.Boycott;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoycottRepository extends JpaRepository<Boycott,Integer> {

}
