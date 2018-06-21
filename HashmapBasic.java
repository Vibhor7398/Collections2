package collections2;

import java.util.*;

public class HashmapBasic {

	public static HashMap<Character,Integer> NumOfVowels(String word){
		HashMap<Character,Integer> hash = new HashMap<>();
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'||
					word.charAt(i)=='A'||word.charAt(i)=='E'||word.charAt(i)=='I'||word.charAt(i)=='O'||word.charAt(i)=='U')
			{
			if(hash.containsKey(word.charAt(i)))
			{
				int count = hash.get(word.charAt(i));
				count++;
				hash.put(word.charAt(i), count);
			}
			else {
				hash.put(word.charAt(i), 1);
			}
		}
		}
		return hash;
		
	}
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some line (preferably containing many vowels): ");
		str = sc.nextLine();
		System.out.println(NumOfVowels(str));

	}

}
