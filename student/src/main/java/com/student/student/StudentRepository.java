package com.student.student;

import org.springframework.data.jpa.repository.JpaRepository;
import com.student.student.model.StudentModel;


public interface StudentRepository extends JpaRepository<StudentModel, String> {

}
