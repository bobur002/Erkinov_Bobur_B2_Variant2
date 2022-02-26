package uz.pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.pdp.model.Student;

@Controller
@RequestMapping(value = "/test")
public class HelloController {

    @Autowired
    Student student;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String testMV(){
        System.out.println(student.hashCode());
        return "/hello";
    }


}
