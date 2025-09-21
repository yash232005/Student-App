package com.student.student.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentModel {
    
    @Id
    private String studentName;
    private String studentBranch;
    private Long studentRoll;
    private double studentCGPA;

    public StudentModel(String studentName , String studentBranch , Long studentRoll , double studentCGPA){

        this.studentName = studentName;
        this.studentBranch = studentBranch;
        this.studentRoll = studentRoll;
        this.studentCGPA = studentCGPA;
    }

    public StudentModel(){

        this.studentName = "UNKNOWN";
        this.studentBranch = "UNKNOWN";
        this.studentRoll = 0L;
        this.studentCGPA = 0.0;
    }

    // public String getStudentName(){
    //     return studentName;
    // }
    // void setStudentName(String studentName){
    //     this.studentName = studentName;
    // }

    // public String getStudentBranch(){
    //     return studentBranch;
    // }
    // void setStudentBranch(String studentBranch){
    //     this.studentBranch = studentBranch;
    // }

    // public Long getStudentRoll(){
    //     return studentRoll;
    // }
    // void setStudentRoll(Long studentRoll){
    //     this.studentRoll = studentRoll;
    // }

    // public double getStudentCGPA(){
    //     return studentCGPA;
    // }
    // void setStudentCGPA(double studentCGPA){
    //     this.studentCGPA = studentCGPA;
    // }
}
