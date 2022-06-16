package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class MainApplicationBiotech {

	public static void main(String[] args) {
		
		// Lecture du fichier et retourne la liste des symptomes
		
				String file ="symptoms.txt";
				ReadSymptomDataFromFile syptomData = new ReadSymptomDataFromFile(file);
				List<String> fileList = syptomData.getListSymptome(file);
				System.out.println(fileList);
		
				// Retourne la liste des symptomes avec occurences (dans l'ordre alphabétique)		
				 SymptomListOccurence symptomOccurence = new SymptomListOccurence((ArrayList<String>)fileList);
				 symptomOccurence.countFrequencies((ArrayList<String>)fileList);
		
				 // Generation d'un nouveau fichier text avec la liste des symptomes avec occurence (dans l'ordre alphabétique)	 
				 				 
				 SymptomFile syptomFile = new SymptomFile((ArrayList<String>)fileList);				 
				 syptomFile.fileSymptom((ArrayList<String>)fileList);
	}

}
