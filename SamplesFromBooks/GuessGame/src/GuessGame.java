import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class GuessGame {
    Random randomizer = new Random();
    int targetNumber;
    Player[] players = new Player[3];

    void startGame() {
        System.out.println("*** GUESS GAME ***\n\r");
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }
        while (true) {
            targetNumber = randomizer.nextInt(10);
            System.out.printf("A target number is %d\n\r", targetNumber);
            for (int i = 0; i < players.length; i++) {
                players[i].guess();
                System.out.printf("Player №%d has guessed number %d\n\r", i+1, players[i].number);
            }
            System.out.println("Let's check are there winners .. \n\r");
            boolean hasWinners = false;
            for (int i = 0; i < players.length; i++) {
                if (players[i].number == targetNumber) {
                    System.out.printf("Player №%d is the WINNER !\n\r", i+1);
                    hasWinners = true;
                }
            }
            if (hasWinners) {
                System.out.println("The Game is over.");
                break;
            } else {
                System.out.println("There are no winners. Let's try again! \n\r");
            }
        }
    }
}
