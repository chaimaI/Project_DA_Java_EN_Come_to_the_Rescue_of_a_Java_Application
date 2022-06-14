package com.hemebiotech.analytics;

import java.util.ArrayList;

public interface ISymptomListOccurence {
	/**
	 The method takes into account in parameter a list
	 It allows to count all the occurrences and to sort the data of the list by alphabetical order
	 **/
	
	public void countFrequencies(ArrayList<String> list);
}
