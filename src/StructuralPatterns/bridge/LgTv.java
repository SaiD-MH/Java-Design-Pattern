package StructuralPatterns.bridge;

public class LgTv implements Device {
    @Override
    public void turnOn() {
        System.out.println("LG : ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LG : OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Channel : " + channel);
    }
}
