package com.newton.holidaymaker.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    private int customer_id;
    private String first_name;
    private String last_name;
    private int phone_no;
    private String email;
    private String username;
    private String password;
    private Roll roll;

    public User(String first_name, String last_name, int phone_no, String email, String username, String password,
            Roll roll) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_no = phone_no;
        this.email = email;
        this.username = username;
        this.password = password;
        this.roll = roll;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roll getRoll() {
        return roll;
    }

    public void setRoll(Roll roll) {
        this.roll = roll;
    }

    

    


}
