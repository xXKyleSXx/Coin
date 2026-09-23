public class Player {
    private int balance;
    public Player(int b) {
        balance = b;
    }
    public int getBalance() {
        return balance;
    }
    public void flip (Coin c, String guess, int risk) {
        c.flip();
        if (c.getState().equals(guess))
            balance += risk;
        else balance -= risk;

    Player squeezycheeks = new PLayer(100);
    squeezycheeks.flip(penny, "tails", 50)
    System.out.println(squeezycheeks.getBalance());
    }
}