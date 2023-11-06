package com.unsis.models.entity;

import java.awt.Image;

/**
 *
 * @author labtecweb10
 */
public class Account extends Employee {

    private String user;
    private String pass;
    private Image profileImage;

    public Account() {}

    public Account(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Image getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Image profileImage) {
        this.profileImage = profileImage;
    }

}
