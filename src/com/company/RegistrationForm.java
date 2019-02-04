package com.company;
import java.util.Scanner;

public class RegistrationForm {


    public void menuPrompt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number \n" +
                "1 - Attendee \n" +
                "2 - Admin \n" +
                "3 - Exit");

        int usrChoice = input.nextInt();

        switch (usrChoice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }



    }
}
