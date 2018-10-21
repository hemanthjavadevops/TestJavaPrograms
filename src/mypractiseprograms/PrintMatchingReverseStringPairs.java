package mypractiseprograms;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintMatchingReverseStringPairs {
	
	public static void main(String [] args) {
		
		String [] words = {"bod","xyz","bod","dob","zyx","sid"};
		Map<String,String> wordsMap = new HashMap<>();
		
		for(String word:words) {
			wordsMap.put(word, new StringBuffer(word).reverse().toString());
		}
		wordsMap.forEach((k,v) -> System.out.println("Key is : " + k + " Value is : " + v));
		
	 	Set<String> wordKeySet = wordsMap.keySet();
	 	Collection<String> wordValues = wordsMap.values();
	 	
	 	Map<String,String> reverseMatchingPairsMap = new HashMap<>();
	 	for(String wordKey: wordKeySet) {
	 		for(String wordValue: wordValues) {
	 			if(wordKey.equals(wordValue)) {
	 				if(!reverseMatchingPairsMap.containsKey(new StringBuffer(wordKey).reverse().toString())) {
	 					reverseMatchingPairsMap.put(wordKey, wordKey + "->"+new StringBuffer(wordKey).reverse().toString());
	 				}
	 			}
	 		}
	 	}
	 	reverseMatchingPairsMap.forEach((k,v) -> System.out.println("Key is : " + k + " Value is : " + v));
	}
}
