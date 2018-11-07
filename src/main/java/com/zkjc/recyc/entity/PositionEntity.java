package com.zkjc.recyc.entity;

import com.zkjc.recyc.enums.EmployeeStatusEnum;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;


public class PositionEntity implements Serializable {
    private String employeeId;
    private Date time;
    private double longitude;
    private double latitude;
    private EmployeeStatusEnum workStatus;
    private String bossId;
    private String information;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeStatusEnum getWorkStatus() {
        return workStatus;
    }

    public void setStatus(EmployeeStatusEnum workStatus) {
        this.workStatus = workStatus;
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
