package  exeception.creation;
public class  Conta{
    private  double saldo;
    private  String nome, cpf;

    public  Conta(String nome, String cpf, double saldo){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(saldo);
    }


    public String getNome(){return nome;}
    public void setNome(String nome) {
        this.nome = nome;
    }
    public  String getCpf(){return cpf;}
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSaldo() {
        return saldo;
    }

    public  void  setSaldo(double saldo){
        this.saldo = (saldo < 0)? saldo:saldo;
    }
    public  void  deposita (double valor){
        setSaldo  ((valor < 0) ? saldo:saldo+valor);
    }

    public  void  saca (double valor) throws  SaldoInsuficienteException{
        if (getSaldo() > valor){
            setSaldo(getSaldo()-valor);
        }
        else {
            throw  new  SaldoInsuficienteException("Seu saldo e :" +this.saldo+"voce tento sacar"+valor);

        }

    }
    public String toString(){
        return "Cliente: "+ this.nome + "\nCpf: " + this.cpf + "\nSaldo: " + this.saldo;
    }

}