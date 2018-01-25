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
        String display = "";

        //Start of my for loop

        for (i = 1; i <= 100; i++) {
            rawBuzzResults = i % 3;
            rawFizzResults = i % 5;

            if ((rawBuzzResults == 0) && (rawFizzResults == 0)) {
                System.out.print("FizzBuzz");
                //String numberFizzBuzz = "Fizzbuzz";
                display = display + "FizzBuzz";
            } else if (rawBuzzResults == 0) {
                System.out.print("Fizz");
               // String numberFizz = "Fizz";
                display = display + "Fizz";
            } else if (rawFizzResults == 0) {
                System.out.print("Buzz");
                //String numberBuzz = "Buzz";
                display = display + "Buzz";
            }
           else {

                System.out.print(i);
                display = display + i;
                }

        } // End of loop


        return display ; //"numberFizzBuzz" + " " + "numberFizz" + " " + "numberBuzz";
    }
    }

