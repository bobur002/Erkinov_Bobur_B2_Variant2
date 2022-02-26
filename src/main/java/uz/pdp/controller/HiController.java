package uz.pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.pdp.model.Region;
import uz.pdp.model.Student;
import uz.pdp.model.User;

@Controller
public class HiController {
    Region region;

    User user ;

    @Autowired
    Student student;

//    @Autowired
    public HiController(Region region){
        this.region = region;
    }

    @Autowired
    public void setUser(User user) {
        this.user = user;
    }

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hiTest(){
        region.setName("toshkent");
        user.setId("123");
        student.setName("bobur");
        student.setRegion(region);
        System.out.println(student.getRegion().getName());
        System.out.println(student.getName());
        System.out.println(region.getName());
        System.out.println(user.getId());
        return "hi";
    }

}
