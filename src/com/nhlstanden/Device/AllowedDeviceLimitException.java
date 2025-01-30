package com.nhlstanden.Device;

public class AllowedDeviceLimitException extends Exception
{

    public AllowedDeviceLimitException(){
        super("Max Allowed Device Limit Reached!");
    }
}
