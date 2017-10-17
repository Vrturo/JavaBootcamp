package com.codefellows;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        ElectronicDevice tv = new ElectronicDevice("tv");
        ElectronicDevice phone = new ElectronicDevice("phone");
        ElectronicDevice nestThermostat = new ElectronicDevice("thermostat");

        tv.setChannel(5);

        if (phone.getCurrentApp() == null) {
            phone.setCurrentApp("facebook");
        }

        ElectronicDevice tv2 = new Television();

        //Bad practice
//        if (tv2 instanceof Television) {
//            ((Televisiontv2)).turnOn(5);
//        }
        tv.turnOn(5);
        tv.turnOff();

        ElectronicDevice phone2 = new MobilePhone();

        phone2.turnOn();
        phone2.turnOff();
    }
}
