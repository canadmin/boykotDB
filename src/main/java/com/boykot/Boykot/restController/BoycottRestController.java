package com.boykot.Boykot.restController;


import com.boykot.Boykot.business.BoycottService;
import com.boykot.Boykot.model.Boycott;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class BoycottRestController {

    @Autowired
    private BoycottService boycottService;

    @RequestMapping("/getcurrentboycott")
    public List<Boycott> getAllBoycott(){
        return this.boycottService.getAllBoycott();
    }

}
