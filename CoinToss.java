import java.util.Random;

public class CoinToss {

    public static String flip() {
        Random rand = new Random();
        return rand.nextInt(2) == 0 ? "Heads" : "Tails";
    }

    public static void main(String[] args) {
        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < 100; i++) {
            String result = flip();
            if (result.equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        System.out.println("Heads: " + headsCount);
        System.out.println("Tails: " + tailsCount);
    }
}
