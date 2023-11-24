package com.student.reg.service;

import org.springframework.stereotype.Component;

@Component
public class StudentAgeEligibilityService {

    boolean isAgeValid(int age){
        return age>=16;
    }
}
