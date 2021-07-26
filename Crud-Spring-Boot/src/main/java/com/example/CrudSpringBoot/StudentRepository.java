package com.example.CrudSpringBoot;

import org.springframework.data.repository.CrudRepository;

//createRepository has generic TYpe <>
public  interface StudentRepository extends CrudRepository <Student, String> {


}
