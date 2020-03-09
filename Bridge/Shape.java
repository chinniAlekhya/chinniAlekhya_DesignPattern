package com.emap7.BridgePattern;

public abstract class Shape {
	protected Draw drawAPI;
	   protected Shape(Draw drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();
}
