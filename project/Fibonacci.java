import java.util.Scanner;
public class Fibonacci { 
    



    
    public static boolean verificaFibonacci(int num) {
        int a = 0, b = 1;
        while (b < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return b == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (verificaFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}

