import java.lang.*;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args){
        int a;
        Author a1 = new Author("Донна Тартт", "dntr@mirea.ru", 'F');
        System.out.println(a1);
        a1.setEmail("asdsds@hhh.com");
        System.out.println(a1);
        System.out.println("Введите число ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Вы ввели " + a);

    }
}

