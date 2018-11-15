package com.techfinancials.practice;

import java.util.List;

public class Child extends Person {

    private List<Person> relatives;
    private School school;

    public List<Person> getRelatives() {
        return relatives;
    }

    public void setRelatives(List<Person> relatives) {
        this.relatives = relatives;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        String father = "My father is a " + relatives.get(0).getGender() + " and his name is " + relatives.get(0).getFirstName() + ".\n";
        String mother = "My mother is a " + relatives.get(1).getGender() + " and her name is " + relatives.get(1).getFirstName() + ".\n";
        String brother = "My brother is a " + relatives.get(2).getGender() + " and his name is " + relatives.get(2).getFirstName() + ".\n";
        String school = "I go to " + this.school.getName() + " № " + this.school.getNumber() + ".\n";

        return "Hello! I am a child!\n" + father + mother + brother + school;
    }
}
