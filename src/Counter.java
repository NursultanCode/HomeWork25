public class Counter {
    private  int win;
    private int lose;
    private int draw;
    private int count;

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Counter() {
        win = 0;
        lose = 0;
        draw = 0;
        count = 0;
    }

    public void printResult() {
        double cof = win*100.0/count;
        System.out.printf("%7s|%7s|%7s|%7s|%7s%n","win","lose","draw","count","Win %");
        System.out.printf("%7s|%7s|%7s|%7s|%7.2f%n",win,lose,draw,count,cof);
    }
}
