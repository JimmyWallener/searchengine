package se.gritacademy.search.utils;


public class DestructString {
	
	/*
	 * Purpose is to strip searchfield from non characters and split whitespace
	 * in order to create a length list of words.
	 * The words will be used as values in search and the lenght to create dynamic values to prepareStatement
	 * 
	 * */
	
	public String[] destructureString(String string) {
		
		String[] listWords = null;
		
		for (int i = 0; i < string.length();i++) {
			
			listWords = string.split("\\s+");
			
			for (int j = 0; j < listWords.length; j++) {
				listWords[j] = listWords[j].replaceAll("[^a-zA-Z0-9]", "");
			}
			
		}
		return listWords;
		
	}

}
