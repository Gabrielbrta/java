package secao07_classificarProduto;
import java.util.Scanner;

public class ClassificarProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String produto1 = "Carro";
        String produto2 = "Moto";
        String produto3 = "Bala";
        float preco1;
        
        System.out.println("Digite o produto");
        String userProduct = scanner.next();
        
        boolean temProduto = userProduct.equalsIgnoreCase(produto1) ||
         userProduct.equalsIgnoreCase(produto2) ||
          userProduct.equalsIgnoreCase(produto3);

        if(temProduto) {
            System.out.println("Deseja alterar o preço do produto? (Sim/Não) ");
            String alterar = scanner.next();

            if(alterar.equalsIgnoreCase("sim")) {
                System.out.println("Digite o preço do produto: (alterar)");
                float novoPreco = scanner.nextFloat();
                preco1 = novoPreco;
                
                String classificacao = preco1 < 50 ? "Barato" : preco1 >= 50 && preco1 <= 100 ? "Moderado" : preco1 > 100 ? "Caro" : "Preço não identificado";
                
                System.out.println("O produto " + userProduct + " está classificado como " + preco1 + " " + classificacao);
            } else {
                System.out.println("Digite o preço do produto: ");
                float precoProduto = scanner.nextFloat();
                preco1 = precoProduto;
                
                String classificacao = preco1 < 50 ? "Barato" : preco1 >= 50 && preco1 <= 100 ? "Preço Moderado" : preco1 > 100 ? "Caro" : "Preço não identificado";
                
                System.out.println("O produto " + userProduct + " está classificado como " + preco1 + " " + classificacao);
            }
        } else {
            System.out.println("O produto não está no catalogo!");
        }
        scanner.close();
    }
}
