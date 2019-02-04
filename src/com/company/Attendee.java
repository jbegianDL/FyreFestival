package com.company;

public class Attendee {
    private String name;
    private String address;
    private String email;
    private String plannedArrivalDate;
    private String specialRequests;

    public Attendee(String name, String address, String email, String plannedArrivalDate, String specialRequests) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.plannedArrivalDate = plannedArrivalDate;
        this.specialRequests = specialRequests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlannedArrivalDate() {
        return plannedArrivalDate;
    }

    public void setPlannedArrivalDate(String plannedArrivalDate) {
        this.plannedArrivalDate = plannedArrivalDate;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }
}
