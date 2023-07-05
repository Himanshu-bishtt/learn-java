package com.company;

public class Engine {
    private String type;
    private int warrantyTime;

    public Engine(String type, int warrantyTime) {
        this.type = type;
        this.warrantyTime = warrantyTime;
    }
    public String getType() {
        return type;
    }
    public int getWarrantyTime() {
        return warrantyTime;
    }

    public void engineOn() {
        System.out.println("Starting the engine -> Engine.engineOn()");
    }
    public void checkWarranty() {
        if(this.warrantyTime > 3) {
            System.out.println("Warranty Expired");
        } else {
            System.out.println("Your car is under Warranty period");
        }
    }

}
