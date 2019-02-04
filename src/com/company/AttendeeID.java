package com.company;

public class AttendeeID {
    private int id = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int incrementID(){
        id++;
        return id;
    }
}
