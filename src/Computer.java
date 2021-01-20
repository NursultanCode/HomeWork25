import java.util.Random;

public class Computer{
    Choice choice;

    public Computer(int i) {
        Random random = new Random();
        int n = random.nextInt(5)+1;
        switch (n){
            case 1:
                choice = Choice.ROCK;
                break;
            case 2:
                choice = Choice.SCISSORS;
                break;
            case 3:
                choice = Choice.PAPER;
                break;
            case 4:
                choice = Choice.SPOCK;
                break;
            case 5:
                choice = Choice.LIZARD;
                break;
        }
    }
}
