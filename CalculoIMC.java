import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criar uma instância de Scanner
        
        // Solicitar e ler a altura em centímetros e converter para metros
        System.out.println("Digite sua altura (em cm):");
        double alturaCm = scanner.nextDouble();
        double alturaM = alturaCm / 100; // Converter para metros

        // Solicitar e ler o peso
        System.out.println("Digite seu peso (em kg):");
        double peso = scanner.nextDouble();

        scanner.close(); // Fechar o scanner

        // Calcular o IMC
        double imc = calcularIMC(peso, alturaM);

        // Exibir o resultado
        System.out.printf("Seu IMC é: %.2f%n", imc);
        
        // Determinar a faixa do IMC
        String faixaIMC = determinarFaixaIMC(imc);
        System.out.println("Faixa de IMC: " + faixaIMC);
    }

    // Função para calcular o IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Função para determinar a faixa do IMC
    public static String determinarFaixaIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
