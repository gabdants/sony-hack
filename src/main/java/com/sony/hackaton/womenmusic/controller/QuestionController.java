package com.sony.hackaton.womenmusic.controller;

import com.sony.hackaton.womenmusic.dao.AnswerPoints;
import com.sony.hackaton.womenmusic.dao.QuestionPoints;
import com.sony.hackaton.womenmusic.dao.User;
import com.sony.hackaton.womenmusic.repository.AnswerRepository;
import com.sony.hackaton.womenmusic.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionRepository QuestionRepository;

    @Autowired
    AnswerRepository AnswerRepository;

    @PostMapping(value = "/create")
    public String createQuestion(@RequestBody QuestionPoints question){

        try{
            question.setPoints("20");
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
            QuestionRepository.save(question);

            return "questao"+ question + " criada";

        }catch (Exception e){
            return "questao nao criada" + e.getMessage();
        }



    }
}
