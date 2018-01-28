package com.tomasoft.genealogy.boot;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@SpringBootApplication(scanBasePackages = {"com.tomasoft.genealogy"})
//@ImportResource({"/WEB-INF/spring/profile.xml","/WEB-INF/spring/database.xml"})
public class Initialiser {

    public static void main(String[] args){
        //SpringApplication.run(Initialiser.class,args);
        System.out.println("BOOT LOADED");
    }
}
