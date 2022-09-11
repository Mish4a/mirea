import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("Портрет Дориана Грея", "Оскар Уайлд", 1890 );
        Book b2 = new Book("Щегол", "Донна Тартт", 2013 );
        System.out.println(b2);
        b1.HowOld();
    }
}
