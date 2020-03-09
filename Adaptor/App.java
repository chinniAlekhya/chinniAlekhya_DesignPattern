package com.emap7.Adapter;
public class App {
    public static void main( String[] args ){
    	Sparrow sparrow = new Sparrow(); 
        Duck toyDuck = new PlasticDuck(); 
        Duck birdAdapter = new Adapter(sparrow); 
        System.out.println("Duck..."); 
        toyDuck.squeak(); 
        System.out.println("Adapter..."); 
        birdAdapter.squeak(); 
        System.out.println("Sparrow..."); 
        sparrow.fly(); 
        sparrow.sound(); 
    }
}
