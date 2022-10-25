package com.ouzinemDev.courseinfo.repository;

import com.ouzinemDev.courseinfo.domain.Course;

import java.util.List;

public interface courseRepository {
    void saveCourse(Course course);

    List<Course> getAllCourses();
}
