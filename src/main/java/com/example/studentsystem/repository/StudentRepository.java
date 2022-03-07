package com.example.studentsystem.repository;

import com.example.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JPA Repository takes 1. Name of the model 2. Type of the primary key
// 全名Java Persistence API, 通過註解或XML描述, 來指定對象與關係表之間的映射關係(Mapping), 並將實體對象持久化到資料庫中
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
