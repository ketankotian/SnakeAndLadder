import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {

		int start = 0, end = 100;
		System.out.println("Game starts at position : " + start);

		Random r = new Random();
		int dice = r.nextInt(6) + 1;
		System.out.println("Dice value : " + dice);

		int player1Position = 0, player2Position = 0, count = 0;
		boolean player1 = true, player2 = false;

		while (player1Position <= 100 && player2Position <= 100) {
			int option = r.nextInt(3);
			// option-0=ladder,1=snake,2=no-play

			if (option == 0) {
				if (player1 && player1Position == end) {
					System.out.println("Player1 Wins !!! ");
					player1 = true;
					player2 = false;
					break;

				} else if (player2 && player2Position == end) {
					System.out.println("Player2 Wins !!! ");
					player2 = true;
					player1 = false;
					break;

				} else if (player1Position + dice > 100) {
					player1Position = player1Position - dice;
				} else if (player2Position + dice > 100) {
					player2Position = player2Position - dice;
				}
			}

			switch (option) {
			case 0:
				if (player1) {
					player1Position = player1Position + dice;
					System.out.println("Player1 climbs ladder : " + player1Position);
					player1 = true;
					player2 = false;
					count++;
				} else {
					player2Position = player2Position + dice;
					System.out.println("Player2 climbs ladder : " + player1Position);
					player2 = true;
					player1 = false;
					count++;

				}
				break;

			case 1:
				if (player1) {
					player1Position = player1Position - dice;
					if (player1Position >= 0) {
						System.out.println("Snake pulls the player1 : " + player1Position);
					} else {
						player1Position = 0;
						System.out.println("Snake pulls the player1 : " + player1Position);
					}
					player1 = true;
					player2 = false;

					count++;
				} else {
					player2Position = player2Position - dice;
					if (player2Position >= 0) {
						System.out.println("Snake pulls the player2 : " + player2Position);
					} else {
						player1Position = 0;
						System.out.println("Snake pulls the player2 : " + player2Position);
					}
					player2 = true;
					player1 = false;

					count++;
				}
				break;
			case 2:
				System.out.println("Player1 is in no-play : " + player1Position);
				System.out.println("Player2 is in no-play : " + player2Position);
				count++;
				break;
			}
			System.out.println("count : " + count);
		}

	}
}
