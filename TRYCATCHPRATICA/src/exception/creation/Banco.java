// Coloque esta classe no mesmo pacote: exception.creation
package exception.creation;

import javax.swing.JOptionPane;

public class Banco {

    public static void main(String[] args) {
        // 1. Coleta de dados do cliente
        String nome = typeString("Digite o nome do cliente:");
        String cpf = typeString("Digite o CPF do cliente:");
        double saldoInicial = typeDouble("Digite o saldo inicial do cliente:");

        // Cria um objeto Conta com os dados informados
        Conta conta = new Conta(nome, cpf, saldoInicial);

        // 2. Operação de depósito
        double valorDeposito = typeDouble("Digite o valor do depósito:");
        conta.deposita(valorDeposito);
        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");

        // 3. Operação de saque
        double valorSaque = typeDouble("Digite o valor do saque:");

        // 4. Bloco try-catch para tratar o saque
        try {
            conta.saca(valorSaque);
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
        } catch (SaldoInsuficienteException e) {
            // Captura a exceção se o saldo for insuficiente e informa o usuário
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nOperação não realizada!", "Erro de Saque", JOptionPane.ERROR_MESSAGE);
        }

        // 5. Exibe os dados finais da conta
        JOptionPane.showMessageDialog(null, conta.toString(), "Estado Final da Conta", JOptionPane.INFORMATION_MESSAGE);


        // Dentro do método main() da classe Banco
        try {
            conta.saca(valorSaque); // Tenta executar o saque
        } catch (SaldoInsuficienteException e) {
            // Se a exceção for lançada, este bloco é executado.
            // e.getMessage() retorna a mensagem que você definiu ao criar a exceção.
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nOperação não realizada!");
        }


    }


    private static String typeString(String txt) {
        return JOptionPane.showInputDialog(null, txt);
    }


    private static double typeDouble(String txt) {
        String userInput;
        double valor = 0;
        boolean entradaValida = false;

        // Loop continua até que um número válido seja digitado
        while (!entradaValida) {
            userInput = JOptionPane.showInputDialog(txt);
            try {
                // Tenta converter a entrada do usuário para double
                valor = Double.parseDouble(userInput);
                entradaValida = true; // Se a conversão for bem-sucedida, sai do loop
            } catch (NumberFormatException e) {
                // Se a conversão falhar, informa o usuário e pede para tentar novamente
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número válido.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
            }
        }
        return valor;
    }
}
