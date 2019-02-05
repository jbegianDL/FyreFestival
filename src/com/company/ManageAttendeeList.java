package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageAttendeeList {
    private List<Attendee> attendeeList = new ArrayList();
    private Scanner input = new Scanner(System.in);
    private String adminPass = "passwOrd";
    private AttendeeID attendeeID = new AttendeeID();


    public void addAttendee(){
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
        Attendee tempAttendee = new Attendee(name, address, email, plannedArrivalDate, specialRequests);
        tempAttendee.setIdNumber(attendeeID.incrementID());
        attendeeList.add(tempAttendee);
        System.out.println(attendeeList);
    }

    public void adminLogin(){
        System.out.println("Please enter your admin password: ");
        String usrInput = input.nextLine();
        if(usrInput.equals(adminPass)){
            System.out.println("Enter a number of what you'd like to do: \n" +
                    "1 - Search by ID Number \n " +
                    "2 - Remove by ID Number");
            usrInput = input.nextLine();
            switch (usrInput){
                case "1":
                   searchByAccountNumber();
                    break;
                case "2":
                    removeByAccountNumber();
                    break;
            }
        }else{
            System.out.println("Nope...");
        }
    }

    public void searchByAccountNumber(){
        System.out.println("Please enter account number: ");
        int usrInput = input.nextInt();
        System.out.println(attendeeList.size());

        for(int i = 0; i < attendeeList.size(); i++){
            System.out.println("this is in the loop");
            if(attendeeList.get(i).getIdNumber() == usrInput){
                System.out.println(attendeeList.get(i));
            }else{
                System.out.println("Nope...");
            }
        }
    }

    public void printNameAndID() {
        for(Attendee i : attendeeList) {
            System.out.println(i.getName() + " " + i.getIdNumber());
        }
    }

    public void removeByAccountNumber() {
        printNameAndID();
        System.out.println("Please enter the ID of the person you would like to delete: ");
        int usrInput = input.nextInt();
        for(int i = 0; i < attendeeList.size(); i++){
            if(attendeeList.get(i).getIdNumber() == usrInput){
                System.out.println("You have removed " + attendeeList.get(i).getName());
                attendeeList.remove(attendeeList.get(i));
                break;
            }else{
                System.out.println("Id is not found");
            }
        }
            printNameAndID();
    }

}
