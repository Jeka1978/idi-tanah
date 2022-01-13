package com.idi.iditanah.model;

import lombok.*;

import javax.persistence.*;

/**
 * @author Evgeny Borisov
 */
@Entity
/*@EqualsAndHashCode(exclude = "id")
@Getter
@Setter
@ToString*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue
    private int addressId;
    private String streetName;



}
