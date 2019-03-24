package com.sony.hackaton.womenmusic.repository;


import com.sony.hackaton.womenmusic.dao.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByUserName(String username);


}

