package com.example.CrudSpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;


@Service
public class StudentService {
    //inject repository
    @Autowired
    private  StudentRepository studentRepository;

    //creating mutable array using new Arraylist<>();
//    private List<Student> students = new ArrayList<>(Arrays.asList(
//            new Student(1,"kavindya","CS",2000),
//            new Student(2,"kavindya","CS",2000),
//            new Student(3,"kavindya","CS",2000)
//
//    ));

    //get all students (calling service)
    public List<Student> getAllStudents(){
        //return  students;
        List<Student> students=new ArrayList<>();
        studentRepository.findAll()
        .forEach(students::add);
        return  students;
    }

    //get a student using filtered by id
    public Student getStudent(String id){
       //return students.stream().filter(t->t.getId().equals(id)).findFirst().get();
        return studentRepository.findById(id).get();

    }

    //add student
    public void addStudent(Student student){
      studentRepository.save(student);
    }

    //update particular student
    public void updateStudent(String id, Student student) {
    //        for(int i=0;i<students.size(); i++){
    //            Student t=students.get(id);
    //            if(t.getId().equals(id)){
    //                students.set(i,student);
    //                return;
    //            }
    //
    //        }
        studentRepository.save(student);
    }

    //delete a student
    public void deleteStudent(String id) {
        //students.removeIf(t->t.getId().equals(id));
        studentRepository.deleteById(id);
    }
}
