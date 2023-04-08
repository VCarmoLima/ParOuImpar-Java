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
    public static void main(String[] args) {
        ParOuImpar parOuImpar = new ParOuImpar();

        System.out.print("Digite um número inteiro: ");
        int num = parOuImpar.scanner.nextInt();

        String paridade = parOuImpar.verificarParidade(num);

        System.out.println("O número " + num + " é " + paridade);
    }
    
}