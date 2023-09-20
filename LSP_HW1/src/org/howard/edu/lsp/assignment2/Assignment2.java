package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class Assignment2 {

	public static void main(String[] args) {
		FileReader filename = new FileReader(); //creating an instance to read the file
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>(); //creating and defining the structure of the hashmap
		
		try {
			String filepath = filename.readToString("main/java/resources/testwords.txt"); //getting the file path to read
			System.out.println(filepath);
//			String [] separated = filepath.toLowerCase().replaceAll("[^a-zA-Z]", "").split(" "); //removing all non-characters)
			String[] separated = filepath.toLowerCase().split(" ");  //separating the file
			
			for (int x = 0; x< separated.length; x++) {
				if (separated[x].length() > 3) {
					if(hashmap.get(separated[x]) == null) {
						hashmap.put(separated[x], 1); //setting number of occurrences to 1
					}
					else {
						hashmap.put(separated[x], hashmap.get(separated[x]) + 1); //increasing occurrences
					}
				}
			}
			
			for (String i: hashmap.keySet()) {
				System.out.println(i + " " + hashmap.get(i)); //printing each hashmap key
			}
		}
		catch (FileNotFoundException e) { //error catching
			System.out.println("File not found in directory");
		}

	}

}
