package com.company.GraphicPackage;

public class Rectangle extends GraphicObject{

    private int length;
    private int width;

    public Rectangle (int length, int width, int xPos, int yPos) {
        super(xPos, yPos);
        this.length = length;
        this.width = width;
    }

    @Override
    public int findArea() {
        return this.length * this.width;
    }

    @Override
    public int findPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public void printCurrentPos() {
        System.out.println("x: " + super.getxPos());
        System.out.println("y: " + super.getyPos());
    }

}
