package com.nhlstanden;

import com.nhlstanden.Device.AllowedDeviceLimitException;
import com.nhlstanden.Device.Device;

import java.util.HashSet;

public class Router implements Validation{

    private HashSet<Device> devices;
    private String password;
    private final int MAX_ALLOWED_DEVICES = 25;
    private final int MIN_PASSWORD_LENGTH= 12;

    public Router() {
        this.devices = new HashSet<>();
        this.password = "admin";
    }

    public void addDevice(Device device) throws AllowedDeviceLimitException {

        if(getDevices().size() + 1 > 25){
            throw new AllowedDeviceLimitException();
        }

        this.devices.add(device);
    }



    public HashSet<Device> getDevices() {
        return devices;
    }

    public void setDevices(HashSet<Device> devices) {
        this.devices = devices;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean isSafeString(String stringToBeChecked, boolean isDigitMandatory, int minimumLengthOfString) {

        if(getPassword().length() >= minimumLengthOfString){
            if(isDigitMandatory && getPassword().contains(".*\\d.*")){
                return true;
            }
            else if(!isDigitMandatory){
                return true;
            }
        }

        return false;
    }
}
