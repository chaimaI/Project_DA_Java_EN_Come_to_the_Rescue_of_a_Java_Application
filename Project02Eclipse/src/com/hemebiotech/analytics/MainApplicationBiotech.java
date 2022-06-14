package com.hemebiotech.analytics;

public class MainApplicationBiotech {

	public static void main(String[] args) {
		
		// Lecture du fichier et retourne la liste des symptomes
		
				String file ="symptoms.txt";
				
				ReadSymptomDataFromFile rd = new ReadSymptomDataFromFile();
				rd.GetListSymptome(file);
				System.out.println(rd.GetListSymptome(file));
		
				// Retourne la liste des symptomes avec occurences (dans l'ordre alphabétique)		
				 SymptomeListOccurence oc = new SymptomeListOccurence();
				 oc.countFrequencies((ArrayList<String>)rd.GetListSymptome(file));
		
	}

}
