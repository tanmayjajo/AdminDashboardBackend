package com.example.AdminDashboard.models;

public class UserTable {
    private int userID;
    private String role;
    private String name;
    private int age;
    private long phoneNo;
    private String gender;
    private String JobRole;
    private String email;
    private String cv;

    // Getters and setters

    public UserTable(String role, String name) {
        this.role = role;
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobRole() {
        return JobRole;
    }

    public void setJobRole(String jobRole) {
        JobRole = jobRole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public UserTable() {
    }

    @Override
    public String toString() {
        return "UserTable{" +
                "userID=" + userID +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                ", gender='" + gender + '\'' +
                ", JobRole='" + JobRole + '\'' +
                ", email='" + email + '\'' +
                ", cv='" + cv + '\'' +
                '}';
    }
}
