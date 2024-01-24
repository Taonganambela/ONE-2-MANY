package com.zmltd.example5.service;

import com.zmltd.example5.entity.StudentEntity;
import com.zmltd.example5.pojo.RequestBody;
import com.zmltd.example5.repo.CourseRepo;
import com.zmltd.example5.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class StudentService {

    private final StudentRepo _studentRepo;
    private final CourseRepo _courseRepo;
    private ResponseEntity<?> responseEntity;


    public ResponseEntity<?> saveStudent(RequestBody _requestBody){
        _courseRepo.findById(_requestBody.getId()).ifPresentOrElse( course -> {
            StudentEntity s = new StudentEntity();
            s.setName(_requestBody.getName());
            s.setGrade(_requestBody.getGrade());
            s.set_courseEntity(course);
            responseEntity = ResponseEntity.ok(_studentRepo.save(s));
        }, () -> responseEntity = ResponseEntity.status(404).body("Not Found")
        );


        return responseEntity;
    }

}