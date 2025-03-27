import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Sistema de senhas do hospital
class GerenciadorSenhas {
    private Queue<Integer> filaDeSenhas;
    private int proximaSenha;
    private LinkedList<Integer> historico;

    public GerenciadorSenhas() {
        this.filaDeSenhas = new LinkedList<>();
        this.proximaSenha = 1;
        this.historico = new LinkedList<>();
    }

    // Método para gerar uma nova senha e adicioná-la à fila
    public void gerarSenha() {
        filaDeSenhas.add(proximaSenha);
        System.out.println("Senha gerada: " + proximaSenha);
        proximaSenha++;
    }

    // Método para chamar o próximo paciente da fila
    public void chamarProximo() {
        if (!filaDeSenhas.isEmpty()) {
            int senhaChamado = filaDeSenhas.poll();
            historico.add(senhaChamado);
            System.out.println("Chamando senha: " + senhaChamado);
        } else {
            System.out.println("Nenhuma senha na fila para chamar.");
        }
    }

    // Método para exibir o histórico de senhas chamadas
    public void exibirHistorico() {
        System.out.println("Histórico de senhas chamadas: " + historico);
    }
}

// Gerencia a interface textual do sistema
public class SistemaSenhasHospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorSenhas gerenciador = new GerenciadorSenhas();
        int opcao;
        
        do {
            System.out.println("\n===== Sistema de Senhas do Hospital =====");
            System.out.println("1 - Gerar senha");
            System.out.println("2 - Chamar próximo");
            System.out.println("3 - Exibir histórico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    gerenciador.gerarSenha();
                    break;
                case 2:
                    gerenciador.chamarProximo();
                    break;
                case 3:
                    gerenciador.exibirHistorico();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
