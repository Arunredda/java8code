package com.samples;

import java.time.LocalDateTime;

public class SingleTone extends Object {
	
	private static SingleTone instance;

    // Private constructor
    private SingleTone() {
        // Initialization code
    }

    // Static method to get the instance
    public static SingleTone getInstance() {
        if (instance == null) {
            instance = new SingleTone();
        }
        return instance;
    }
    
    public static void main(String[] args) {
    	
    	SingleTone reg=SingleTone.getInstance();
    	System.out.println(reg);
    	
    	SingleTone reg2=SingleTone.getInstance();
    	System.out.println(reg2);
    	
    	 for(int i=10; i>0; i--) {
    	    	System.out.println(i);
    	    }
    	 
    	 LocalDateTime now = LocalDateTime.now();  
    }
    
    
    
   

}
