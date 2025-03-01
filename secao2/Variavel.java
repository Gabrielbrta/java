package secao2;

public class Variavel {
    public static void main(String[] args) {
        
        // String nome = "Gabriel";

        // System.out.println("Nome: "+ nome);

        // 2 - Atribuição de variável com outra
        // String teste = "teste";

        // String testando = teste;

        // System.out.println(testando);
        
        // se for int ele não aceita, mesmo que atribua a uma variável que tenha mais capacidade.
        // long numeroGrande = 999999999999999L; 
        // long numeroGrande2 = numeroGrande;

        // System.out.println(numeroGrande2);


        // 3 - Comentários

        /*
         comentário em blocoasdasd
         asdasd
         asdasd
         adsad
         */

         /**
          * comentario em doc
          * asdasldkjasdjasldj
          * asdjaslkdjasd
          */

        // 4 - Strings

          String firstName = "Gabriel";
          String lastName = "Correa";

          System.out.println(firstName + " " +lastName);


        // 5 - Char
        //só aceita aspas simples e um único caractere

          char letra = 'A';

          System.out.println(letra);

        // 6 - int

        int numero = 80;
        System.out.println(numero);

        // 7 - long

        long numeroGiga = 999_999_999_999L;
        System.out.println(numeroGiga);

        // 8 - double
        double decimalGrande = 19.99;
        System.out.println(decimalGrande - 10);

        // type casting

        //conversão implicita int -> long -> double
        int numero2 = 42;
        
        long numeroLong = numero2;

        double numeroDouble = numeroLong;

        System.out.println(numeroLong);
        System.out.println(numeroDouble);

        //explicito (narrowing)

        double valorDouble = 9.78;
        int valorInt =  (int) valorDouble;

        System.out.println(valorInt);

        char letra2 = 'A';

        int codigoAscii = (int) letra2;
        System.out.println(codigoAscii);

        // Constantes

        final int DIAS_DA_SEMANA  = 7;

        System.out.println("Dias da semana: " + DIAS_DA_SEMANA);
    }
}
