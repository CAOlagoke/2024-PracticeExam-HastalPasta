package com.nhlstanden.Device;

import com.nhlstanden.DataPackage.Algorithm;
import com.nhlstanden.DataPackage.DataPackage;

import java.util.ArrayList;

public class HueLight extends Device{

    private final double MAX_BRIGHTNESS= 100;
    private final double MIN_BRIGHTNESS=0;
    private double brightness;

    public HueLight(String serialNumber) {
        super("Phillips", serialNumber);
        this.brightness = MIN_BRIGHTNESS;
    }


    @Override
    public DataPackage getDataPackage() {

       //Assemble a string containing the device information, using deviceInfo, brand, serialNumber
       //If the device info length is more than 25, use MD5 algorithm
       //If the device info length is less than 25, use No algorithm

        String deviceInformation = getBrand() + getSerialNumber();

        DataPackage dataPackage = new DataPackage(Algorithm.NONE, this.getDataPackage().getExtraData(), deviceInformation);
        if(deviceInformation.length() > 25){
            dataPackage.setAlgorithm(Algorithm.MD5);
        }

        super.setDataPackage(dataPackage);

        return dataPackage;
    }


    public double getBrightness() {
        return brightness;
    }

    public void setBrightness(double brightness) {

        if(brightness <= MAX_BRIGHTNESS){
            this.brightness = brightness;
        }
    }

}
