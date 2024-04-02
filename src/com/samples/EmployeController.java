package com.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class EmployeController {

	public static void main(String[] args) {
		
		
		String inputs="Enter stream of characters";
		
		Set<Character> chars=new LinkedHashSet<>();
		
		inputs.chars().mapToObj(d -> (char)d).filter( f -> !chars.add(f)).findFirst().ifPresent(d -> System.out.println(d));
		
		
		
		
		
		
		
		
		
		
		
		
		inputs.chars().mapToObj( c -> (char) c).
		filter(c -> !chars.add(c)).findFirst().ifPresent( d -> System.out.println("sssss--"+d));
		
		
		inputs.chars().mapToObj( f -> (char)f).filter( g -> chars.add(g)).findFirst().ifPresent( h -> System.out.println(h));
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

		 Optional<String> emptyOptional = Optional.empty();
		  String result2 = emptyOptional.orElseGet(() -> {
	            // Supplier for generating a default value
	            return "Default Value";
	        });
		
		
		
		
		
		
		
		
		
		List<Employe> list = new ArrayList<>();
		
		list.add(new Employe(4, "Rabvisiva", "sivar@gmail.com",926));
		list.add(new Employe(1, "Arun", "ar@gmail.com",100));
		list.add(new Employe(2, "kumar", "kumar@gmail.com",50));
		list.add(new Employe(3, "siva", "sivar@gmail.com",52));
	
		
		
		
		List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 5);		
		
		int max=numbers.stream().max(Integer::compareTo).get();
		System.out.println(max);
		
		int min=numbers.stream().min(Integer::compareTo).get();
		System.out.println(min);
		
		
		int sum=numbers.stream().mapToInt(Integer::intValue).sum();
		
		
		
		
		
		
		//Second Largest age employer
		Optional<Employe> newlist=list.stream().sorted(Comparator.comparing(Employe::getAge).reversed()).filter(d -> d.getAge()>50).skip(1).findFirst();
		
		if(newlist.isPresent()) {
			System.out.println(newlist.get().getName());
		}
				
		//Write the code to find all employees from list of employees whose age is greater than 40
		List<Employe> newList=list.stream().filter(d ->	d.getAge()>40).collect(Collectors.toList());
		
		//You have List of employees(name,sal,id) from this you need to get employee names as a list based on the salary above 50k
		List<String> listd=list.stream().filter(d -> d.getAge()>50).map(Employe::getName).collect(Collectors.toList());
		
		
		//  Sorted Based on Name
		List<String> listdss=list.stream().filter(d -> d.getAge()>50).sorted(Comparator.comparing(Employe::getName)).
				map(Employe::getName).collect(Collectors.toList());
		
		
		//After Map Sorted
		list.stream().filter(d -> d.getAge()>50).
				map(Employe::getName).sorted((a,b)->b.compareToIgnoreCase(a)).forEach(d -> System.out.println("hai-----------"+d));
		
		
		//Before Map Sorted
		List<String> employeNameDort=list.stream().filter(d -> d.getAge()>50).sorted((a,b)->b.compare(a,b)).
				map(Employe::getName).collect(Collectors.toList());		
		
		System.out.println(employeNameDort);
		
		
		
		
		
		
		
		
		
		
		//List<String> listds=list.stream().filter(d -> d.getAge()>10).map(Employe::getEmailId).collect(Collectors.toList());
	
		
		//Collections.sort(list,new AgeComparator());
		
		
		/*
		 * list.forEach( d->{ System.out.println(d.getAge()); });
		 */
		
		
		/*
		 * List<Employe> newList=list.stream().filter(d ->
		 * d.getAge()>50).collect(Collectors.toList());
		 * 
		 * list.stream().filter(d -> d.getAge()>50).forEach(c ->
		 * System.out.println(c.getName()));
		 */
		
		
		/*
		 * newList.forEach( f ->{ System.out.println(f.getName()); });
		 * 
		 * 
		 * int total=list.stream().mapToInt(Employe::getAge).sum();
		 * System.out.println(total);
		 */
		
//		
//		List<Integer> lists=Arrays.asList(1,2,4,65,6);
//		
//		Collections.sort(lists,Comparator.reverseOrder());
		
		/*lists.forEach( f ->{
			System.out.println(f);
		});*/
		
//		
//		List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 5);
//		
//		
//		Set<Integer> iteam=new HashSet<>(numbers.size());
//		numbers.removeIf( s -> !iteam.add(s));
//		
//		
//		numbers.stream().filter( f -> Collections.frequency(numbers, f) >1)
//		.collect(Collectors.toSet()).forEach( d -> System.out.println(d));
//		
//		 
//		
		
		
		
		
		
		//numbers.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).findFirst().ifPresent( d -> System.out.println(d));
		
		
		
		
		
		
		   String input = "((){}[]";
		
		
		   EmployeController.isBalanced(input);
		
	}
	

	
	  public static boolean isBalanced(String parentheses) {
	        Stack<Character> stack = new Stack<>();
	 
	        for (char ch : parentheses.toCharArray()) {
	        	
	        
	            if (ch == '(' || ch == '{' || ch == '[') {
	            	
	                stack.push(ch);
	                
	            } else if (ch == ')' || ch == '}' || ch == ']') {
	            	
	                if (stack.isEmpty()) {
	                    return false; // More closing parentheses than opening ones
	                }
	                
	                char top = stack.pop();
	                if ((ch == ')' && top != '(') ||  (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
	                	
	                	System.out.println("Arun");
	                    return false; // Mismatched parentheses
	                }
	            }
	        }
	 
	        return stack.isEmpty(); // Check if all opening parentheses were closed
	  }
	

}
