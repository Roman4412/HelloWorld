import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int apples = console.nextInt();
        peelsApples(apples);

    }
    public static void peelsApples(int apples) {
        while(apples>0) {
            System.out.println("Осталось почистить " + apples + " яблок!");
            apples--;
        }
    }
}