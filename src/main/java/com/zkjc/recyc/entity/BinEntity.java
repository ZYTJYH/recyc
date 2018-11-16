package com.zkjc.recyc.entity;

public class BinEntity {
    private String employeeId;
    private String binName;
    private int currentV;
    private int maxV;
    private String area;
    private double temperature;
    private String bossId;

    public BinEntity(){

    }
    public BinEntity(String employeeId, String binName, int currentV, int maxV, String area, double temperature, String bossId) {
        this.employeeId = employeeId;
        this.binName = binName;
        this.currentV = currentV;
        this.maxV = maxV;
        this.area = area;
        this.temperature = temperature;
        this.bossId = bossId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getBinName() {
        return binName;
    }

    public void setBinName(String binName) {
        this.binName = binName;
    }

    public int getCurrentV() {
        return currentV;
    }

    public void setCurrentV(int currentV) {
        this.currentV = currentV;
    }

    public int getMaxV() {
        return maxV;
    }

    public void setMaxV(int maxV) {
        this.maxV = maxV;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getBossId() {
        return bossId;
    }

    public void setBossId(String bossId) {
        this.bossId = bossId;
    }
}
