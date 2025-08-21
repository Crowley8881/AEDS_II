public class Veiculo {
    private static int contador = 1;
    private int codigo;
    private String placa;
    private String modelo;
    private Data entrada;
    private Data saida;
    private float valorPago;
    private Cliente cliente;

    public Veiculo(String placa, String modelo, Data entrada, Cliente cliente) {
        this.codigo = contador++;
        this.placa = placa;
        this.modelo = modelo;
        this.entrada = entrada;
        this.cliente = cliente;
        this.valorPago = 0.0f; // calculado apenas na saída
    }

    // Cálculo do valor pago
    public void registrarSaida(Data saida) {
        this.saida = saida;

        int horasEstacionadas = calcularHoras(this.entrada, this.saida);
        this.valorPago = horasEstacionadas * 1.0f; // R$1 por hora

        if (cliente != null && cliente.isFidelizado()) {
            this.valorPago *= 0.9f; // desconto de 10%
        }
    }

    private int calcularHoras(Data entrada, Data saida) {
        int horasEntrada = entrada.getHora() + entrada.getDia() * 24;
        int horasSaida = saida.getHora() + saida.getDia() * 24;
        return Math.max(1, horasSaida - horasEntrada);
    }

    // Getters
    public int getCodigo() { return codigo; }
    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public Data getEntrada() { return entrada; }
    public Data getSaida() { return saida; }
    public float getValorPago() { return valorPago; }
    public Cliente getCliente() { return cliente; }
}
