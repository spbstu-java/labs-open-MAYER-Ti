package lab_1;

public class Main {

    public static void main(String[] args) {
        Point saintPetepsburg = new Point(59.9386, 30.3141);
        Point moscow = new Point(55.7522, 37.6156);
        Point minsk = new Point(53.9, 27.5667);

        HorseMovement horse = new HorseMovement();
        LegsMovement legs = new LegsMovement();

        Hero aleshaPopovich = new Hero(legs, minsk);

        System.out.println("Alesha Popovich dislocate in " + aleshaPopovich.getDislocation().string());
        aleshaPopovich.move(moscow);
        aleshaPopovich.setMovement(horse);
        System.out.println("Alesha Popovich dislocate in " + aleshaPopovich.getDislocation().string());
        aleshaPopovich.move(saintPetepsburg);
        System.out.println("Alesha Popovich dislocate in " + aleshaPopovich.getDislocation().string());
    }
}