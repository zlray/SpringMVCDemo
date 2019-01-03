package com.zl.springmvc.controller;


import com.zl.springmvc.dao.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    //
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute Student student, ModelMap modelMap) {
        modelMap.addAttribute("name", student.getName());
        modelMap.addAttribute("age", student.getAge());
        modelMap.addAttribute("id", student.getId());
        //渲染result.jsp
        return "result";
    }
}
