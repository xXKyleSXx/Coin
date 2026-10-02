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

        while (s.hasNext()) {
            if (s.next().equals("heads"))
                heads++;
            else
                tails++;
        }
        //The part where we flip 97 coins
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println(heads + tails);
        s.close();
        double se = standardError(.5, 97);
        System.out.println(se);
        double pHat = (double) tails / (heads + tails);
        System.out.println(pHat);
        System.out.println(2 * pHat - 1);
        double z = (pHat - .5) / se;
        System.out.println(z);
        //The other mystery player who flips a totally not rigged coin
        System.out.println(simulate(97, "tails", pHat, 2 * pHat - 1));
    }
    public static double standardError(double p, int sample) {
        return Math.sqrt (p * (1 - p) / sample);
    }
    public static int simulate(int flips, String guess, double tails, double risk) {
        Player p = new Player(100);
        Coin c = new Coin(tails);
        while (flips > 0) {
            p.flip(c, guess, (int)(risk * p.getBalance() + 0.5));
            flips--;
        }
        return p.getBalance();
    }
}