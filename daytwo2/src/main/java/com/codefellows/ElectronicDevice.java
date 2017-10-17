package com.codefellows;

public abstract class ElectronicDevice {
    protected boolean on = false;
    protected String deviceName;

    public ElectronicDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName(){
        return deviceName;
    }

    public abstract String getDeviceInfo();

    public void turnOn() {
        on = true;
        System.out.println(String.format("device name: %s is now on", deviceName));
    }

    public void turnOn(int initialValue) {
       System.out.println();
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void setCurrentApp(String currentApp) {
        this.currentApp = currentApp;
    }

    public getCurrentApp() {
        return this.currentApp;
    }

    public void turnOff() {
        on = false;
        System.out.println()String.format("deviceName: %s is now off", deviceName);
    }

    public boolean isOn() {
        return on;
    }
}
