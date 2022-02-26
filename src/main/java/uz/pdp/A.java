package uz.pdp;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class A {
    @Autowired
    Gson gson;
    @Bean
    public Gson getA(){
        return new Gson();
    }
}
