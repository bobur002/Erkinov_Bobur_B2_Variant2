package uz.pdp;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.pdp.model.Student;

public class Main {

    public static void main(String[] args) {
          int id = 4;
          A a = new A();
        Gson gson = a.gson;
        String s = gson.toJson(id);
        System.out.println(s);
    }
}
