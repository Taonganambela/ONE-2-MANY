package com.zmltd.example5.repo;

import com.zmltd.example5.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {
}
