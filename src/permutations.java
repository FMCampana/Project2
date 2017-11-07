import java.io.*;
import java.util.*;

public class permutations {

	public static void main(String[] args)
	   {
		System.out.println("enter a word: ");
		Scanner sc = new Scanner(System.in);
		 String word = sc.nextLine();  
		
		 for (String s : permutations(word))
	      { 
			 System.out.println(s);
			 } 		 
				         
	      }			
	   
	 public static ArrayList<String> permutations(String word)
	   {
	      ArrayList<String> result = new ArrayList<String>();

	      // The empty string has a single permutation: itself
	      if (word.length() == 0) 
	      { 
	         result.add(word); 
	         return result; 
	      }
	      else
	      {
	         // Loop through all character positions
	         for (int i = 0; i < word.length(); i++)
	         {
	            // Form a shorter word by removing the ith character
	            String shorter = word.substring(0, i) + word.substring(i + 1);

	            // Generate all permutations of the simpler word
	            ArrayList<String> shorterPermutations = permutations(shorter);

	            // Add the removed character to the front of
	            // each permutation of the simpler word, 
	            for (String s : shorterPermutations)
	            {
	               result.add(word.charAt(i) + s);
	            
	            }
	         // Return all permutations
	      }
		return result;         

	   }
	      }
}
	 


