package com.student.reg.controller;

import com.student.reg.service.StudentRegistrationService;
import com.student.reg.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRegisterController {

    @Autowired
    private StudentRegistrationService rs;

@PostMapping("/students")
    public void Register(){
        Student s1 = new Student();
        s1.setId("s10");
        s1.setName("Thisara");
        s1.setAge(10);
        s1.setCourse("Java");

       String result = rs.Register(s1);
        System.out.println(result);

    }
}
