package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageAttendeeList {
    private List<Attendee> attendeeList = new ArrayList();
    private Scanner input = new Scanner(System.in);

    public void addAttendee(){
        AttendeeID tempId = new AttendeeID();
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
        tempAttendee.setIdNumber(tempId.incrementID());
        attendeeList.add(tempAttendee);

        System.out.println(attendeeList);
        System.out.println(attendeeList.get(0).getIdNumber());
    }

    public void searchByAccountNumber(){
        System.out.println("Please enter account number: ");
        int usrInput = input.nextInt();
        System.out.println(usrInput);

        for(int i = 0; i < attendeeList.size(); i++){
            if(attendeeList.get(i).getIdNumber() == usrInput){
                System.out.println(attendeeList.get(i));
            }else{
                System.out.println("Nope...");
            }
        }
    }

}
