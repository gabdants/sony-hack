package com.sony.hackaton.womenmusic.dao;

import java.util.List;

public class UserDAO {

    String name;
    String email;
    String phoneNumber;
    String points;
    String gender;
    String carreer_type;
    String experienceYears;
    List<String> experienceLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCarreer_type() {
        return carreer_type;
    }

    public void setCarreer_type(String carreer_type) {
        this.carreer_type = carreer_type;
    }

    public String getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(String experienceYears) {
        this.experienceYears = experienceYears;
    }

    public List<String> getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(List<String> experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
}
