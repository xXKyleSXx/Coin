import java.util.Scanner;
public class Game {
    private Player player;
    private Coin coin;
    public Game() {
        player = new Player(100);
        coin = new Coin(Math.random());
        System.out.println("Your initial balance is 100");
    }
    public int getRisk() {
        Scanner s = new Scanner(System.in);
        System.out.println("How much would you like to risk?");
        int risk = s.nextInt();
        if (risk <= player.getBalance())
            return risk;
        else {
            System.out.println("No cheating little little boy");
            return getRisk();
        }
    }
    public void play(){
        Scanner s = new Scanner(System.in);
        System.out.println("");
        int risk = getRisk();
        System.out.println("Heads or tails? ");
        String guess = s.next().toLowerCase();
        boolean correct = player.flip(coin, guess, risk);
        if (correct) {
            System.out.println("Correct! You have " + player.getBalance());
        } else {
            System.out.println("Wrong, you have " + player.getBalance());
        }
        if (player.getBalance() > 0) play();
        else System.out.println("GAME OVER");
    }
}