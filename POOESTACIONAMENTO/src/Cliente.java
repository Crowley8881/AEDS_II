public class Cliente {
    private String cpf;
    private String nome;
    private Data dataCadastro;
    private boolean fidelizado;

    public Cliente(String cpf, String nome, Data dataCadastro, boolean fidelizado) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.fidelizado = fidelizado;
    }

    // Getters e Setters
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Data getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(Data dataCadastro) { this.dataCadastro = dataCadastro; }

    public boolean isFidelizado() { return fidelizado; }
    public void setFidelizado(boolean fidelizado) { this.fidelizado = fidelizado; }
}
