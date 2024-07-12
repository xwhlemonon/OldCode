package OODay05_vis;

public class EnumTest {
    public static void main(String[] args) {
//        System.out.println(Seasons.SPRING.getSeasonName() + Seasons.SPRING.getSeasonDesc());
        Seasons[] seasons = Seasons.values();
        for (Seasons i : seasons) {
            System.out.println(i.name() + i.getSeasonName() + i.getSeasonDesc());
        }
    }
}
