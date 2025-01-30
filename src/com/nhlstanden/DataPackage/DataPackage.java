package com.nhlstanden.DataPackage;

import java.util.ArrayList;

public class DataPackage {

    private Algorithm algorithm;
    private ArrayList<Integer> extraData;
    private final int MAX_EXTRA_DATA_SIZE = 100;
    private String deviceInformation;

    public DataPackage(Algorithm algorithm, ArrayList<Integer> extraData, String deviceInformation) {
        this.algorithm = algorithm;
        setExtraData(extraData);

        this.deviceInformation = deviceInformation;
    }

    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public ArrayList<Integer> getExtraData() {
        return extraData;
    }

    public void setExtraData(ArrayList<Integer> extraData) {
        if(extraData.size() <= MAX_EXTRA_DATA_SIZE){
            this.extraData = extraData;
        }else{
            this.extraData = new ArrayList<>();
        }
    }

    public String getDeviceInformation() {
        return deviceInformation;
    }

    public void setDeviceInformation(String deviceInformation) {
        this.deviceInformation = deviceInformation;
    }
}
