import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        List<Veiculo> veiculos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n--- MENU ESTACIONAMENTO ---");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Entrada de Veículo");
            System.out.println("4 - Registrar Saída de Veículo");
            System.out.println("5 - Listar Veículos no Estacionamento");
            System.out.println("6 - Total de valores pagos em um mês");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1 : {
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    sc.nextLine();

                    System.out.print("Dia cadastro: ");
                    int dia = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Mes cadastro: ");
                    int mes = sc.nextInt();
                    sc.nextLine();


                    System.out.print("Ano cadastro: ");
                    int ano = sc.nextInt();
                    sc.nextLine();


                    System.out.print("Fidelizado? (true/false): ");
                    boolean fidelizado = sc.nextBoolean();
                    sc.nextLine();



                    Data dataCadastro = new Data(dia, mes, ano, 0, 0);
                    Cliente cliente = new Cliente(cpf, nome, dataCadastro, fidelizado);
                    clientes.add(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                }
                case 2 : {
                    System.out.println("\n--- LISTA DE CLIENTES ---");
                    for (Cliente c : clientes) {
                        System.out.println("CPF: " + c.getCpf() + " | Nome: " + c.getNome());
                    }
                }
                case 3 : {
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Dia entrada: ");
                    int dia = sc.nextInt();
                    System.out.print("Mes entrada: ");
                    int mes = sc.nextInt();
                    System.out.print("Ano entrada: ");
                    int ano = sc.nextInt();
                    System.out.print("Hora entrada: ");
                    int hora = sc.nextInt();
                    System.out.print("Minuto entrada: ");
                    int minuto = sc.nextInt();
                    sc.nextLine();

                    System.out.print("O cliente é identificado? (s/n): ");
                    String resp = sc.nextLine();
                    Cliente cliente = null;
                    if (resp.equalsIgnoreCase("s")) {
                        System.out.print("Digite o CPF do cliente: ");
                        String cpfBusca = sc.nextLine();
                        for (Cliente c : clientes) {
                            if (c.getCpf().equals(cpfBusca)) {
                                cliente = c;
                                break;
                            }
                        }
                    }

                    Data entrada = new Data(dia, mes, ano, hora, minuto);
                    Veiculo v = new Veiculo(placa, modelo, entrada, cliente);
                    veiculos.add(v);
                    System.out.println("Entrada registrada!");
                }
                case 4 : {
                    System.out.print("Informe a placa do veículo para saída: ");
                    String placa = sc.nextLine();
                    Veiculo veiculoSaida = null;
                    for (Veiculo v : veiculos) {
                        if (v.getPlaca().equalsIgnoreCase(placa) && v.getSaida() == null) {
                            veiculoSaida = v;
                            break;
                        }
                    }
                    if (veiculoSaida != null) {
                        System.out.print("Dia saída: ");
                        int dia = sc.nextInt();
                        System.out.print("Mes saída: ");
                        int mes = sc.nextInt();
                        System.out.print("Ano saída: ");
                        int ano = sc.nextInt();
                        System.out.print("Hora saída: ");
                        int hora = sc.nextInt();
                        System.out.print("Minuto saída: ");
                        int minuto = sc.nextInt();

                        Data saida = new Data(dia, mes, ano, hora, minuto);
                        veiculoSaida.registrarSaida(saida);

                        System.out.println("Saída registrada! Valor pago: R$" + veiculoSaida.getValorPago());
                    } else {
                        System.out.println("Veículo não encontrado no estacionamento.");
                    }
                }
                case 5 : {
                    System.out.println("\n--- VEÍCULOS NO ESTACIONAMENTO ---");
                    for (Veiculo v : veiculos) {
                        if (v.getSaida() == null) {
                            System.out.println("Placa: " + v.getPlaca() + " | Modelo: " + v.getModelo());
                        }
                    }
                }
                case 6 : {
                    System.out.print("Informe o mês (número): ");
                    int mesBusca = sc.nextInt();
                    float total = 0;
                    for (Veiculo v : veiculos) {
                        if (v.getSaida() != null && v.getSaida().getMes() == mesBusca) {
                            total += v.getValorPago();
                        }
                    }
                    System.out.println("Total pago no mês " + mesBusca + ": R$" + total);
                }
                case 0 : System.out.println("Saindo...");
                default : System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
