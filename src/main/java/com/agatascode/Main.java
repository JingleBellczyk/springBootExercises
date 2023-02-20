package com.agatascode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
/*
//to zastepuje wszyskie 3:
@ComponentScan(basePackages = "com.agatascode")
@EnableAutoConfiguration
@Configuration
 */
//Kubus jest supi
@RestController // jesli w tej klasie jakas metoda ma jakakolwiek adnotacje z "mapping"
//beda uznane za rest endpoints
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
    @GetMapping(path ="/greet")
    public GreetResponse greet(){
        return new GreetResponse("hello", List.of("java", "c++","scala"),new Person("Agata",20,2000.0));
    }

    record GreetResponse(String greet,
                         List<String> favProgrLang,
                         Person person){}
    record Person(String name, int age, double savings){}
//    class GreetResponse{
//        private final String greet;
//
//        public GreetResponse(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public int hashCode() {
//            return super.hashCode();
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//            return super.equals(obj);
//        }
//
//        @Override
//        public String toString() {
//            return super.toString();
//        }
//    }
}
