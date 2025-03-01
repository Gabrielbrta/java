package secao04;
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float nota3 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3; 

        System.out.println("A média do aluno " + nome + " é: " + media);

        if(media >= 7) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }

        scanner.close();
    }
}
