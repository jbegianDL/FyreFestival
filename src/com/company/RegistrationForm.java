package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistrationForm {

    private List<Attendee> attendeeList = new ArrayList();

    public void menuPrompt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number \n" +
                "1 - Attendee \n" +
                "2 - Admin \n" +
                "3 - Exit");

        String usrChoice = input.nextLine();

        switch (usrChoice){
            case "1":

                System.out.println("Please enter name: \n");
                String name = input.nextLine();
                System.out.println("Please enter your address: \n");
                String address = input.nextLine();
                System.out.println("Please enter your email: \n");
                String email = input.nextLine();
                System.out.println("Please enter your planned arrival date: (Example: MM/DD/YYYY) \n");
                String plannedArrivalDate = input.nextLine();
                System.out.println("Please enter any special requests: \n");
                String specialRequests = input.nextLine();
                Attendee tempAttendee = new Attendee(name, address, email, plannedArrivalDate,specialRequests);
                attendeeList.add(tempAttendee);

                System.out.println(attendeeList);
                break;
            case "2":
                break;
            case "3":
                break;
            default:
                break;
        }



    }
}
