import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball("Футбол", 18 );
        Ball b2 = new Ball("Баскетбол",  10 );
        b1.setGame("Воллейбол");
        System.out.println(b1);
        System.out.println(b2);
    }
}