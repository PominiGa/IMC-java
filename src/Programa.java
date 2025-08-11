import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        System.out.print("Digite seu peso: ");
        Scanner scanner = new Scanner(System.in);
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String imcFormatado = String.format("%.2f", imc);

        System.out.println("Seu imc é: "+ imcFormatado);

        if (imc < 17){
            System.out.println("Muito abaixo do peso");
        }
        if (imc > 17 && imc < 18.49){
            System.out.println("Abaixo do peso");
        }
        if (imc > 18.50 && imc < 24.99){
            System.out.println("Peso normal");
        }
        if (imc >25 && imc < 30){
            System.out.println("Acima do peso");
        }


    }
}