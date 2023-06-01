import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double r, lcubo, v, altura, largura, comprimento;

        do {
            menu();
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Cálculo do volume do cubo
                    System.out.print("\nDigite o lado do cubo: ");
                    lcubo = scanner.nextDouble();
                    v = volumeCubo(lcubo);
                    System.out.println("O volume do cubo de lado " + lcubo + " é: " + v);
                    break;
                case 2:
                    // Cálculo do volume do paralelepípedo
                    System.out.print("\nDigite as dimensões do paralelepípedo (altura, largura e comprimento):");
                    System.out.print("\nAltura: ");
                    altura = scanner.nextDouble();
                    System.out.print("Largura: ");
                    largura = scanner.nextDouble();
                    System.out.print("Comprimento: ");
                    comprimento = scanner.nextDouble();
                    v = volumeParalelepipedo(altura, largura, comprimento);
                    System.out.println("O volume do paralelepípedo com dimensões " + altura + "x" + largura + "x" + comprimento + " é: " + v);
                    break;
                case 0:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        } while (opcao != 0);
    }

    // Procedimentos e funções
    public static double volumeCubo(double lado) {
        return lado * lado * lado;
    }

    public static double volumeParalelepipedo(double altura, double largura, double comprimento) {
        return altura * largura * comprimento;
    }

    public static void menu() {
        System.out.println("(1) Calcular o volume do Cubo.");
        System.out.println("(2) Calcular o volume do Paralelepípedo.");
        System.out.println("(0) Sair.");
    }
}

