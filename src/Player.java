public class Player {
    Choice choice;

    public Player(int i) {
        switch (i) {
            case 1 -> {
                choice = Choice.ROCK;
                System.out.println("Player choose Rock!");
            }
            case 2 -> {
                choice = Choice.SCISSORS;
                System.out.println("Player choose Scissors!");
            }
            case 3 -> {
                choice = Choice.PAPER;
                System.out.println("Player choose Paper!");
            }
            case 4 -> {
                choice = Choice.SPOCK;
                System.out.println("Player choose Spock!");
            }
            case 5 -> {
                choice = Choice.LIZARD;
                System.out.println("Player choose Lizard!");
            }
        }
    }
}
