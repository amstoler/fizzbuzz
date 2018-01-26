package com.example.fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/bonus")
    public String ShowFizzBuzz() {

        //Initializing variables

        int multiples_7;
        int multiples_17;
        int multiples_23;
        int i;
        int counter_7=0;
        int counter_17=0;
        int counter_23=0;

        String display = "";

        int userValue; // Stores user number selected for Bonus problem
        Scanner keyboard = new Scanner(System.in);

        userValue = keyboard.nextInt();
        System.out.println(userValue);

        //Start of my for loop

        for (i = 1; i <= userValue; i++) {


            multiples_7 = i % 7;
            multiples_17 = i % 17;
            multiples_23 = i % 23;


            if (multiples_7 == 0)  {
                counter_7 = counter_7 +1;


            } else if (multiples_17 == 0) {
                counter_17 = counter_17 +1;

            } else if (multiples_23 == 0) {
                counter_23 = counter_23 +1;

            }
            else {


            }

        } // End of loop
        display = "This is the counter for mutiple 7" + counter_7 + "This is...." + counter_17 + "This is..." + counter_23;


        return display ; //"numberFizzBuzz" + " " + "numberFizz" + " " + "numberBuzz";
    }

    @RequestMapping("/bonus")
    public String ShowFizzBuzz() {

        //Initializing variables

        int multiples_7;
        int multiples_17;
        int multiples_23;
        int i;
        int counter_7=0;
        int counter_17=0;
        int counter_23=0;

        String display = "";

        int userValue; // Stores user number selected for Bonus problem
        Scanner keyboard = new Scanner(System.in);

        userValue = keyboard.nextInt();
        System.out.println(userValue);

        //Start of my for loop

        for (i = 1; i <= userValue; i++) {


            multiples_7 = i % 7;
            multiples_17 = i % 17;
            multiples_23 = i % 23;


            if (multiples_7 == 0)  {
                counter_7 = counter_7 +1;


            } else if (multiples_17 == 0) {
                counter_17 = counter_17 +1;

            } else if (multiples_23 == 0) {
                counter_23 = counter_23 +1;

            }
           else {


                }

        } // End of loop
            display = "This is the counter for mutiple 7" + counter_7 + "This is...." + counter_17 + "This is..." + counter_23;


        return display ; //"numberFizzBuzz" + " " + "numberFizz" + " " + "numberBuzz";
    }
    }

