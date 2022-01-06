package com.idi.iditanah;

import com.idi.iditanah.model.MyDao;
import com.idi.iditanah.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IdiTanahApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(IdiTanahApplication.class, args);
        MyDao myDao = context.getBean(MyDao.class);
        myDao.savePerson(Person.builder().age(20).name("Misha").build());
        System.out.println();
    }

}
