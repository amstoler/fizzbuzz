package com.example.fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String ShowFizzBuzz() {

        //Initializing variables

        int rawFizzResults;
        int rawBuzzResults;
        int i;

        //Start of my for loop

        for (i = 0; i <= 100; i++) {
            rawBuzzResults = i % 3;
            rawFizzResults = i % 5;

            if( (rawBuzzResults == 0) && (rawFizzResults == 0)) {
                System.out.print("FizzBuzz");
            } else if (rawBuzzResults == 0) {
                System.out.print("Fizz");
            } else if (rawFizzResults == 0) {
                System.out.print("Buzz");
            }

        }
        return null;
    }
}
