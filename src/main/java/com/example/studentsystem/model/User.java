package com.example.studentsystem.model;


import javax.persistence.*;
import java.time.LocalDate;


@Entity // @Entity的Bean是告訴Spring這是數據模型層的宣告 This tells Hibernate to make a table out of this class
@Table(name = "user_sequence") // Table的name對映到資料庫中的資料表名稱
public class User {

    @Id // 是此資料表的Primary Key
    @GeneratedValue( // 告訴此Column的生成方式 ,如果設定成GenerationType.AUTO讓容器來自動產生
            strategy= GenerationType.AUTO
    )

    private Long id;
    private String email;
    private String name;
    private LocalDate date_of_birth;
    private Integer age;


    // 初始化建立 constructor


    public User() {
    }


    public User(String email, String name, LocalDate date_of_birth, Integer age) {
        this.email = email;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.age = age;
    }


    public User(Long id, String email, String name, LocalDate date_of_birth, Integer age) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.age = age;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", age=" + age +
                '}';
    }
}
