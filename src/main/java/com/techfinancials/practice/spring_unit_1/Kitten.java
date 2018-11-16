package com.techfinancials.practice.spring_unit_1;

public class Kitten {

    private int ageInMonths;
    private String breed;

    public Kitten(String breed) {
        this.breed = breed;
    }

    public Kitten(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public Kitten(String breed, int ageInMonths) {
        this.breed = breed;
        this.ageInMonths = ageInMonths;
    }

    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Here you have a " + ageInMonths + "-months-old " + breed + " kitten.";
    }
}
