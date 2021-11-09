package com.engeto.school;

public class Student {

    String name;
    String surName;
    int birthDay;
    String id;

    public Student(){

    }
    public Student(String id, String name, String surName, int birthDay){
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.birthDay = birthDay;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurName(){
        return surName;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }

    public int getBirthDay(){
        return birthDay;
    }

    public void setBirthDay(int birthDay){
        this.birthDay = birthDay;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(System.lineSeparator());
        sb.append(id).append(" - ");
        sb.append(name).append(" ");
        sb.append(surName).append(" (");
        sb.append(birthDay).append(")");

        return sb.toString();
    }
}
