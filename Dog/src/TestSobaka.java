import java.lang.*;
public class TestSobaka {
    public static void main(String[] args){
        Sobaka s1 = new Sobaka("Smart", 5);
        Sobaka s2 = new Sobaka("Bob", 2);
        Sobaka s3 = new Sobaka("Mi", 4);
        s3.setAge(3);
        System.out.println(s2);
        s1.intoHumanAge();
        s2.intoHumanAge();
        s3.intoHumanAge();
    }
}
