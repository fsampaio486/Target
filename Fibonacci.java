package target_sistemas;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numFib = 1, numFibAnterior = 0, valor;
        boolean pertence = false;
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Insira o valor inteiro que desejar: ");
        valor = sc.nextInt();

        while (numFib <= valor) {
            numeros.add(numFib);
            int temp = numFib;
            numFib += numFibAnterior;
            numFibAnterior = temp;
        }

        for (int j = 0; j < numeros.size(); j++) {
            if (numeros.get(j) == valor) {
                pertence = true;
            }
        }

        if (pertence) {
            System.out.println("Pertence à sequência de Fibonacci");
        } else {
            System.out.println("Não pertence à sequência de Fibonacci");
        }

        sc.close();
    }
}
