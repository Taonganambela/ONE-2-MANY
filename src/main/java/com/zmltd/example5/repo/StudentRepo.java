package com.zmltd.example5.repo;

import com.zmltd.example5.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
}
