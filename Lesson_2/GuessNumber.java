import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int computerNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        computerNumber = ((int) (1 + Math.random() * 100));
        System.out.println("Загадано число от 0 по 100, угадайте число");
        while (true) {
            if (isGuessed(player1) || isGuessed(player2)) {
                break;
            }
        }
    }

     private boolean isGuessed(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " введите число: ");
        int enteredNum = scanner.nextInt();
        if (enteredNum == computerNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число: " + computerNumber);
            return true;
        } else if (enteredNum > computerNumber) {
            System.out.println("Число " + enteredNum + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + enteredNum + " меньше того, что загадал компьютер");
        }
        return false;
    }
}