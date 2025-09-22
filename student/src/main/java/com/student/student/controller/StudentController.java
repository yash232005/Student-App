package com.student.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;


import com.student.student.model.StudentModel;
import com.student.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getall")
    public List<StudentModel> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/bulk")
    public List<StudentModel> addStudentbulk(@RequestBody List<StudentModel> students){
        return studentService.addStudentbulk(students);
    }

    @PutMapping("/bulk")
    public List<StudentModel> updateStudentbulk(@RequestBody List<StudentModel> students){
        return studentService.updateStudentbulk(students);
    }

    @DeleteMapping("/{studentRoll}")
    public void deleteStudent(@PathVariable String studentRoll){
        studentService.deleteStudent(studentRoll);
    }

}
