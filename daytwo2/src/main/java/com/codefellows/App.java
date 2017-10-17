package com.codefellows;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ElectronicDevice tv = new ElectronicDevice("tv");
        ElectronicDevice phone = new ElectronicDevice("phone");
        ElectronicDevice nestThermostat = new ElectronicDevice("thermostat");

        tv.setChannel(5);

        if (phone.getCurrentApp() == null) {
            phone.setCurrentApp("facebook");
        }
    }
}
