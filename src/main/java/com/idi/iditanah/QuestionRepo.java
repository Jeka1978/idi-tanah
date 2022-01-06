package com.idi.iditanah;

import com.idi.iditanah.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Evgeny Borisov
 */
public interface QuestionRepo extends JpaRepository<Question,Integer> {
}
