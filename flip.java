import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class flip {
	
public static void main (String[] args) throws InterruptedException {
	System.out.println("Would you like to flip a coin?");
	String flipChoices [] = {"Heads", "Tails"};
	ArrayList <String> flipResults = new ArrayList<String>();
	Scanner userInput = new Scanner(System.in);
		Character answer = userInput.next().charAt(0);
	Random coinFlip = new Random();
		
	if (answer.equals('y') || answer.equals('Y')) {
		
do {
	int side = coinFlip.nextInt(flipChoices.length);
	if (side == 0 || side == 1) {
		
		System.out.println(flipChoices[side]);
		flipResults.add(flipChoices[side]);
		Thread.sleep(250);
		System.out.println("Would you like to flip again?");
		Character answer2 = userInput.next().charAt(0);
		
		if (answer2.equals('n') ||answer2.equals('N')) {
			System.out.println(flipResults.toString());
			break;
		}
		
	}
	
	
}
while (answer.equals('y') || answer.equals('Y')); 
	}
	if (answer.equals('n') || answer.equals('N')) {
	System.out.println("Happy flipping!");
	}

}
}

