package secao06_IMC;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        float peso = scanner.nextFloat();

        System.out.println("Digite seu Altura: ");
        float altura = scanner.nextFloat();

        float IMC = peso / (altura * altura);


        boolean abaixoDoPeso = IMC < 18.5;
        boolean pesoNormal = IMC >= 18.5 && IMC <= 24.9;
        boolean sobrePeso = IMC >= 25 && IMC < 29.9;
        boolean obesidade = IMC >= 29.9;

        if(abaixoDoPeso) {
            System.out.println("O imc " + IMC + " está abaixo do peso normal");
        } 
        else if (pesoNormal) {
            System.out.println("O imc " + IMC + " está com o peso normal");
        }
        else if (sobrePeso) {
            System.out.println("O imc " + IMC + " está acima do peso normal");
        }
        else if (obesidade) {
            System.out.println("O imc " + IMC + " está muito acima do peso normal");
        } 
        else {
            System.out.println("Digite os dados corretamente");
        }

        scanner.close();
    }
}
