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
        System.out.println("Please enter your street address: \n");
        String streetAddress = input.nextLine();
        System.out.println("Please enter your city: \n");
        String city = input.nextLine();
        System.out.println("Please enter your state: \n");
        String state = input.nextLine();
        System.out.println("Please enter your email: \n");
        String email = input.nextLine();
        System.out.println("Please enter your planned arrival date: (Example: MM/DD/YYYY) \n");
        String plannedArrivalDate = input.nextLine();
        System.out.println("Please enter any special requests: \n");
        String specialRequests = input.nextLine();

        Attendee tempAttendee = new Attendee(name, streetAddress, city, state, email, plannedArrivalDate, specialRequests);
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
                    "2 - Remove by ID Number \n " +
                    "3 - Set VIP Status");
            usrInput = input.nextLine();
            switch (usrInput){
                case "1":
                   searchByAccountNumber();
                    break;
                case "2":
                    removeByAccountNumber();
                    break;
                case "3":
                    issueVipStatus();
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
        //prints list to see if attendee removed
        printNameAndID();
    }

    public void issueVipStatus(){
        printNameAndID();
        System.out.println("Enter the ID Number you'd like to assign VIP status to: ");
        int usrInput = input.nextInt();
        for (int i = 0; i < attendeeList.size(); i++){
            if(attendeeList.get(i).getIdNumber() == usrInput){
                attendeeList.get(i).setVip(true);
                break;
            }else{
                System.out.println("ID not found");
            }
        }

        //prints array list to see if VIP status is set to true
        System.out.println(attendeeList);

    }

}
