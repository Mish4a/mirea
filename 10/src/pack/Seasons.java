package pack;

public class Seasons {
    private String title;

    private Seasons(String title) {
        this.title = title;
    }

    public static Seasons WINTER = new Seasons("Зима");
    public static Seasons SPRING = new Seasons("Весна");
    public static Seasons SUMMER = new Seasons("Лето");
    public static Seasons AUTUMN = new Seasons("Осень");

    @Override
    public String toString() {
        return "Seasons{" +
                "title='" + title + '\'' +
                '}';
    }
}
