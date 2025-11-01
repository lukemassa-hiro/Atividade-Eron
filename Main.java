import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = input.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = input.nextInt();

        int z = x + y;

        System.out.println("A soma é: " + z);

        input.close();
    }
}
