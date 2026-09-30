import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Game g = new Game();
        g.play();

        Coin penny = new Coin();

        Coin nickel = new Coin(.9);

        Player squeezycheeks = new Player(100);
        squeezycheeks.flip(penny, "tails", 50);
        System.out.println(squeezycheeks.getBalance());

        File file = new File("flips.txt");
        Scanner s = new Scanner(file);
        int heads = 0;
        int tails = 0;
        
        double se = standardError(.5,);

        while (s.hasNext()) {
            if (s.next().equals("heads"))
                heads++;
            else
                tails++;
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println(heads + tails);
        s.close();
    }
    public static double standardError(double p, int sample) {
        return Math.sqrt (p * (1 - p) / sample);
    }
}