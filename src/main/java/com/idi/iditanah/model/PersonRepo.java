package com.idi.iditanah.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface PersonRepo extends JpaRepository<Person, Integer> {
    List<Person> findByAgeGreaterThan(int age);

  /*  List<Person> findByAgeBetweenAndAddressesStartsWith(int min, int max, String a);

    @Query("from Person where ")
    List<Person> veryComplicatedQuery();


    default List<Person> get3Person() {
        return findByAgeGreaterThan(10).subList(0, 3);//don't do this if you need pagination, you just have it
    }*/

}
