import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int n = sc.nextInt();

        System.out.println("Digite o valor alvo: ");
        int k = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Digite os números do array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int contador = calcularDiferenca(arr, k);

        System.out.println("Número de pares com a diferença igual a " + k + ": " + contador);

        sc.close();
    }

    public static int calcularDiferenca(int[] arr, int k) {
        int contador = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    contador++;
                }
            }
        }

        return contador;
    }
}
