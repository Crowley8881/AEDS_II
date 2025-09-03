public class EntradaInvalida extends Exception {

    // Construtor sem argumentos
    public EntradaInvalida() {
        super("O número deve ser menor ou igual a 20.");
    }

    // Construtor com uma mensagem personalizada
    public EntradaInvalida(String mensagem) {
        super(mensagem);
    }
}