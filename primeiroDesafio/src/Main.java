import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe a quantidade de linhas desejada: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Informe os números por linhas: ");

        for(int i = 0; i<n; i++){
            int num = sc.nextInt();

            if (num % 2 ==0){
                pares.add(num);
            }else {
                impares.add(num);
            }

        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        System.out.println("Números ordenados:");
        for (int par: pares) {
            System.out.println(par);
        }

        for (int impar: impares) {
            System.out.println(impar);
        }

        sc.close();
    }
}