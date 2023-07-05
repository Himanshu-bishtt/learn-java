package com.company;

public class Doors {
    private final String color;
    private final String handleType;
    private final int height;
    private final String texture;

    public Doors(String color, String handleType, int height, String texture) {
        this.color = color;
        this.handleType = handleType;
        this.height = height;
        this.texture = texture;
    }

    public void goToYourRoom() {
        System.out.println("Going to my room...");
    }

    public String getColor() {
        return color;
    }
    public String getHandleType() {
        return handleType;
    }
    public int getHeight() {
        return height;
    }
    public String getTexture() {
        return texture;
    }
}
