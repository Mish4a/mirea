import java.lang.*;
public class Sobaka {
    private String name;
    private int age;

    public Sobaka(String n, int a){
        name = n;
        age = a;
    }
    public Sobaka(String n){
        name = n;
        age = 0;
    }
    public Sobaka(){
        name = "Смарт";
        age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}

