package me.bridge;

public class TV implements Device{

    private boolean enable;
    private Integer volume;
    private Integer channel;

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public void enable() {
        this.enable = true;
    }

    @Override
    public void disable() {
        this.enable = false;
    }

    @Override
    public Integer getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public Integer getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(Integer channel) {
        this.channel = channel;
    }
}
