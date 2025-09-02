import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== TESTADOR DE TRIÂNGULOS ===");

        // Loop principal para permitir que o usuário teste vários triângulos
        while (true) {
            System.out.println("\n--- Novo Teste de Triângulo ---");

            try {
                // 1. Pede ao usuário para inserir os três lados
                double ladoA = typeDouble("Digite o valor do primeiro lado (A):");
                double ladoB = typeDouble("Digite o valor do segundo lado (B):");
                double ladoC = typeDouble("Digite o valor do terceiro lado (C):");

                // 2. Tenta criar o objeto Triangulo
                Triangulo t = new Triangulo(ladoA, ladoB, ladoC);

                // 3. Se o triângulo for válido, determina e exibe o tipo
                int tipo = t.determinarTipo();
                String tipoMensagem = "";

                switch (tipo) {
                    case Triangulo.EQUILATERO:
                        tipoMensagem = "O triângulo é EQUILÁTERO (Tipo 0).";
                        break;
                    case Triangulo.ISOSCELES:
                        tipoMensagem = "O triângulo é ISÓSCELES (Tipo 1).";
                        break;
                    case Triangulo.ESCALENO:
                        tipoMensagem = "O triângulo é ESCALENO (Tipo 2).";
                        break;
                }
                System.out.println(tipoMensagem);

            } catch (TrianguloInvalidoError e) {
                // 4. Se o construtor lançar a exceção, ela é capturada aqui
                System.out.println("Erro: " + e.getMessage());
            }

            // 5. Pergunta ao usuário se deseja continuar
            System.out.print("\nDeseja testar outro triângulo? (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();

            if (!resposta.equals("s") && !resposta.equals("sim")) {
                break; // Sai do loop se o usuário não quiser continuar
            }
        }

        System.out.println("\nPrograma finalizado. Obrigado!");
        scanner.close();
    }

    /**
     * Método auxiliar para ler um valor double do usuário
     * Inclui tratamento para NumberFormatException
     */
    private static double typeDouble(String mensagem) {
        double valor = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print(mensagem + " ");

            try {
                String input = scanner.nextLine();
                valor = Double.parseDouble(input);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
            }
        }
        return valor;
    }
}