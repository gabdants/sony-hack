package com.sony.hackaton.womenmusic.repository;


import com.sony.hackaton.womenmusic.dao.UserDAO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDAO, String> {

    UserDAO findByName(String name);


}

