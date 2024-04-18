package com.tns.day6;

public class FinalVariable {
	final int x = 100; 
	
	static int Y; 
	
	static int Z = 10; 

	void change() { 
	Y = 200; 
	} 
	@Override 
	public String toString() { 
	return "FinalVariable [x=" + x + ", Y" + Y + "]"; 
	} 
	 
	static { 
	Y = 20; 
	Z = 100;
	System.out.println("Value of Y: " + Y); 
	} 
	}
class FinalMethodClass { 

	FinalMethodClass() { 
	System.out.println("This is a default constructor"); 
	} 
	final int a = 50; 
	
	final void show() { 
	System.out.println("Value of a: " + a); 
	} 
	}



