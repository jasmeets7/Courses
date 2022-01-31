package com.jasmeet.courses.service;

import com.jasmeet.courses.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {
    public List<Course> searchCourses(String courseName){
        List<Course> courses= new ArrayList<Course>();
        Course course = new Course(1111, courseName, "Lorem Ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        courses.add(course);
        return courses;
    }
}
