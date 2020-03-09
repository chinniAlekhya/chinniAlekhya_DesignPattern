package com.emap7.CommandPattern;
public class App {
    public static void main( String[] args ){
    	RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightsOn(light);
        Command lightsOff = new LightsOff(light);
        control.setCommand(lightsOn);
        control.pressButton();
        control.setCommand(lightsOff);
        control.pressButton();
        System.out.print("Command Pattern");
    }
}
