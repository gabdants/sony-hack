package com.sony.hackaton.womenmusic.implementation;

import com.sony.hackaton.womenmusic.dao.User;
import com.sony.hackaton.womenmusic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserImplementation {

    @Autowired
    private UserRepository UserRepository;

    public String createUser(User user){

        try{

            UserRepository.save(user);

        }catch (Exception e){
            return "Usuario nao Criado - Causa:" + e.getMessage();
        }
        return "Usuario Criado";
    }

}
