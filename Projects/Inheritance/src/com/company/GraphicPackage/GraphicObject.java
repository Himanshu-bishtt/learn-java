package com.company.GraphicPackage;

public abstract class GraphicObject {
    private int xPos;
    private int yPos;

    public GraphicObject() {
        // Default Constructor
    }

    public GraphicObject (int x, int y) {
        this.setxPos(x);
        this.setyPos(y);
    }

    public void moveTo(int newXPos, int newYPos) {
        this.setxPos(newXPos);
        this.setyPos(newYPos);
    }

    public void fill(String color) {
        System.out.println(this.getClass().getSimpleName() + " filled with " + color);
    }

    /*
     * Abstract methods all the non-abstract classes to implement.
     * */
    public abstract int findArea();

    public abstract int findPerimeter();

    public abstract void printCurrentPos();

    // Getters and setters
    public int getxPos() {
        return xPos;
    }

    protected void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    protected void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
