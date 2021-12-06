package me.bridge;

public class Remote {

    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if(device.isEnabled()){
            device.disable();
        }
        device.enable();
    }

    public void volumeUp(){
        Integer volume = device.getVolume();
        device.setVolume(volume+1);
    }

    public void volumeDown(){
        Integer volume = device.getVolume();
        device.setVolume(volume-1);
    }

    public void channelDown(){
        Integer channel = device.getChannel();
        device.setChannel(channel-1);
    }


    public void channelUp(){
        Integer channel = device.getChannel();
        device.setChannel(channel+1);
    }
}
