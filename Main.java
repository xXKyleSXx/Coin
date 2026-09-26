public class Main {
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