package secao05;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        float preco = scanner.nextFloat();
        int precoMinimo = 50;
        int precoMedio = 100;
        int negativo = -1;

        if(preco < precoMinimo && preco > negativo) {
            System.out.println("Barato");
        } else if(preco >= precoMinimo && preco <= precoMedio) {
            System.out.println("Médio");
        } else if(preco > precoMedio) {
            System.out.println("Caro");
        } else if (preco <= negativo) {
            System.out.println("Valor inválido ou negativo");
        } else {
            System.out.println("Ocorreu um erro, tente novamente!");
        }


        // /* ---------------------------------------------------------------- */

        // // LOGIN
        System.out.println("Digite seu usuário: ");
        String user = scanner.next();
        
        System.out.println("Digite sua senha: ");
        String password = scanner.next();

        if(user.equals("admin") && password.equals("1234")) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado!");
        }

        /* - - - -- -- - - -  -- - -  --         ------------------------ */
        // Par ou ímpar

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(resultado);
        
        // __________________________________________________________________

        //Dia da semana
        System.out.println("Que dia é hoje? ");
        int dia = scanner.nextInt();

        switch(dia) {
            case 1:
            case 7:
                System.out.println("É feriado");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É um dia útil");
                break;
            default:
                System.out.println("Dia inválido");
        }   

        /*---------------------------------------------------------------------- */
        // Intervalo

        System.out.println("Digite um número: ");
        int numero2 = scanner.nextInt();

        if(numero2 >= 10 && numero2 <= 20) {
            System.out.println("Dentro do intervalo");
        } else {
            System.out.println("Fora do intervalo");
        }
        /*---------------------------------------------------------------------- */
        // Vogal

        System.out.println("Digite uma Letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        switch(letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
        }
        scanner.close();
    }
}