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
                case 3: 
                    subtracao();
                    break;
                case 4: 
                    multiplicação();
                    break;
                default:
                    System.out.println("programa finalizado");
                    calculadora = false;
            }
        }
        scanner.close();
    }

    // navegação
    public static int opcao() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Que operação aritmética deseja executar?");
        System.out.println("1 - Soma");
        System.out.println("2 - Divisão");
        System.out.println("3 - Subtração");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Sair");

        int opcao = scanner.nextInt();

        return opcao;
    }

    // calculadora

    public static double[] getNumbers() {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[2];
        System.out.println("Digite o primeiro número");
        numbers[0] = scanner.nextDouble();
        System.out.println("Digite o segundo número");
        numbers[1] = scanner.nextDouble();

        return numbers;
    }

    public static double soma() {
        System.out.println("Somar");
        double[] numbers = getNumbers();
        double resultado = numbers[0] + numbers[1];
        System.out.println("A soma dos números " + numbers[0] + " + " + numbers[1] + " é " + resultado);
        return resultado;
    }

    public static double divisao() {
        System.out.println("Dividir");
        double[] numbers = getNumbers();
        double resultado = numbers[0] / numbers[1];
        System.out.println("A divisão dos números " + numbers[0] + " + " + numbers[1] + " é " + resultado);
        return resultado;
    }

    public static double subtracao() {
        System.out.println("Subtrair");
        double[] numbers = getNumbers();
        double resultado = numbers[0] - numbers[1];
        System.out.println("A subtração dos números " + numbers[0] + " + " + numbers[1] + " é " + resultado);
        return resultado;
    }

    public static double multiplicação() {
        System.out.println("Multiplicar");
        double[] numbers = getNumbers();
        double resultado = numbers[0] * numbers[1];
        System.out.println("A Multiplicação dos números " + numbers[0] + " + " + numbers[1] + " é " + resultado);
        return resultado;
    }
}