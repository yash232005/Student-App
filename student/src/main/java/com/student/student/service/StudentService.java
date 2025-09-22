package com.student.student.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

// Ensure that StudentRepository exists at com.student.student.repository
import com.student.student.Repository.StudentRepository;
import com.student.student.model.StudentModel;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentModel> getAllStudents(){
        return studentRepository.findAll();
    }

    public StudentModel addStudent(StudentModel student){
        return studentRepository.save(student);
    }

    public StudentModel updateStudent(StudentModel student){
        return studentRepository.save(student);
    }

    public void deleteStudent(String studentRoll){
        studentRepository.deleteById(studentRoll);
    }

    public List<StudentModel> updateStudentbulk(List<StudentModel> students){
        return studentRepository.saveAll(students);
    }

    public List<StudentModel> addStudentbulk(List<StudentModel> students){
        return studentRepository.saveAll(students);
    }

    public void deleteStudentbulk(List<String> studentRolls){
        for(String studentRoll : studentRolls){
            studentRepository.deleteById(studentRoll);
        }
    }
}
