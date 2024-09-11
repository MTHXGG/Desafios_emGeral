import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Pesquisar Produto (pelo nome)");
            System.out.println("3. Listar todos os Produtos");
            System.out.println("4. até a próxima");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    pesquisarProduto();
                    break;
                case 3:
                    listarProdutos();
                    break;
                case 4:
                    System.out.println("Adeus...");
                    break;
                default:
                    System.out.println("você é burro!");
            }
        }
    }

    private void cadastrarProduto() {
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        Produto produto = new Produto(nome, preco);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private void pesquisarProduto() {
        System.out.println("Digite o nome do produto que deseja pesquisar:");
        String nome = scanner.nextLine();

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println(produto);
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    private void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }
}