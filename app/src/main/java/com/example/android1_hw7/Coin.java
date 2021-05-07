package com.example.android1_hw7;

public class Coin {
    private int image;
    private String name;
    private double course;

    public Coin() {

    }

    public Coin(int image, String name, double course) {
        this.image = image;
        this.name = name;
        this.course = course;
    }
    public int getImage(){
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }
}