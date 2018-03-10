package com.team06.InstagramClone.Models;

/**
 * Created by isabellepotvin on 2018-03-10.
 */

public class UserSettings {

    private User user;
    private UserAccountSettings settings;


    //CONSTRUCTORS

    public UserSettings(User user, UserAccountSettings settings) {
        this.user = user;
        this.settings = settings;
    }

    public UserSettings() {

    }


    //GETTERS AND SETTERS

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserAccountSettings getSettings() {
        return settings;
    }

    public void setSettings(UserAccountSettings settings) {
        this.settings = settings;
    }


    // TO STRING

    @Override
    public String toString() {
        return "UserSettings{" +
                "user=" + user +
                ", settings=" + settings +
                '}';
    }


}
