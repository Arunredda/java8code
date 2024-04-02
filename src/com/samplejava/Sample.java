package com.samplejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hai this is my first programs");
		
		String d="Hai this this is my first programs Hai";
		
		//d="adasd";
		
		List<String> list=Arrays.asList(d.split(" "));
		
		//Count of Duplicate word
		Map<String, Long> newlist=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(newlist);
		
		
		//Find the Duplicate
		List<String> sd=list.stream().filter(df -> Collections.frequency(list, df)>1).collect(Collectors.toList());
		System.out.println(sd);
		
		//Find the Duplicate unice
		Set<String> setva=list.stream().filter(f -> Collections.frequency(list, f)>1).collect(Collectors.toSet());		
		System.out.println(setva);
		
		
		
		//Find the Char Count
		List<Character> listchar=d.chars().mapToObj(ds -> (char) ds).collect(Collectors.toList());		
		Map<Character, Long> newlistss =listchar.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(newlistss);
		
		
		//FIRST Repeating Char
		String value="hais hava haic";
		
		value.chars().mapToObj( cd -> (char)cd).collect(Collectors.toList()).		
		stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new , Collectors.counting()))
		.entrySet().stream().filter(k -> k.getValue()>1).map(k -> k.getKey()).findFirst().ifPresent( f -> System.out.println("FIRST REPETING CHAR--"+f));
		
		
		//String values="vhais hava haic";
		
		//FIRST NON Repeating Char		
		value.chars().mapToObj( ssd -> (char) ssd).collect(Collectors.toList()).
         stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting())).entrySet()
         .stream().filter(f -> f.getValue()==1).map(f -> f.getKey()).findFirst().ifPresent( dd -> System.out.println("NON FIRST REPETING CHAR--"+dd));
		
		
		//List to Map Conversion		
		List<String> sList=Arrays.asList("Arun","Kumar","Siva");		
		Map<String, Integer> ssss=sList.stream().collect(Collectors.toMap(x -> x, String::length));
		System.out.println(ssss);
		
		
		
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 5);		
		
		int max=numbers.stream().max(Integer::compareTo).get();
		System.out.println("Find the max"+max);
		
		int min=numbers.stream().min(Integer::compareTo).get();
		System.out.println("Find the min"+min);
		
		
		int sum=numbers.stream().mapToInt(Integer::intValue).sum();		
		System.out.println("Find the Sum"+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		List country = Stream.of(Arrays.asList("Colombia", "Finland", "Greece", "Iceland", "Liberia", "Mali", "Mauritius"), 
				Arrays.asList("Peru", "Serbia", "Singapore", "Turkey", "Uzbekistan", "Yemen", "Zimbabwe", "Greece", "Iceland"))
				.flatMap(List::stream).collect(Collectors.toList());  
		System.out.println(country);
		
		List citylist = Arrays.asList("delhi", "mumbai", "hyderabad", "ahmedabad", "indore", "patna"). 
				stream(). map(String::toUpperCase).collect(Collectors.toList()); 
		
		System.out.println(citylist);
		
		
		
		
		
		
	}

}
