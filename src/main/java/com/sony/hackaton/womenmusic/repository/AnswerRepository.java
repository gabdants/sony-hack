package com.sony.hackaton.womenmusic.repository;

import com.sony.hackaton.womenmusic.dao.AnswerPoints;
import com.sony.hackaton.womenmusic.dao.QuestionPoints;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnswerRepository extends MongoRepository<AnswerPoints, String> {

    AnswerPoints findByUsername(String username);


}

