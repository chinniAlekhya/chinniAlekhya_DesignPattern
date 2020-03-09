package com.emap7.CommandPattern;

public class LightsOff implements Command {
	Light light;
	  public LightsOff(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switchOff();
	  }
}
