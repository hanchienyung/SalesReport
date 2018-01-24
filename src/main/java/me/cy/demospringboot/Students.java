package me.cy.demospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Students {


    @RequestMapping("/Student")
    public String showIndex()
    {
        String userName="";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name: ");
        userName = keyboard.nextLine();
        String greet = "Hello "+userName;
        System.out.println(greet);

        return greet;
    }


}
