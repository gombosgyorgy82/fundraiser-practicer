package com.example.fundraiserpracticer.dto.incoming;

public class AccountRegistrationCommand {

    private String name;
    private String goal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}
