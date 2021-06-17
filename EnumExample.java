package com.revature;
import java.util.*;
public class EnumExample {
	enum Level {
	    LOW,
	    MEDIUM,
	    HIGH
	  }

	  public static void main(String[] args) {
	    //Printing only Medium Level
		Level myVar = Level.MEDIUM; 
	    System.out.println(myVar);
	    System.out.println();
	    //Printing all levels
	    for(Level myVar1: Level.values())
	    {
	    	System.out.println(myVar1);
	    }
	    	
	  }
}
