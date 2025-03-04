package secao05;

public class Condicionais {
    public static void main(String[] args) {
        // o que é boolean?
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println( isTrue );
        System.out.println( isFalse );


        // operadores de comparação
        int x = 10;
        // x é igual a 10?
        System.out.println(x == 10);
        // x é igual a nove?
        System.out.println(x == 9);
        // x é diferente de 5?
        System.out.println(x != 5);
        // x é diferente de 10?
        System.out.println(x != 10);
        // x é maior que 10?
        System.out.println(x > 10);
        // x é menor ou igual que 10?
        System.out.println(x <= 10);
        // x é maior ou igual que 10?
        System.out.println(x >= 10);
        // x é menor que 10?
        System.out.println(x < 10);
        // x é menor que 10 ou x é igual a 10?
        System.out.println(x < 10 || x == 10);


        // "=" é atribuição e "==" é comparação;

        // equals verifica se duas strings são iguais
        // equalsIgnoreCase verifica se duas strings são iguais, ignorando maiúsculas e minúsculas
        String nome = "João";
        String nome2 = new String("João");
        String frase = "O joão é burro";
        String frase2 = "O joÃO é burro";

        //false pois compara a referência de memória
        System.out.println(nome == nome2);
        
        //false pois compara a referência de memória
        System.out.println(frase == frase2);

        // false pois compara a referência de memória
        System.out.println(frase.equals(frase2));

        // true ignorando maiúsculas e minúsculas
        System.out.println(frase.equalsIgnoreCase(frase2));
    }
}
