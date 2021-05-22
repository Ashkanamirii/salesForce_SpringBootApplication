package com.example.salesforce.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Ashkan Amiri
 * Date:  2021-05-22
 * Time:  12:04
 * Project: salesForce
 * Copyright: MIT
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;
    private String emailId;


}
