package com.emap7.Adapter;

public class Adapter implements Duck{
	 Bird bird; 
	    public void squeak() 
	    { 
	        bird.sound(); 
	    } 
	    public Adapter(Bird bird) 
	    { 
	        this.bird = bird; 
	    } 
}
