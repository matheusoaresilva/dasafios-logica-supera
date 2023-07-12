import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de casos de teste: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número de casos de teste

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a linha a ser decifrada: ");
            String linha = scanner.nextLine();

            String decifrada = decifrarLinha(linha);
            System.out.println("Linha decifrada: " + decifrada);
        }

        scanner.close();
    }

    public static String decifrarLinha(String linha) {
        int tamanho = linha.length();
        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            sb.append(linha.charAt(i));
        }

        for (int i = tamanho - 1; i >= tamanho / 2; i--) {
            sb.append(linha.charAt(i));
        }

        return sb.toString();
    }
}
