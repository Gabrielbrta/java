package secao05;

public class Switch {

    public static void main(String[] args){
        int idade = 0;
        
        switch(idade) {
            case 17:
                System.out.println("é menor de idade");
                break;
            case 18:
                System.out.println("já é adulto 18");
                break;
            case 19:
                System.out.println("tem 19 anos");
                break;
            default:
                System.out.println("Não existe");
        }
    }
}