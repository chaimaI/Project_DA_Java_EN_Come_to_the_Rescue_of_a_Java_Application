package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SymptomListOccurence implements ISymptomListOccurence {
	
/**
 The method takes into account in parameter a list
 It allows to count all the occurrences and to sort the data of the list by alphabetical order
 **/
	
private ArrayList<String> list;
	
	public SymptomListOccurence(ArrayList<String> list) {
	this.list = list;
}

	public SymptomListOccurence() {
	}

	public void countFrequencies(ArrayList<String> list)
    {
		try {
			Collections.sort(list);
	        Set<String> st = new TreeSet<String>(list);
	         
	        for (String s : st)        	
	            System.out.println(s + "= " + Collections.frequency(list, s)); 
		} catch(Exception e) {
			e.printStackTrace();
		}
		
  
    }
	
	
	
	
}
