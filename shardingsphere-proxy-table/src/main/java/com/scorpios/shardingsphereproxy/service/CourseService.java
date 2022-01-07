package com.scorpios.shardingsphereproxy.service;

import com.scorpios.shardingsphereproxy.entity.Course;

import java.util.List;

public interface CourseService {


    public void saveCourse(Course course);

    public List<Course> getCourseByCourseId(Long cid);

    List<Course> getAllCourse();
}
