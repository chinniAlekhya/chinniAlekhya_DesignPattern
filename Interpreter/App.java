package com.emap7.InterpreterPattern;
public class App 
{
    public static void main( String[] args )
    {
    	Expression person1 = new TerminalExpression("First"); 
        Expression person2 = new TerminalExpression("Second"); 
        Expression isSingle = new Or(person1, person2); 
          
        Expression lakshmi= new TerminalExpression("First"); 
        Expression committed = new TerminalExpression("Committed"); 
        Expression isCommitted = new And(lakshmi, committed);     

        System.out.println(isSingle.interpreter("Frist")); 
        System.out.println(isSingle.interpreter("second")); 
        System.out.println(isSingle.interpreter("Third")); 
          
        System.out.println(isCommitted.interpreter("Committed, Laskhmi")); 
        }
}
