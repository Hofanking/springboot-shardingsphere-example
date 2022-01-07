package com.scorpios.shardingsphere.service;

import com.scorpios.shardingsphere.entity.Course;

import java.util.List;

public interface CourseService {


    public void saveCourse(Course course);

    public List<Course> getCourseByCourseId(Long cid);

    List<Course> getAllCourse();
}
