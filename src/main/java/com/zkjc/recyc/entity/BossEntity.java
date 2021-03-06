package com.zkjc.recyc.entity;

public class BossEntity {
    private String bossId;
    private String bossName;
    private String phone;
    private String kind;
    private String gender;
    private int age;
    private String area;
    public BossEntity() {
    }

    public BossEntity(String bossId, String bossName, String phone, String kind, String gender, int age, String area) {
        this.bossId = bossId;
        this.bossName = bossName;
        this.phone = phone;
        this.kind = kind;
        this.gender = gender;
        this.age = age;
        this.area = area;
    }

    public String getBossId() {
        return bossId;
    }

    public void setBossId(String bossId) {
        this.bossId = bossId;
    }

    public String getBossName() {
        return bossName;
    }

    public void setName(String bossName) {
        this.bossName = bossName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
