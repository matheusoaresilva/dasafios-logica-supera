import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o valor monetário: ");
        double valor = sc.nextDouble();

        int[] notas = { 100, 50, 20, 10, 5, 2 };
        int[] moedas = { 100, 50, 25, 10, 5, 1 };
        String[] notasMoedas = { "nota(s) de R$ ", "moeda(s) de R$ " };

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            int quantidade = (int) (valor / notas[i]);
            valor %= notas[i];
            System.out.println(quantidade + " " + notasMoedas[0] + notas[i] + ".00");
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
            int quantidade = (int) (valor / (moedas[i] / 100.0));
            valor %= moedas[i] / 100.0;
            System.out.println(quantidade + " " + notasMoedas[1] + moedas[i] / 100.0);
        }

        sc.close();
    }
}
