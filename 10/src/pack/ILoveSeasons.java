package pack;

public class ILoveSeasons {
    private SeasonsEnum season;

    public ILoveSeasons(SeasonsEnum season) {
        this.season = season;
    }

    public SeasonsEnum getSeason() {
        return season;
    }

    public void ILove(){
        switch (season){
            case WINTER:
                System.out.println("I love Winter");
                break;
            case SPRING:
                System.out.println("I love Spring");
                break;
            case SUMMER:
                System.out.println("I love Summer");
                break;
            case AUTUMN:
                System.out.println("I love Autumn");
                break;
        }
    }
}
