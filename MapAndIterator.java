package com.apisero;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapAndIterator {
	public static void main(String[] args) {
		//Map<Integer,String> map=new HashMap<>();
		//Map<Integer,String> map=new LinkedHashMap<>();
		TreeMap<Integer,String> map=new TreeMap<>();
		map.put(1, "praveen");
		map.put(2, "veena");
		map.put(3, "swapna");
		map.put(4, "kiran");
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.isEmpty());
		System.out.println(map.lowerEntry(2));
		System.out.println(map.lowerKey(3));
		System.out.println(map.higherKey(3));
		System.out.println(map.higherEntry(3));
		System.out.println(map.getClass().getName());
		//iterations 
		//only keys
		System.out.println("**********************");
		Set<Integer> set1= map.keySet();
		for(Integer i:set1)
		{
			System.out.println(i);
		}

		System.out.println("************");
		//only values
		Collection<String> set2= map.values();
		for(String i:set2)
		{
			System.out.println(i);
		}
		System.out.println("*************");
		//using keyset and iterator
		Iterator <Integer> it = map.keySet().iterator();       //keyset is a method  
		while(it.hasNext())  
		{  
			int key=(int)it.next();  
			System.out.println("Key is: "+key+"     name: "+map.get(key));  
		}  

		System.out.println("***********");
		//using entryset and iterator
		Set<Entry<Integer, String>> set= map.entrySet();
		Iterator<Entry<Integer, String>> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("**********************");
		//simply using for loop with entryset
		for(Entry<Integer,String> m:map.entrySet())
		{
			System.out.println("key value is:"+m.getKey()+"and name is "+m.getValue());
		}

		//iteration over map using forEach() method  (java8)
		map.forEach((k,v) -> System.out.println("Key: "+ k + ", Name: " + v)); 
		//streams
		set.stream().forEach(System.out::println);//method reference and foreach
		//method reference and foreachordered
		set.stream().forEach(names->System.out.println(names));
		set.stream().forEachOrdered(names->System.out.println(names));

		set.stream().forEach(System.out::println);//method reference and foreach
		set.stream().forEachOrdered(System.out::println);


	}
}
