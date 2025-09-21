package com.student.student.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.student.student.StudentRepository;
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

    public void deleteStudent(Long studentRoll){
        studentRepository.deleteById(String.valueOf(studentRoll));
    }

    public List<StudentModel> updateStudentbulk(List<StudentModel> students){
        return studentRepository.saveAll(students);
    }

    public List<StudentModel> addStudentbulk(List<StudentModel> students){
        return studentRepository.saveAll(students);
    }

    public void deleteStudentbulk(List<Long> studentRolls){
        for(Long studentRoll : studentRolls){
            studentRepository.deleteById(String.valueOf(studentRoll));
        }
    }
}
