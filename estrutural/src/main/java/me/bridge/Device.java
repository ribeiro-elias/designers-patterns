package me.bridge;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    Integer getVolume();
    void setVolume(Integer volume);
    Integer getChannel();
    void setChannel(Integer channel);
}
