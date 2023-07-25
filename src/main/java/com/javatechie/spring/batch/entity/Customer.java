package com.javatechie.spring.batch.entity;

import java.util.logging.Logger;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {


    private int id;

    
    private String firstName;
    

    private String lastName;
    

    private String email;
    

    private String gender;
    

    private String contactNo;
    

    private String country;
    

    private String dob;


}
