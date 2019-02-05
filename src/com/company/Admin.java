package com.company;

import java.util.List;
import java.util.Scanner;

public class Admin {
    Scanner input = new Scanner(System.in);
    private String adminPass = "passwOrd";
    private ManageAttendeeList tempList = new ManageAttendeeList();


    public void adminLogin(){
        System.out.println("Please enter your admin password: ");
        String usrInput = input.nextLine();
        if(usrInput.equals(adminPass)){
            System.out.println("Enter a number of what you'd like to do: \n" +
                    "1 - Search by ID Number");
            usrInput = input.nextLine();
            switch (usrInput){
                case "1":
                    tempList.searchByAccountNumber();
                    break;
            }
        }else{
            System.out.println("Nope...");
        }
    }


}
