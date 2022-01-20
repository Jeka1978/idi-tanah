package com.idi.iditanah;

import com.idi.idiinfrastarter.FrontendController;
import com.idi.iditanah.model.Person;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Evgeny Borisov
 */
@FrontendController
public class HumanController {

    @GetMapping("/human")
    public Human getHuman(){
        return Human.builder().name("Moshe").age(120).build();
    }
}
