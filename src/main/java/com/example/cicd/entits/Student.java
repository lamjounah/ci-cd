package com.example.cicd.entits;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
//@JsonSerialize(using = CustomStudentSerializer.class)
public class Student {
    int id ,status;
    String message;
}
