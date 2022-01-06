package com.idi.iditanah;

import com.idi.iditanah.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@RestController
public class TanahController {

    @Autowired
    private QuestionRepo repo;

    @GetMapping("/api/questions/random")
    public List<Question> getRandomQuestions(@RequestParam int amount) {

        List<Question> all = repo.findAll();

        Collections.shuffle(all);


        return all.subList(0,amount);
    }

}
