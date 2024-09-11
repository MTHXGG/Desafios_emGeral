/* Crie um programa em Java que permita cadastrar produtos em uma
 lista. Cada produto deve ter um nome e um preço. O programa deve
 apresentar um menu ao usuário com as opções:
       4. Cadastrar Produto
       5. Pesquisar Produto (pelo nome)
       6. Listar todos os Produtos
       7. Sair
O programa deve ser dividido em três classes: Produto, Menu, e
Main.

A classe Produto deve armazenar o nome e o preço, Menu
deve controlar as opções e Main deve gerenciar o fluxo do
programa.
*/


/* Main deve gerenciar o fluxo do programa */

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenu();
    }
}