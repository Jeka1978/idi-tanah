package com.idi.iditanah.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Repository
public class MyDao {

    @Autowired
    private EntityManager entityManager;


    @Transactional
    public void doX() {
        Query query = entityManager.createQuery("from person where age>:x");
        List<Person> list = query.setParameter("x", 20).setMaxResults(10).setFirstResult(50).getResultList();
        list.forEach(person -> person.setAge(120));

    }

    @Transactional
    public Person getPerson() {
        return (Person) entityManager.createQuery("from Person").getSingleResult();
    }

    @Transactional
    public List<Person> findAll() {
        return entityManager.createQuery("from Person").getResultList();
    }


    @Transactional
    public void savePerson(Person person) {
        person.setAge(20);
        entityManager.persist(person);
        person.setAge(40);
    }

}
