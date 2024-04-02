package com.samplejava;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Fun {

	public static void main(String[] args) {
		
		
		FunInterface funInterface=(a,b)->{
			return a+b;
		};
		System.out.println(funInterface.add(10, 20));
		
		
		
		String str ="javaheljlo";
		
		  Arrays.stream(str.split("")).collect(Collectors.
				  groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		  
		  .entrySet().stream().filter(m -> m.getValue() > 1) .map(m -> m.getKey())
		  
		  .findFirst().ifPresent( s -> System.out.println(s));
		
		
		
		  
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		/*
		 * FunInterface funInterface=(a,b) ->{ return a+b;
		 * 
		 * };
		 * 
		 * System.out.println(funInterface.add(10, 10));
		 */
		
		/*FunInterface sunInterface =(a,d) ->{
			return a+d;
			
		};
		System.out.println(sunInterface.add(10,20));
				
		
		
		NormalInterface  sormalInterface=(x,c) ->{
			return x;
			
		};
		
		System.out.println(sormalInterface.add(10,20));
		
		
	}*/
		
		
		/*
		 * "aastus".chars() .mapToObj(c -> Character.valueOf((char)c)) .findFirst()
		 * .ifPresent(System.out::println);
		 * 
		 * 
		 * 
		 * String str ="javaheljlo";
		 * 
		 * Arrays.stream(str.split("")).collect(Collectors.
		 * groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		 * .entrySet().stream().filter(m -> m.getValue() > 1) .map(m -> m.getKey())
		 * .findFirst().ifPresent( s -> System.out.println(s));
		 */
		
		
		
		
		
		
		
		
		
		
		
		String s="Arunkumar";
		
		char [] ar=s.toCharArray();
		
		for(int i=ar.length-1; i>0; i--) {
			System.out.println(ar[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String[] str = new String[10];  
//        Optional<String> checkNull = Optional.ofNullable(str[5]);  
//        
      
		
		
		
		
		
		
		
		
		
		
	}
	
}
