import java.util.Random;

public class Computer{
    Choice choice;

    public Computer(int i) {
        Random random = new Random();
        int n = random.nextInt(5)+1;
        switch (n) {
            case 1 -> {
                choice = Choice.ROCK;
                System.out.println("Computer choose Rock!");
            }
            case 2 -> {
                choice = Choice.SCISSORS;
                System.out.println("Computer choose Scissors!");
            }
            case 3 -> {
                choice = Choice.PAPER;
                System.out.println("Computer choose Paper!");
            }
            case 4 -> {
                choice = Choice.SPOCK;
                System.out.println("Computer choose Spock!");
            }
            case 5 -> {
                choice = Choice.LIZARD;
                System.out.println("Computer choose Lizard!");
            }
        }
    }
}
