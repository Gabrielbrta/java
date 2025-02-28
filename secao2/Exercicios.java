package secao2;

public class Exercicios {
    public static void main(String[] args) {
        /*
         * Ex 001:
         */
        int dez = 10;
        int dobro = dez * 2;
        System.out.println(dobro);

        /**
         * Ex 002:
         */
        char letra = 'B';
        int ascii = (int) letra;
        System.out.println(ascii);

        /*
         * Ex 003:
         */
        double valor1 = 15.75;
        double valor2 = 20.40;
        double soma = valor1 + valor2;

        System.out.println(soma);

        /*
         * Ex 004:
         */
        long doisBilhoes = 2_000_000_000L;
        int castingBilhao = (int) doisBilhoes;

        System.out.println(castingBilhao);

        /*
         * Ex 005:
         */
        String helloWorld = "Olá, Mundo!";
        String mensagem = helloWorld + " Bem-vindo ao Java!";

        System.out.println(mensagem);
        
    }

}