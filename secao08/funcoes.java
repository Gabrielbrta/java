package secao08;
import java.util.Scanner;

public class funcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean calculadora = true;

        while (calculadora) {
            int opcao;
            opcao = opcao();

            switch(opcao) {
                case 1:
                    soma();
                    break;

                case 2: 
                    divisao();
                    break;
                default:
                    System.out.println("opção não existente");
                    calculadora = false;
            }
        }

        scanner.close();
    }

    public static int opcao() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Que operação aritmética deseja executar?");
        System.out.println("1 - Soma");
        System.out.println("2 - Divisão");
        System.out.println("3 - Subtração");
        System.out.println("4 - Multiplicação");

        int opcao = scanner.nextInt();

        return opcao;
    }

    // public static boolean continuar() {

    // }

    public static double soma() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número");
        double n2 = scanner.nextDouble();
        double resultado = n1 + n2;
        System.out.println("A soma dos números " + n1 + " + " + n2 + " é " + resultado);
        return resultado;
    }

    public static double divisao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número");
        double n2 = scanner.nextDouble();
        double resultado = n1 / n2;
        System.out.println("A divisão dos números " + n1 + " + " + n2 + " é " + resultado);
        return resultado;
    }


}