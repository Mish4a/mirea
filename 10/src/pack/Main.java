package pack;

public class Main {
    public static void main(String[] args) {

        SeasonsEnum sn = SeasonsEnum.SUMMER;
        ILoveSeasons season = new ILoveSeasons(sn);
        season.ILove();
    }
}
