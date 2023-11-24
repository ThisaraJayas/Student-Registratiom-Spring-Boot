package com.student.reg.service;

import com.student.reg.model.Student;
import com.student.reg.repository.StudentDBRepository;
import com.student.reg.service.StudentAgeEligibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentRegistrationService {

    @Autowired
    private StudentAgeEligibilityService ageEligible;
    @Autowired
    private StudentDBRepository studentDB;
    public String Register(Student student){
        if(ageEligible.isAgeValid(student.getAge())){
            studentDB.Saved(student.getName());
            return "Student "+student.getName()+ " Registration Successful";
        }
        return "Not Valid Age "+student.getName()+" Registration unSuccessful";
    }
}
