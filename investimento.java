import java.util.Scanner;

public class investimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aporte inicial (R$): ");
        double aporteInicial = scanner.nextDouble();

        System.out.print("Aporte mensal (R$): ");
        double aporteMensal = scanner.nextDouble();

        System.out.print("Taxa de juros ao mês (%): ");
        double taxaJuros = scanner.nextDouble() / 100;

        System.out.print("Período (em meses): ");
        int meses = scanner.nextInt();

        double total = aporteInicial;
        for (int i = 1; i <= meses; i++) {
            total = (total + aporteMensal) * (1 + taxaJuros);
        }

        System.out.printf("Valor final após %d meses: R$ %.2f%n", meses, total);
        scanner.close();
    }
}
