import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Player player;
    Computer computer;
    Counter counter;
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
        counter = new Counter();
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

    public void startGame() {
        System.out.println("You are starting Game! Good Luck");
        askOperation();
    }

    private void askOperation() {
        try {
            System.out.println("Which game you want to play?");
            System.out.println("1 - simple Game, 2 - difficult game");
            Scanner scanner = new Scanner(System.in);
            String a = scanner.next();
            int n = Integer.parseInt(a);
            if (n < 1 || n > 2) throw new Exception("Incorrect input!");
            askChoice(n);
        }catch (ExceptionInInitializerError | Exception e){
            System.out.println(e.getMessage());
            askOperation();
        }

    }

    private void askChoice(int i) {
        try {
            if (counter.getCount() >= 5) throw new EndGameException();
            int max;
            if (i == 1){
                max = 3;
                System.out.println("Enter your choice");
                System.out.println("1-Rock, 2-Scissors, 3-Paper");
            }else{
                System.out.println("Enter your choice");
                System.out.println("1-Rock, 2-Scissors, 3-Paper, 4-Spock, 5-Lizard");
                max = 5;
            }
            Scanner scanner = new Scanner(System.in);
            String a = scanner.next();
            int n = Integer.parseInt(a);
            if (n<1 || n>max) throw new Exception("Incorrect input!");
            player = new Player(n);
            computer = new Computer(max);
            if (player.choice == computer.choice){
                counter.setDraw(counter.getDraw()+1);
                counter.setCount(counter.getCount()+1);
                System.out.println("It's Draw");
            }else{
                boolean win = getWinner(player.choice, computer.choice);
                if (win) {
                    counter.setWin(counter.getWin() + 1);
                    counter.setCount(counter.getCount()+1);
                    System.out.println("User Win");
                } else {
                    counter.setLose(counter.getLose() + 1);
                    counter.setCount(counter.getCount()+1);
                    System.out.println("User Lose");
                }
            }
            counter.printResult();
            askChoice(i);


        }catch (EndGameException e){
            System.out.println("Game is finished!");
        }catch (ExceptionInInitializerError | Exception e){
            System.out.println(e.getMessage());
            askChoice(i);
        }
    }
    public class EndGameException extends Exception{
    }
}
