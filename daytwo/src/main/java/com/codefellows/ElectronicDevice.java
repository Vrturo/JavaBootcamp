package com.codefellows;

public class ElectronicDevice {
    private int channel;
    private boolean on = false;
    private String deviceName;
    private String currentApp = null;

    public ElectronicDevice(String deviceName) P{
        this.deviceName = deviceName;
    }

    public void turnOn() {
        on = true;
        System.out.println(String.format("device name: %s is now on", deviceName));
    }

    public void turnOn(int channel) {
        turnOn();
        this.channel = channel;
        System.out.println(String.format("deviceName: %s is set to channel %d", deviceName,
                channel));
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
