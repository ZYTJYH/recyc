package com.zkjc.recyc.entity;

public class CarEntity {
    private String employeeId;
    private String carName;
    private String phone;
    private String carNumber;
    private String carType;
    private String kind;
    private String gender;
    private Integer age;
    private String area;

    public CarEntity(){

    }
    public CarEntity(String employeeId, String carName, String phone, String carNumber, String carType, String kind, String gender,Integer age, String area, String bossId) {
        this.employeeId = employeeId;
        this.carName = carName;
        this.phone = phone;
        this.carNumber = carNumber;
        this.carType = carType;
        this.kind = kind;
        this.gender = gender;
        this.age = age;
        this.area = area;
        this.bossId = bossId;
    }

    private String bossId;



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

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
