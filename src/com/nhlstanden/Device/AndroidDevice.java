package com.nhlstanden.Device;

import com.nhlstanden.DataPackage.Algorithm;
import com.nhlstanden.DataPackage.DataPackage;

public class AndroidDevice extends Device{

    private boolean isRooted;
    private boolean sellDataToGoogle;

    public AndroidDevice(String brand, String serialNumber, boolean isRooted, boolean sellDataToGoogle) {
        super(brand, serialNumber);
        this.isRooted = isRooted;
        this.sellDataToGoogle = sellDataToGoogle;
    }

    @Override
    public DataPackage getDataPackage() {

        String deviceInfo = "";

        if(getIsRooted()){
            deviceInfo = "_ROOTED_" + getBrand() + getSerialNumber();
        }else{
            deviceInfo = getBrand() + getSerialNumber();
        }

        DataPackage dataPackage = new DataPackage(Algorithm.BCRYPT, this.getDataPackage().getExtraData(), deviceInfo);

        super.setDataPackage(dataPackage);

        return dataPackage;
    }

    public boolean getIsRooted() {
        return isRooted;
    }

    public void setIsRooted(boolean isRooted) {
        this.isRooted = isRooted;
    }

    public boolean isSellDataToGoogle() {
        return sellDataToGoogle;
    }

    public void setSellDataToGoogle(boolean sellDataToGoogle) {
        this.sellDataToGoogle = sellDataToGoogle;
    }
}
