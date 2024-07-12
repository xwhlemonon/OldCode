package OODay05;

public class SeasonsDemo {
    public static void main(String[] args) {
        Seasons[] seasons1 = Seasons.values();
        for (Seasons o1 : seasons1) {
            switch (o1) {
                case AUTUMN:
                    System.out.println("秋");
                    break;
                case SPRING:
                    System.out.println("春");
                    break;
                case SUMMER:
                    System.out.println("夏");
                    break;
                case WINTER:
                    System.out.println("冬");
                    break;
            }
        }
    }
}
