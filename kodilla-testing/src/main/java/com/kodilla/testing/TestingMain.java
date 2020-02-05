package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
import com.sun.javaws.IconUtil;

import java.sql.SQLOutput;

import static com.kodilla.testing.calculator.Calculator.*;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result= simpleUser.getUserName();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int resultCalculator= calculator.add(4,4);

        if (resultCalculator==a+b){
            System.out.println("test OK");
        }else{
            System.out.println("error!");
        }

    }
}
