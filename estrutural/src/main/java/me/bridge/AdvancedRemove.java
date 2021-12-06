package me.bridge;

public class AdvancedRemove extends Remote{

    public AdvancedRemove(Device device) {
        super(device);
    }

    public void mute(){
        this.device.setVolume(0);
    }
}
