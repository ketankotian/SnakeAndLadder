import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {

		int start = 0, end = 100;
		System.out.println("Game starts at position : " + start);

		Random r = new Random();
		int dice = r.nextInt(6) + 1;
		System.out.println("Dice value : " + dice);

		int position = 0;

		while (position <= 100) {
			int option = r.nextInt(3);
			// option-0=ladder,1=snake,2=no-play

			if (option == 0) {
				if (position == end) {
					System.out.println("Player Wins !!! ");
					break;
				} else if (position + dice > 100) {
					position = position - dice;
				}
			}

			switch (option) {
			case 0:
				position = position + dice;
				System.out.println("Player climbs ladder : " + position);
				break;

			case 1:
				if (position >= 0) {
					position = position - dice;
					System.out.println("Snake pulls the player : " + position);
				} else {
					position = 0;
					System.out.println("Snake pulls the player : " + position);
				}
				break;
			case 2:
				System.out.println("Player is in no-play : " + position);
				break;
			}
		}

	}

}
