package com.idi.iditanah;

import com.idi.iditanah.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * @author Evgeny Borisov
 */
@Component
public class DBFiller {

    @Autowired
    private QuestionRepo repo;

    @EventListener(ContextRefreshedEvent.class)
    @Transactional
    protected void initDB() {
        repo.save(Question.builder().question("a").answer("b").build());
        repo.save(Question.builder().question("s").answer("b").build());
        repo.save(Question.builder().question("d").answer("b").build());
        repo.save(Question.builder().question("g").answer("b").build());
        repo.save(Question.builder().question("h").answer("b").build());
        repo.save(Question.builder().question("j").answer("b").build());
        repo.save(Question.builder().question("k").answer("b").build());
    }

}
