package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile implements IReadSymptomDataFromFile  {
	
	 /**The method allows to read a file. 
		It takes in parameter a string
		The method returns an unordered list without taking into account the duplicates.
	**/	
		private String filepath;
		
		public ReadSymptomDataFromFile(String filepath) {
			this.filepath = filepath;
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
	
	
	
	

}
