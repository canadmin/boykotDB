package com.boykot.Boykot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Boycott {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String boycotted;
    private String reason;
    private String byWhom;


}
