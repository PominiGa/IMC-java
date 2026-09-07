import java.util.Scanner;

public class Programa {
    public void calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        String imcFormatado = String.format("%.2f", imc);
        System.out.println("Seu imc é: " + imcFormatado);

        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc < 18.49) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.50 && imc < 24.99) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Acima do peso");
        } else {
            System.out.println("Obesidade");
        }
    }
    public static void main(String[] args) {

        System.out.print("Digite seu peso: ");
        Scanner scanner = new Scanner(System.in);
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        Programa programa = new Programa();
        programa.calcularIMC(peso, altura);
    }
}