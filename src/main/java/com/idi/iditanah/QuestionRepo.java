package com.idi.iditanah;

import com.idi.iditanah.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@RestResource(path = "qqq")
public interface QuestionRepo extends JpaRepository<Question,Integer> {
}
