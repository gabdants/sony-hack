package com.sony.hackaton.womenmusic.controller;


import com.sony.hackaton.womenmusic.dao.User;
import com.sony.hackaton.womenmusic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository UserRepository;


    @PostMapping(value = "/create")
    public String createUser(@RequestBody User user){

        try{
            Date date = new Date();
            long timeMilli = date.getTime();
            String t = Long.toString(timeMilli);

            user.setIdUser(t.substring(1, 7));
            UserRepository.save(user);

        }catch (Exception e){
            return "Usuario nao Criado - Causa:" + e.getMessage();
        }
        return "Usuario Criado";

    }

}
