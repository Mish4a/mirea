import java.lang.*;
public class Ball {
    private String game;
    private int amount;

    public String getGame() {
        return game;
    }

    public Ball(String g, int a){
        game = g;
        amount = a;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Мяч для игры в " +
                game +
                " есть на складе в количестве " + amount +
                " штук";
    }
}

