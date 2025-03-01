package secao03;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual tabuada você deseja ver?");

        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + i * num);
        }
        scanner.close();
    }
}
