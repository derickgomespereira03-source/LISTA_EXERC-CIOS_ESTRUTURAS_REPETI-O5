import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0, positivos = 0, negativos = 0;
        String resposta;

        do {
            System.out.print("Digite um numero inteiro: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }

            System.out.print("Deseja encerrar o programa? (S/N): ");
            resposta = sc.next().toUpperCase();

        } while (!resposta.equals("S"));

        System.out.println("\n=== Resultados ===");
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        sc.close();
    }
}
