package com.sony.hackaton.womenmusic.controller;


import com.sony.hackaton.womenmusic.dao.Questionary;
import com.sony.hackaton.womenmusic.dao.User;
import com.sony.hackaton.womenmusic.implementation.QuestionaryImplement;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/quest")
public class QuestionaryController {

    @PostMapping(value = "/result")
    public String checkResult(@RequestBody Questionary quest){

        try{

            QuestionaryImplement imp = new QuestionaryImplement();
            return imp.generateVoc(quest);

        }catch (Exception e){
            return "Problema - Causa:" + e.getMessage();

        }


    }

}
