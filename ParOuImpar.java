import java.util.Scanner;

/**
 * ParOuImpar
 */

public class ParOuImpar {
    private Scanner scanner;

    public ParOuImpar() {
        scanner = new Scanner(System.in);
    }
    
    public String verificarParidade(int num) {

        if (num % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }

    public void saudacao(){
        System.out.println("Bem-vindo ao teste de paridade!");
    }

    public void despedida(){
        System.out.println("Obrigado por utilizar o teste de paridade!");
    }

    public static void main(String[] args) {
        ParOuImpar parOuImpar = new ParOuImpar();

        parOuImpar.saudacao();
        
        do {
            System.out.print("Digite um número inteiro: ");
            int num = parOuImpar.scanner.nextInt();

            String paridade = parOuImpar.verificarParidade(num);

            System.out.println("O número " + num + " é " + paridade);

            System.out.print("Deseja fazer um novo teste de paridade? (Sim ou Não): ");
        } while (parOuImpar.scanner.next().equalsIgnoreCase("Sim"));

        parOuImpar.despedida();
        parOuImpar.scanner.close();
    }
    
}