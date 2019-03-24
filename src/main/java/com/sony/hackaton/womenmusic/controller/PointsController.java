package com.sony.hackaton.womenmusic.controller;

import com.sony.hackaton.womenmusic.dao.Questionary;
import com.sony.hackaton.womenmusic.dao.User;
import com.sony.hackaton.womenmusic.implementation.QuestionaryImplement;
import com.sony.hackaton.womenmusic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/points")
public class PointsController {

    @Autowired
    private UserRepository UserRepository;

    @GetMapping(value = "/add")
    public String checkResult(@RequestParam(name = "userName") String userName, @RequestParam(name = "points") String points){

        try{
            User user = UserRepository.findByUserName(userName);
            int x = Integer.parseInt(user.getPoints()) + Integer.parseInt(points);
            user.setPoints(Integer.toString(x));
            UserRepository.delete(user);
            UserRepository.save(user);


        }catch (Exception e){
            return "Problema - Causa:" + e.getMessage();

        }

        return "Adicionados " + points + " pontos ao usuario " + userName;
    }
}
