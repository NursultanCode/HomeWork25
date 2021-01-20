import java.util.ArrayList;

public class Game {
    static ArrayList<Choice> rockWins = new ArrayList<>();
    static ArrayList<Choice> paperWins = new ArrayList<>();
    static ArrayList<Choice> scissorsWins = new ArrayList<>();
    static ArrayList<Choice> spockWins = new ArrayList<>();
    static ArrayList<Choice> lizardWins = new ArrayList<>();

    public Game() {
        rockWins.add(Choice.SCISSORS);
        rockWins.add( Choice.LIZARD);
        paperWins.add(Choice.ROCK);
        paperWins.add(Choice.SPOCK);
        scissorsWins.add(Choice.PAPER);
        scissorsWins.add(Choice.LIZARD);
        spockWins.add(Choice.SCISSORS);
        spockWins.add(Choice.ROCK);
        lizardWins.add(Choice.SPOCK);
        lizardWins.add(Choice.PAPER);
    }

    public static boolean getWinner(Choice playerChoice, Choice compChoice){
        switch (playerChoice){
            case ROCK -> {
                return rockWins.contains(compChoice);
            }
            case SCISSORS -> {
                return scissorsWins.contains(compChoice);
            }
            case PAPER -> {
                return paperWins.contains(compChoice);
            }
            case SPOCK -> {
                return spockWins.contains(compChoice);
            }
            case LIZARD -> {
                return lizardWins.contains(compChoice);
            }
        }
        return false;
    }
}
