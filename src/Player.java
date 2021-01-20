public class Player {
    Choice choice;

    public Player(int i) {
        switch (i){
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
