public class Main {
    public static void main(String[] args) {

        Coin penny = new Coin();
        System.out.println(penny);
        System.out.println(penny.getState());
        penny.flip();
        System.out.println(penny.getState());
        System.out.println(penny.getHeads());
        System.out.println(penny.getTails());

    public void flip() {
        if (Math.random() < 0.5) {
            state = "tails";
            tails++;
        }
        else {
            state = "heads";
            heads++
        }
    }
    public void flip(int flips) {
        while (flips > 0) {
            flip();
            flips--;
        }
    }
    }
}