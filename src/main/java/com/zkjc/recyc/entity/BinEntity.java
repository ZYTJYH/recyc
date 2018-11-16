package com.zkjc.recyc.entity;

public class BinEntity {
    private String employeeId;
    private String binName;
    private String currentV;
    private String maxV;
    private String area;
    private double temperature;
    private String bossId;

    public BinEntity(String employeeId, String binName, String currentV, String maxV, String area, double temperature, String bossId) {
        this.employeeId = employeeId;
        this.binName = binName;
        this.currentV = currentV;
        this.maxV = maxV;
        this.area = area;
        this.temperature = temperature;
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

    public String getBinName() {
        return binName;
    }

    public void setBinName(String binName) {
        this.binName = binName;
    }

    public String getCurrentV() {
        return currentV;
    }

    public void setCurrentV(String currentV) {
        this.currentV = currentV;
    }

    public String getMaxV() {
        return maxV;
    }

    public void setMaxV(String maxV) {
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
}
