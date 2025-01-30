package com.nhlstanden.Device;

import com.nhlstanden.DataPackage.DataPackage;

import java.util.ArrayList;

public abstract class Device {

    private String brand;
    private String serialNumber;
    protected DataPackage dataPackage;

    public Device(String brand, String serialNumber) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.dataPackage = null;
    }


    public abstract DataPackage getDataPackage();

    public void setDataPackage(DataPackage dataPackage) {
        this.dataPackage = dataPackage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
