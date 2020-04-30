/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import javax.persistence.*;

/**
 *
 * @author ishan
 */
@Entity
public class employee {
    @Id
    @GeneratedValue
   
    private long e_id;
 private String name,address,gender,contact,joining_date,adhar_number,age,blood_group,post;
 private int salary;
@Column(unique=true,nullable=false)
String user_name;
    public employee(String adhar_number,String age,String  blood_group,String contact, String gender,String joining_date,String name,int salary,String user_name,String post) {
       this.post=post;
        this.name = name;
        this.user_name = user_name;

        this.gender = gender;
        this.contact = contact;
        this.joining_date = joining_date;
        this.salary = salary;
        this.adhar_number = adhar_number;
        this.age = age;
        this.blood_group = blood_group;
    }
   
    public long getE_id() {
        return e_id;
    }

    public void setE_id(long e_id) {
        this.e_id = e_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(String joining_date) {
        this.joining_date = joining_date;
    }

    public String getAdhar_number() {
        return adhar_number;
    }

    public void setAdhar_number(String adhar_number) {
        this.adhar_number = adhar_number;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
    
}
