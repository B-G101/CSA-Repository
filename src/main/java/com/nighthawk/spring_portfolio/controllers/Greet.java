package com.nighthawk.spring_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Greet {

    // @GetMapping handles GET request for /greet, maps it to greeting() method
    @GetMapping("/greet")
    // @RequestParam handles variables binding to frontend, defaults, etc
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model, Model model2, String number, Model model3, String number2) {
        
        int count = 0;
        int count2 = 0;
        // model attributes are visible to Thymeleaf when HTML is "pre-processed"
        model.addAttribute("name", name);
         //Counts each character except space    
        for(int i = 0; i < name.length(); i++) {    
            if(name.charAt(i) != ' ')    
                count++;    
        }

        for (int j = 0; j < name.length(); j++) {
            if (name.charAt(j) == 'a') {
                count2++;
            }
            else if (name.charAt(j) == 'e') {
                count2++;
            }
            else if (name.charAt(j) == 'i') {
                count2++;
            }
            else if (name.charAt(j) == 'o') {
                count2++;
            }
            else if (name.charAt(j) == 'u') {
                count2++;
            }
        }
        

        
        number = "Total number of characters in the name/phrase: " + count;
        number2 = "Total number of vowels in the name/phrase: " + count2;
        model2.addAttribute("number", number);
        model3.addAttribute("number2", number2);


        // load HTML VIEW (greet.html)
        return "greet"; 

    }

}