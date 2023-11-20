package dataType;

public class Vowel {

	public static void main(String[] args) {
		String input= "Welcome";
		String vowel= "aeiou";
		System.out.println("vowel in '" + input +" ':");
		for (int i=0; i<input.length();i++) {
		char c=input.charAt(i);
		if(vowel.contains(String.valueOf(c))) {
		System.out.println(c + "  ");
		}
		}
	}

}
