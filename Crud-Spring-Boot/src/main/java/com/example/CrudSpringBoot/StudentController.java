package com.example.CrudSpringBoot;

import com.example.CrudSpringBoot.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private  StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //get all students
    @RequestMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

//    //get student by id
    @RequestMapping("/students/{id}")
    public void getStudent(@PathVariable String id){
         studentService.getStudent(id);
    }

    //add student in here we should define method post
    @RequestMapping(method = RequestMethod.POST,value="/students")

    //because student is an object
    public void addStudent(@RequestBody Student student){
      studentService.addStudent(student);
    }

//    //update student using id
    @RequestMapping(method = RequestMethod.PUT,value="/students/{id}")
    //because student is an object
    public void updateStudent(@RequestBody Student student,@PathVariable String id){
        studentService.updateStudent(id,student);
    }
//    //delete student
    @RequestMapping(method = RequestMethod.DELETE,value = "/students/{id}")
    public  void deleteStudent(@PathVariable String id){
        studentService.deleteStudent(id);

    }



}
