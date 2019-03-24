package com.sony.hackaton.womenmusic.repository;

import com.sony.hackaton.womenmusic.dao.QuestionPoints;
import com.sony.hackaton.womenmusic.dao.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<QuestionPoints, String> {

    QuestionPoints findByIdQuestion(String idQuestion);


}

