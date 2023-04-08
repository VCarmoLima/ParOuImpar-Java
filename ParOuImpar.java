/**
 * ParOuImpar
 */
public class ParOuImpar {

    public String verificarParidade(int num) {

        if (num % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }

    }

    public static void main(String[] args) {
        ParOuImpar parOuImpar = new ParOuImpar();
        
        System.out.println(parOuImpar.verificarParidade(2)); // imprimir Par
        System.out.println(parOuImpar.verificarParidade(3)); // imprimir Ímpar
        System.out.println(parOuImpar.verificarParidade(10)); // imprimir Par
        System.out.println(parOuImpar.verificarParidade(11)); // imprimir Ímpar

    }

}