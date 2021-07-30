package com.social.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class User {
    private String id;
    private String password;
    private String name;
    private String phone;
    private int schoolgrade;
    private int schoolclass;
    private int schoolnumber;
    private String role;
    private int year;
    private Date birth;
}
