package com.student.reg.repository;

import org.springframework.stereotype.Component;

@Component
public class StudentDBRepository {
    public void Saved(String message){
        System.out.println("Student "+message+" : Saved");
    }
}
