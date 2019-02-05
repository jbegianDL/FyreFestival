package com.company;

import java.util.ArrayList;
import java.util.List;

public class Attendee {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String email;
    private String plannedArrivalDate;
    private String specialRequests;
    private int idNumber;
    private boolean vip;

    public Attendee(String name, String streetAddress, String city, String state, String email, String plannedArrivalDate, String specialRequests) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.email = email;
        this.plannedArrivalDate = plannedArrivalDate;
        this.specialRequests = specialRequests;
        this.idNumber = getIdNumber();
        this.vip = false;
    }

    @Override
    public String toString() {
        return "Attendee{" +
                "name='" + name + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", plannedArrivalDate='" + plannedArrivalDate + '\'' +
                ", specialRequests='" + specialRequests + '\'' +
                ", idNumber=" + idNumber +
                ", vip=" + vip +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
