package com.company;
import java.util.Scanner;

public class RegistrationForm {
    private ManageAttendeeList tempList = new ManageAttendeeList();



    public void menuPrompt(){
        Scanner input = new Scanner(System.in);
        boolean repeat = true;

        do{
            System.out.println("Please enter a number \n" +
                    "1 - Attendee \n" +
                    "2 - Admin \n" +
                    "3 - Exit");

            String usrChoice = input.nextLine();

            switch (usrChoice){
                case "1":
                    tempList.addAttendee();
                    break;
                case "2":
                    tempList.adminLogin();
                    break;
                case "3":
                    System.out.println("Goodbye");
                    repeat = false;
                    break;
                default:
                    break;
            }
        }while(repeat);
    }


}
