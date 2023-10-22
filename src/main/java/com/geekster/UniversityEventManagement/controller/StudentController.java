package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Department;
import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

//    Add student

    @PostMapping("student")
    public String addStudent(@Valid @RequestBody Student student) {
        return studentService.addStudent(student);
    }
    //    update student department
    @PutMapping("/{id}/department")
    public String updateStudentDepartment(@PathVariable Long id, @RequestParam Department department) {
        return studentService.updateStudentDepartment(id, department);
    }
    //    delete student
    @DeleteMapping("student/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
    //    Get all students
    @GetMapping("students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    //    Get student by Id
    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
}
