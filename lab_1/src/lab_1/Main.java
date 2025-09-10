package lab_1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Point saintPetepsburg = new Point(59.9386, 30.3141);
        Point moscow = new Point(55.7522, 37.6156);
        Point minsk = new Point(53.9, 27.5667);
        Point cities[] = {saintPetepsburg, moscow, minsk};

        HorseMovement horse = new HorseMovement();
        LegsMovement legs = new LegsMovement();

        Hero aleshaPopovich = new Hero(legs, minsk);
        Scanner scanner = new Scanner(System.in);

        int choise = 1;
        int indexCity = 0;
        while (true) {
            System.out.println("Алёша Попович находится в " + aleshaPopovich.getDislocation().string());
            System.out.println("Введите каким способом Алёша Попович будет добираться до цели:\n" +
                    "1) Пешем\n" +
                    "2) На осле\n" +
                    "3) Закончить");
            while (!scanner.hasNextInt()) {
                System.out.print("Это не число! Попробуйте заново: ");
                scanner.next();
            }
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    aleshaPopovich.setMovement(legs);
                    break;
                case 2:
                    aleshaPopovich.setMovement(horse);
                    break;
                case 3:
                    // Выйти из цикла программы
                    return;
                default:
                    System.out.println("Некорректный вариант");
                    break;
            }
            if ((indexCity+1) < (int)cities.length) {
                aleshaPopovich.move(cities[++indexCity]);
            }
        }
    }
}