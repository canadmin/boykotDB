package com.boykot.Boykot.business;

import com.boykot.Boykot.model.Boycott;

import java.util.List;

public interface BoycottService {

    List<Boycott> getAllBoycott();

    void addBoycott(Boycott boycott);


}
