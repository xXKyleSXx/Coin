import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    File file = new File("flips.txt");
    Scanner s = new Scanner(file);
    int heads = 0;
    int tails = 0;
    
    while (s.hasNext()) {
        if (s.next().equals("heads")) heads ++;
        else tails ++;
    }
    public static void main(String[] args) {
        Game g = new Game();
        g.play();

        Coin penny = new Coin();


        Coin nickel = new Coin(.9);

    Player squeezycheeks = new Player(100);
    squeezycheeks.flip(penny, "tails", 50);
    System.out.println(squeezycheeks.getBalance());
    }
}