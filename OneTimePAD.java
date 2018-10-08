import java.util.Scanner;

public class OneTimePAD {
	
	static void transformInput(Scanner scanner) {
		String line = scanner.nextLine().toLowerCase();
		String pad = "thequickbrownfoxjumpsoverthelazydog";
		int lengthPAD = pad.length();
		char[] key = pad.toCharArray(); //changes string to array of characters
		for (int i = 0; i < line.length(); i++) {
			char current = line.charAt(i); 
			//we have the char of the input letters
			int z = current-97;
			// this is the ASCII value minus 97 of that char
			int x = key[i%lengthPAD]-97;
			// once there's more than 35 input characters it starts the PAD key over
			int letterNum = (z+x)%26;
			// the numerical value of the new letter we got
			char letter = (char)(letterNum+97);
			// we change the numerical value of the letter into an actual letter
			System.out.print(letter);
			// print the letter
			}
	}

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		transformInput(scanner);
		scanner.close();
	}
}
