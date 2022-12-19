import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean x = true;
        while (x==true) {
            System.out.println("Сколько яблок нужно почистить?");
            Scanner console = new Scanner(System.in);
            if (console.hasNextInt()) {
                int apples = console.nextInt();
                peelsApples(apples);
                x = false;
            } else {
                System.out.println("Требуется ввести целое число");
            }
        }

    }
    public static void peelsApples(int apples) {
        while(apples>0) {
            System.out.println("Осталось почистить " + apples + " яблок!");
            apples--;
        }
    }
}