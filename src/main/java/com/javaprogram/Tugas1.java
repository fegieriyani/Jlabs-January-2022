package com.javaprogram;

import java.util.TreeMap;
import java.util.TreeSet;

public class Tugas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //TREESET
		TreeSet<String> fruits = new TreeSet<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Blueberry");
		fruits.add("Watermelon");
		fruits.add("Banana");
		fruits.add("Avocado");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Apple");
		
		for (String item : fruits) {
			System.out.println(item);
		}
		
		
        //TREEMAP
		TreeMap<String, Integer> ages = new TreeMap<>();
		ages.put("Fegi", 26);
		ages.put("Dwi", 30);
		ages.put("Kanayya", 15);
		ages.put("Budi", 22);
		ages.put("Fairel", 15);
		ages.put("Dwi", 32);
		ages.put("Eka", 34);
		ages.put("Azzam", 20);
		ages.put("Eka", 33);
		
		for (String key : ages.keySet()) {
			System.out.println(key + "'s" + " age is " + ages.get(key) + " years");
		}

	}

}
