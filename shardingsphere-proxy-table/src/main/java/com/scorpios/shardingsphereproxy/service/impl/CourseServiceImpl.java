package com.scorpios.shardingsphereproxy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.scorpios.shardingsphereproxy.entity.Course;
import com.scorpios.shardingsphereproxy.mapper.CourseDao;
import com.scorpios.shardingsphereproxy.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {


    @Autowired
    CourseDao courseDao;

    @Override
    public void saveCourse(Course course) {
        courseDao.insert(course);
    }

    @Override
    public List<Course> getCourseByCourseId(Long cid) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("cid",cid);
        List<Course> course = courseDao.selectList(queryWrapper);
        System.out.println(course);
        return course;
    }

    @Override
    public List<Course> getAllCourse() {
        List<Course> courses = courseDao.selectList(null);
        return courses;
    }


}
