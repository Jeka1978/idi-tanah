package com.idi.iditanah.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persons")
public class Person {

    @Embedded
    private AddressDTO mainAdrress;

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "FIRST_NAME")
    private String name;

//    @Basic(fetch = FetchType.LAZY)
    private int age;


    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)/*(fetch = FetchType.EAGER)*/
    @Singular
    //JoinColumn,JoinTable
    private List<Address> addresses;

}
