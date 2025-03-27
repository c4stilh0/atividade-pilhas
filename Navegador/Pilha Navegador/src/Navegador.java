import java.util.Scanner;
import java.util.Stack;

public class Navegador {
    private Stack<String> pilhaVoltar;
    private Stack<String> pilhaAvancar;
    private String paginaAtual;

    public Navegador() {
        pilhaVoltar = new Stack<>();
        pilhaAvancar = new Stack<>();
        paginaAtual = "Página Inicial";
    }

    public void visitarPagina(String novaPagina) {
        pilhaVoltar.push(paginaAtual); // Guarda a página atual na pilha de voltar
        paginaAtual = novaPagina;
        pilhaAvancar.clear(); // Ao visitar uma nova página, a pilha de avançar é apagada
        exibirEstado();
    }

    public void voltar() {
        if (!pilhaVoltar.isEmpty()) {
            pilhaAvancar.push(paginaAtual); // Move a página atual para a pilha de avançar
            paginaAtual = pilhaVoltar.pop(); // Recupera a página anterior
        }
        exibirEstado();
    }

    public void avancar() {
        if (!pilhaAvancar.isEmpty()) {
            pilhaVoltar.push(paginaAtual); // Move a página atual para a pilha de voltar
            paginaAtual = pilhaAvancar.pop(); // Recupera a próxima página
        }
        exibirEstado();
    }

    public void exibirEstado() {
        System.out.println("\nPágina Atual: " + paginaAtual);
        System.out.println("Voltar habilitado: " + !pilhaVoltar.isEmpty());
        System.out.println("Avançar habilitado: " + !pilhaAvancar.isEmpty());
    }

    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n1 - Visitar nova página");
            System.out.println("2 - Voltar");
            System.out.println("3 - Avançar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite a URL da nova página: ");
                    String url = scanner.nextLine();
                    navegador.visitarPagina(url);
                    break;
                case 2:
                    navegador.voltar();
                    break;
                case 3:
                    navegador.avancar();
                    break;
                case 0:
                    System.out.println("Encerrando navegador...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
