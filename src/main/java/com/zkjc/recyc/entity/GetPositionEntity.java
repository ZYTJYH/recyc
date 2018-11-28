package com.zkjc.recyc.entity;

public class GetPositionEntity {
    private String GpsId;
    private String SN;
    private String addressIp;
    private String GTime;
    private double Longitude;
    private double Latitude;
    private String Kind;
    private String Temp;
    private String Capacity;
    private String ACC;

    public GetPositionEntity(String gpsId, String SN, String addressIp, String GTime, double longitude, double latitude, String kind, String temp, String capacity, String ACC) {
        GpsId = gpsId;
        this.SN = SN;
        this.addressIp = addressIp;
        this.GTime = GTime;
        Longitude = longitude;
        Latitude = latitude;
        Kind = kind;
        Temp = temp;
        Capacity = capacity;
        this.ACC = ACC;
    }

    public String getGpsId() {
        return GpsId;
    }

    public void setGpsId(String gpsId) {
        GpsId = gpsId;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public String getAddressIp() {
        return addressIp;
    }

    public void setAddressIp(String addressIp) {
        this.addressIp = addressIp;
    }

    public String getGTime() {
        return GTime;
    }

    public void setGTime(String GTime) {
        this.GTime = GTime;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
    }

    public String getTemp() {
        return Temp;
    }

    public void setTemp(String temp) {
        Temp = temp;
    }

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String capacity) {
        Capacity = capacity;
    }

    public String getACC() {
        return ACC;
    }

    public void setACC(String ACC) {
        this.ACC = ACC;
    }
}
