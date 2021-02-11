import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {

		int start = 0, end = 100;
		System.out.println("Game starts at position : " + start);

		Random r = new Random();
		int dice = r.nextInt(6) + 1;
		System.out.println("Dice value : " + dice);

		int position = 0, option = r.nextInt(3);
		// option-0=ladder,1=snake,2=no-play

		switch (option) {
		case 0:
			position = position + dice;
			System.out.println("Player climbs ladder : " + position);
			break;
		case 1:
			position = position - dice;
			System.out.println("Snake pulls the player : " + position);
			break;
		case 2:
			System.out.println("Player is in no-play : " + position);
			break;

		}

	}

}
