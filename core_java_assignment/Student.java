package com.java.core;

public class Student implements Comparable<Student>{
    private String name;
    private int RollNo;
    private int age;
    public Student(String name, int RollNo, int age){
        this.name = name;
        this.RollNo = RollNo;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return RollNo;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public int compareTo(Student st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }


}
