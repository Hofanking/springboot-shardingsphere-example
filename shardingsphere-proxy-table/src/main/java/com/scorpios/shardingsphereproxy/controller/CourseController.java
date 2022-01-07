package com.scorpios.shardingsphereproxy.controller;


import com.scorpios.shardingsphereproxy.entity.Course;
import com.scorpios.shardingsphereproxy.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;


    @PostMapping("/saveCourse")
    public void saveCourse(@RequestBody Course course){
        courseService.saveCourse(course);
    }

    @PostMapping("/getCourseByCourseId")
    public List<Course> getCourseByCourseId(Long courseId){
       return courseService.getCourseByCourseId(courseId);
    }

    @PostMapping("/getAllCourse")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

}
