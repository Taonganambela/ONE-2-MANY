package com.zmltd.example5.controller;

import com.zmltd.example5.entity.StudentEntity;
import com.zmltd.example5.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Student_one_to_many")
@RequiredArgsConstructor

public class StudentController {
    private final StudentService _studentService;

    @PostMapping("/Save_Student")
    public ResponseEntity<?> _student(@RequestBody com.zmltd.example5.pojo.RequestBody _rb){
        return _studentService.saveStudent(_rb);
    }
}
