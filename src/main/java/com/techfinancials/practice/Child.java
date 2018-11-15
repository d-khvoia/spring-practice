package com.techfinancials.practice;

public class Child extends Person {


    private Person father;
    private Person mother;
    private Person brother;
    private School school;

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getBrother() {
        return brother;
    }

    public void setBrother(Person brother) {
        this.brother = brother;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        String father = "My father is a " + this.father.getGender() + " and his name is " + this.father.getFirstName() + ".\n";
        String mother = "My mother is a " + this.mother.getGender() + " and her name is " + this.mother.getFirstName() + ".\n";
        String brother = "My brother is a " + this.brother.getGender() + " and his name is " + this.brother.getFirstName() + ".\n";
        String school = "I go to " + this.school.getName() + " № " + this.school.getNumber() + ".\n";

        return "Hello! I am a child!\n" + father + mother + brother + school;
    }
}
