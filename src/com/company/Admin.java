package com.company;

import java.util.List;
import java.util.Scanner;

public class Admin {
    Scanner input = new Scanner(System.in);
    private String adminPass = "passwOrd";
    RegistrationForm tempRegistrationForm = new RegistrationForm();
    List<Attendee> currentList = tempRegistrationForm.getAttendeeList();

    public void adminLogin(){
        System.out.println("Please enter your admin password: ");
        String usrInput = input.nextLine();
        if(usrInput.equals(adminPass)){
            System.out.println("Enter a number of what you'd like to do: \n" +
                    "1 - Search by ID Number");
            usrInput = input.nextLine();
            switch (usrInput){
                case "1":
                    //prints out currentList -- printing out empty list
                    System.out.println(currentList);
                    searchByAccountNumber();
                    break;
            }
        }else{
            System.out.println("Nope...");
        }
    }

    private void searchByAccountNumber(){
        System.out.println("Please enter account number: ");
        int usrInput = input.nextInt();
        System.out.println(usrInput);

        for(int i = 0; i < currentList.size(); i++){
            if(currentList.get(i).getIdNumber() == usrInput){
                System.out.println(currentList.get(i));
            }else{
                System.out.println("Nope...");
            }
        }


    }
}
