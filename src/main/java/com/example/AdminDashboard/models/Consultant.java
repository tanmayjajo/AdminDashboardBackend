package com.example.AdminDashboard.models;

public class Consultant {
    private int consultantID;
    private int userID;

    public int getConsultantID() {
        return consultantID;
    }

    public void setConsultantID(int consultantID) {
        this.consultantID = consultantID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Consultant() {
    }

//    public Consultant(int userID) {
//        this.userID = userID;
//    }

    @Override
    public String toString() {
        return "Consultant{" +
                "consultantID=" + consultantID +
                ", userID=" + userID +
                '}';
    }


}

