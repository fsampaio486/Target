package target_sistemas;

import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String invertida = "";
        
        System.out.print("Digite uma palavra de sua preferência: ");
        String original = sc.nextLine();
        
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
       
        System.out.println("String invertida: " + invertida);
        
        sc.close();
    }
}