import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input a number: ");
	double num = Double.parseDouble(s.nextLine());
	System.out.println(Math.abs(num));
	s.close();
	}

	public static void q2() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input a number: ");
	double num;
	num = s.nextDouble();
	System.out.print("Input another number: ");
	double num2;
	num2 = s.nextDouble();
	double dub = num / num2;
	System.out.println(Math.floor(dub));
	System.out.println(Math.ceil(dub));
	s.close();
	}

	public static void q3() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input a number: ");	
	double num;
	num = s.nextDouble();
	System.out.println(Math.round(Math.sqrt(num)));
	s.close();
	}

	public static void q4() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input a number: ");
	int num;
	num = s.nextInt();
	System.out.print("Input another number: ");
	int num2;
	num2 = s.nextInt();
	System.out.println(Math.pow(num, num2));
	s.close();	
	}

	public static void q5() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input a number: ");
	double num;
	num = s.nextDouble();
	System.out.print("Input another number: ");
	double num2;
	num2 = s.nextDouble();
	System.out.print("Input one more number: ");
	double num3;
	num3 = s.nextDouble();		
	double dub = Math.max(Math.max(num, num2), num3);
	double dub2 = Math.min(Math.min(num, num2), num3);	
	System.out.println(dub);
	System.out.println(dub2);
	s.close();
	}

	public static void q6() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	String word = s.nextLine();
	boolean sentence = word.contains("on");
	System.out.println(sentence);
	s.close();
	}

	public static void q7() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input the word mango: ");
	String secret = s.nextLine(); 
	boolean word = secret.equalsIgnoreCase("mango");
	System.out.println(word);
	s.close();
	}

	public static void q8() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input a word: ");
	String word = s.nextLine();
	System.out.print("Input a letter: ");
	String letter = s.nextLine();
	char letterText = letter.charAt(0);
	System.out.println(word.indexOf(letterText));
	System.out.println(word.lastIndexOf(letterText));
	s.close();
	}

	public static void q9() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	String word;
	word = s.nextLine();
	System.out.println("Your sentence is " + word.length() + " characters long");
	s.close();
	}
	public static void q10() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	String sentence = s.nextLine();
	System.out.print("Input a word to replace: ");
	String change = s.nextLine();
	System.out.print("What word would you like to replace it with: ");
	String replacement = s.nextLine();
	String newSentence = sentence.replace(change, replacement);
	System.out.println(newSentence);
	s.close();
	}

	public static void q11() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	String sentence = s.nextLine().trim();
	System.out.println(sentence.toUpperCase());
	System.out.println(sentence.toLowerCase());
	s.close();
	}

	public static void q12() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input a word: ");
	String word = s.nextLine();
	System.out.println(word.substring(0, 4));
	System.out.println(word.substring(word.length()- 4));
	s.close();
	}
	
}
