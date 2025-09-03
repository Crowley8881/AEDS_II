package exception.creation;

import javax.swing.JOptionPane;

public class Conta {
    private double saldo;
    private String nome, cpf;
    private final double limite = 200.00;

    public Conta(String nome, String cpf, double saldo) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(saldo);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public void deposita(double valor) { setSaldo(saldo + valor); }


    public void saca(double valor) throws SaldoInsuficienteException {
        if (valor > (this.saldo + this.limite)) {
            throw new SaldoInsuficienteException(
                    "Saldo e limite insuficientes para este saque.\n" +
                            "Seu saldo atual: R$" + this.saldo + "\n" +
                            "Seu limite: R$" + this.limite + "\n" +
                            "Saque máximo permitido: R$" + (this.saldo + this.limite) + "\n" +
                            "Você tentou sacar: R$" + valor
            );
        } else {
            this.saldo -= valor; // O saldo pode ficar negativo se usar o limite
            JOptionPane.showMessageDialog(null, "Saque de R$" + valor + " realizado com sucesso!");
        }
    }
    // ==================================================================

    @Override
    public String toString() {
        return "Cliente: " + this.nome + "\nCPF: " + this.cpf + "\nSaldo: R$" + this.saldo;
    }
}
