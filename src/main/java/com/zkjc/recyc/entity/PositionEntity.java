package com.zkjc.recyc.entity;

import com.zkjc.recyc.enums.EmployeeKindEnum;
import com.zkjc.recyc.enums.EmployeeStatusEnum;

import java.io.Serializable;
import java.util.Date;


public class PositionEntity implements Serializable {
    private String employeeId;
    private Date updateTime;
    private double longitude;
    private double latitude;
    private EmployeeStatusEnum workStatus;
    private EmployeeKindEnum kind;

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public PositionEntity(String employeeId, Date updateTime, double longitude, double latitude, EmployeeStatusEnum workStatus, EmployeeKindEnum kind) {
        this.employeeId = employeeId;
        this.updateTime = updateTime;
        this.longitude = longitude;
        this.latitude = latitude;
        this.workStatus = workStatus;
        this.kind = kind;
    }

    public PositionEntity(){

    }

    public void setWorkStatus(EmployeeStatusEnum workStatus) {
        this.workStatus = workStatus;
    }

    public EmployeeKindEnum getKind() {
        return kind;
    }

    public void setKind(EmployeeKindEnum kind) {
        this.kind = kind;
    }

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
