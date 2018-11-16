package com.zkjc.recyc.entity;

public class PersonEntity {
    private String employeeId;
    private String personName;
    private String phone;
    private String job;
    private String kind;
    private String gender;
    private int age;
    private String area;
    private String bossId;

    public PersonEntity(){

    }
    public PersonEntity(String employeeId, String personName, String phone, String job, String kind, String gender, int age, String area, String bossId) {
        this.employeeId = employeeId;
        this.personName = personName;
        this.phone = phone;
        this.job = job;
        this.kind = kind;
        this.gender = gender;
        this.age = age;
        this.area = area;
        this.bossId = bossId;
    }

    public String getBossId() {
        return bossId;
    }

    public void setBossId(String bossId) {
        this.bossId = bossId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
