package com.sony.hackaton.womenmusic.controller;

import com.mongodb.WriteResult;
import com.sony.hackaton.womenmusic.dao.AnswerPoints;
import com.sony.hackaton.womenmusic.dao.QuestionPoints;
import com.sony.hackaton.womenmusic.dao.User;
import com.sony.hackaton.womenmusic.repository.AnswerRepository;
import com.sony.hackaton.womenmusic.repository.QuestionRepository;
import com.sony.hackaton.womenmusic.repository.UserRepository;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionRepository QuestionRepository;

    @Autowired
    AnswerRepository AnswerRepository;

    @Autowired
    private UserRepository UserRepository;

    @PostMapping(value = "/create")
    public String createQuestion(@RequestBody QuestionPoints question){

        try{
            Date date = new Date();
            long timeMilli = date.getTime();
            String t = Long.toString(timeMilli);

            question.setPoints("20");
            question.setIdQuestion(t.substring(3, 6));

            User user = UserRepository.findByUserName(question.getUsername());
            user.setPoints(question.getPoints());
            UserRepository.save(user);

            QuestionRepository.save(question);
        }catch (Exception e){
            return "questao nao criada" + e.getMessage();
        }
        return "questao criada";

    }

    @PostMapping(value = "/answer")
    public String answerQuestion(@RequestParam(name = "idQuestion") String idQuestion, @RequestBody AnswerPoints answer){

        try{
            answer.setIdQuestion(idQuestion);
            answer.setPoints("20");
            AnswerRepository.save(answer);

            QuestionPoints question = new QuestionPoints();
            question = QuestionRepository.findByIdQuestion(idQuestion);
            int po = Integer.parseInt(question.getPoints()) + 20;
            question.setPoints(Integer.toString(po));

            User user = UserRepository.findByUserName(question.getUsername());
            int x = Integer.parseInt(user.getPoints()) + Integer.parseInt(question.getPoints());
            user.setPoints(Integer.toString(x));
            UserRepository.save(user);

            QuestionRepository.save(question);

            return "questao"+ question.getQuestion() + " respondida";

        }catch (Exception e){
            return "questao nao criada" + e.getMessage();
        }



    }
}
