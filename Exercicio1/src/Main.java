import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número pra ver sua tabuada?");
        int n1 = scanner.nextInt();
        System.out.println("Tabuada de" + ":");
        for (int i = 0; i <= 10 ; i++) {
int resultado = n1 * i;
System.out.println (n1 + "x" + i + "=" + resultado);
        }
        }
    }
