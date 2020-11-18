package com.example.springboot;

import java.util.Scanner;

public class UserInput {
    public static String getCityFromUser(){
        boolean isCityValid = false;
        String userInput = null;
        while (!isCityValid) {
            Scanner line = new Scanner(System.in);
            userInput = line.next();
            isCityValid = UserInput.verifyUserInput(userInput);
        }
        return userInput;
    }


    private static boolean verifyUserInput(String input){
        try {
            WeatherService.getWeatherFor(input);
            return true;
        } catch (Exception e) {
            System.out.println("Provided city is not valid, please provide city again");
            return false;
        }
    }
}
