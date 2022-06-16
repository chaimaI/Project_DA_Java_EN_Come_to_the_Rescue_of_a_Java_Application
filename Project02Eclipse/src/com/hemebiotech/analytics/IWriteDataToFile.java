package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public interface IWriteDataToFile{
	
/** read file and return list **/
	
	void fileSymptom (ArrayList<String> list);
	
	List<String> getListSymptome(String filepath);
	
	
}
