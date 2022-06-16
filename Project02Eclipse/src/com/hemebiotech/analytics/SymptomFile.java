package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SymptomFile implements IWriteDataToFile{
	
	/** 
	The first method takes a string as parameter and returns a list
	The second method creates a text file that includes all the occurrences of the list in alphabetical order
**/

ArrayList<String> list;

public SymptomFile(ArrayList<String> list) {

	this.list = list;
}



public List<String> getListSymptome(String filepath){	 
	ArrayList<String> result = new ArrayList<String>();
	String lineSymptom;	
		try {
			File file = new File(filepath);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader); 
					
			while((lineSymptom=bufferedReader.readLine())!=null){		
			result.add(lineSymptom);
			}			
			bufferedReader.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;					
}

public void fileSymptom (ArrayList<String> list) { 
	
	try
    {			
      //File name with path
      String fileName = "results.out.txt";
 
      File file = new File(fileName);
      FileOutputStream streamfile = new FileOutputStream(file);
      OutputStreamWriter streamWriter = new OutputStreamWriter(streamfile);    
      Writer bufferedWriter = new BufferedWriter(streamWriter); 
      
     
      //Write data from an ArrayList
      Collections.sort(list);
        Set<String> listSymptom = new TreeSet<String>(list);
        
      for (String symptom : listSymptom) {
    	  bufferedWriter.write(symptom + "= " +Collections.frequency(list, symptom) +"\n" );	        	     
      }
      bufferedWriter.close();
    } 
    catch (IOException e){
      System.out.println("An error occurred.");
      e.printStackTrace();
    }	
}	

}
