package StructuralPatterns.bridge;

public class SonyTv implements Device {

    @Override
    public void turnOn() {
        System.out.println("Sony: On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Channel : " + channel);
    }
}
