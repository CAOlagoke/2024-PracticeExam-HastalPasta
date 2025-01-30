package com.nhlstanden.Device;

import com.nhlstanden.DataPackage.Algorithm;
import com.nhlstanden.DataPackage.DataPackage;

public class MacBook extends Device{


    public MacBook(String serialNumber){
        super("Apple", serialNumber);

    }


    @Override
    public DataPackage getDataPackage() {

        String deviceInfo = getBrand() + getSerialNumber();

        DataPackage dataPackage = new DataPackage(Algorithm.END_TO_END, this.getDataPackage().getExtraData(), deviceInfo);

        super.setDataPackage(dataPackage);

        return dataPackage;
    }


}
