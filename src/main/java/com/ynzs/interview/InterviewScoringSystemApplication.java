package com.ynzs.interview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ynzs.interview.mapper")
public class InterviewScoringSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewScoringSystemApplication.class, args);
    }

}
