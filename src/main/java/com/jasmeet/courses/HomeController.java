package com.jasmeet.courses;

import com.jasmeet.courses.model.Inquiry;
import com.jasmeet.courses.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model){
        Inquiry inquiry = new Inquiry();
        model.addAttribute(inquiry);
        return "index.html";
    }

    @GetMapping("/about")
    public String about(){
        return "about.html";
    }

    @PostMapping("/course")
    public String searchCourse(Model model, @ModelAttribute Inquiry inquiry){
        String courseName = inquiry.getSearchString();
        model.addAttribute("courses", homeService.searchCourses(courseName));
        return "courses.html";
    }
}