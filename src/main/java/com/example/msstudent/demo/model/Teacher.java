package com.example.msstudent.demo.model;


public class Teacher {

    private Integer teacherId;



    private String name;
    private String department;
    public Teacher(){

    }


    public Teacher(Integer teacherId, String name, String department) {
        this.teacherId = teacherId;
        this.name = name;
        this.department = department;
    }





    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }


}
