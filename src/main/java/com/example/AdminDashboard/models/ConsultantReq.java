package com.example.AdminDashboard.models;

public class ConsultantReq {
    private int requestID;
    private int userID;
    private String status;

    public ConsultantReq(int userID, String status) {
        this.userID = userID;
        this.status = status;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConsultantReq() {
    }

    @Override
    public String toString() {
        return "ConsultantReq{" +
                "requestID=" + requestID +
                ", userID=" + userID +
                ", status='" + status + '\'' +
                '}';
    }
}

