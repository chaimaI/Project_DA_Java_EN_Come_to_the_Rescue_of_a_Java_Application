package com.hemebiotech.analytics;

import java.util.ArrayList;

public class MainApplicationBiotech {

	public static void main(String[] args) {
		
		// Lecture du fichier et retourne la liste des symptomes
		
				String file ="symptoms.txt";
				
				ReadSymptomDataFromFile rd = new ReadSymptomDataFromFile();
				rd.GetListSymptome(file);
				System.out.println(rd.GetListSymptome(file));
		
				// Retourne la liste des symptomes avec occurences (dans l'ordre alphabétique)		
				 SymptomListOccurence oc = new SymptomListOccurence();
				 oc.countFrequencies((ArrayList<String>)rd.GetListSymptome(file));
		
				 // Génération d'un nouveau fichier text avec la liste des symptomes avec occurence (dans l'ordre alphabétique)	 
				 
				 ReadSymptomDataFromFile spt = new SymptomFile();				 
				 spt.GetListSymptome(file);
				 
				 SymptomFile spt1 = new SymptomFile();				 
				 spt1.FileSyptome((ArrayList<String>) spt.GetListSymptome(file));
	}

}
