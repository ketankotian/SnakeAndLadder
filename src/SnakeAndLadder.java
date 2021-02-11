import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {

		int start = 0, end = 100;
		System.out.println("Game starts at position : " + start);
		
		Random r = new Random();
		int dice = r.nextInt(6) + 1;
		System.out.println("Dice value : " + dice);
	}

}
