package com.company;

import java.util.ArrayList;

public class Contact {
    private final ArrayList<String> name = new ArrayList<>();
    private final ArrayList<String> phoneNumber = new ArrayList<>();

    public ArrayList<String> getName() {
        return name;
    }

    public ArrayList<String> getPhoneNumber() {
        return phoneNumber;
    }
}
