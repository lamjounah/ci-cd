package com.example.cicd.controller;

import com.example.cicd.entits.Student;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;
import java.util.List;


@RestController
@Controller
//@RequestMapping(path = "sa",produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController {

    @GetMapping(path = "sa"  , produces = MediaType.APPLICATION_JSON_VALUE)
    public  List<Object>    search(){

        return   List.of(new Student(1 ,1 ,"cc"));
    }
}
