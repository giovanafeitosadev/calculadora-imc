import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Peso (kg): ");
        double peso = entrada.nextDouble();

        System.out.print("Altura (m): ");
        double altura = entrada.nextDouble();
    
        double imc = peso / (altura * altura);
        
        System.out.println();
        System.out.println("=== Resultado de " + nome + " ===");
        System.out.printf("IMC: %.1f%n", imc);
        
        entrada.close();
    }

}