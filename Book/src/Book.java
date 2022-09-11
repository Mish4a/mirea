import java.lang.*;
public class Book {
    private String name;
    private String author;
    private int year;

    public String getName() {
        return name;
    }

    public Book(String n, String a, int y){
        name = n;
        author = a;
        year = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Книга " +
                 name +
                " автора " + author +
                " была написана в " + year +
                " году";
    }
    public void HowOld(){
        System.out.println("Книга "+name+" была написана "+(2022-year)+" лет назад.");
    }
}
