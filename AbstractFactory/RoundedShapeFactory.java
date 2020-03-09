package com.epam7.AbstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory{
	 public DrawShape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new RoundRectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new RoundSquare();
	      }	 
	      return null;
	   }
}
