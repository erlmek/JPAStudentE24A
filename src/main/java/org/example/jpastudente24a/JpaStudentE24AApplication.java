package org.example.jpastudente24a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaStudentE24AApplication {


    public static final Logger logger = LoggerFactory.getLogger(
            JpaStudentE24AApplication.class
    );


    public static void main(String[] args) {
        SpringApplication.run(JpaStudentE24AApplication.class, args);
    }

}
