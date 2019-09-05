package com.boykot.Boykot.business.ımpl;

import com.boykot.Boykot.business.BoycottService;
import com.boykot.Boykot.dao.BoycottRepository;
import com.boykot.Boykot.model.Boycott;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoycottServiceImpl implements BoycottService {

    private BoycottRepository boycottRepository;

    @Autowired
    public BoycottServiceImpl(BoycottRepository boycottRepository) {
        this.boycottRepository = boycottRepository;
    }

    @Override
    public List<Boycott> getAllBoycott() {
        return boycottRepository.findAll();
    }

    @Override
    public void addBoycott(Boycott boycott) {
        boycottRepository.save(boycott);
    }
}
