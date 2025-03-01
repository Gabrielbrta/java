package secao2;
import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        // Scanner é uma classe que permite a leitura de dados do teclado

        // 1 - Testando Scanner
        /*
         * Métodos
         * nextLine() - Lê uma linha de texto
         * nextInt() - Lê um número inteiro
         * nextDouble() - Lê um número decimal  
         * next() - Lê uma única palavra
         * hasNext() - Verifica se há mais dados para ler
         * hasNextLine() - Verifica se há mais linhas para ler
         * close() - Fecha o scanner
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();
        
        System.out.println("Digite seu peso: ");
        float peso = scanner.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu imc é: " + imc);


        // 2 - problema do nextLine

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // solução é colocar um nextline para registrar o "Enter" e outro para armazenar o dado na variável.

        System.out.println("Digite um texto: ");
        String txt = scanner.nextLine();


        System.out.println("Os dados são n = " + n + " e txt = " + txt);

        // Nunca esquecer de fechar o scanner para melhorar a performance e evitar vazamentos de memória e travamentos.
        scanner.close();
    }
}
