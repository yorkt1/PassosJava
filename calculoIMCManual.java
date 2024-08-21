import java.util.Scanner;


public class calculoIMCManual {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite para para somar:");

        int PrimeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo numero pra somar:");

        int SegundoNumero = scanner.nextInt();

      
        int soma = PrimeiroNumero + SegundoNumero;



        System.out.println("PRIMEIRO NUMERO  " + soma);

        scanner.close();
    }
}
