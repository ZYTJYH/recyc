package com.zkjc.recyc.entity;

import com.zkjc.recyc.enums.EmployeeStatusEnum;

import java.util.Date;

public class PositionEntity {
    private String employeeId;
    private Date time;
    private double longitude;
    private double latitude;
    private EmployeeStatusEnum status;
    private String bossId;
    private String information;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeStatusEnum getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatusEnum status) {
        this.status = status;
    }

    public String getBossId() {
        return bossId;
    }

    public void setBossId(String bossId) {
        this.bossId = bossId;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getUserId() {
        return employeeId;
    }

    public void setUserId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
