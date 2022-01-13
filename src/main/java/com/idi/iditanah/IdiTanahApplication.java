package com.idi.iditanah;

import com.idi.iditanah.model.Address;
import com.idi.iditanah.model.AddressDTO;
import com.idi.iditanah.model.MyDao;
import com.idi.iditanah.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan(basePackages = {"com.idi.model","root of the project package, don't forget"})
public class IdiTanahApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(IdiTanahApplication.class, args);
        MyDao myDao = context.getBean(MyDao.class);
        Address address = Address.builder().streetName("Rotshild").build();
        AddressDTO address2 = AddressDTO.builder().streetName("Hertzel").build();
        myDao.savePerson(Person.builder().mainAdrress(address2).age(20).address(address).name("Misha").build());
        System.out.println();
    }

}
