package com.emap7.CommandPattern;

public class LightsOn implements Command{
	Light light;
	  public LightsOn(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switchOn();
	  }
}
