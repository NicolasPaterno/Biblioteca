import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Empréstimo de Livros");
            System.out.println("4. Buscar código");
            System.out.println("5. excluir Livro");
            System.out.println("6. Devolução de um livro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Número de livros a serem listados: ");
                    int numeroAdd = sc.nextInt();
                    int i = 0;
                    while (i < numeroAdd) {
                        sc.nextLine();
                        System.out.println("Título do Livro:");
                        String titulo = sc.nextLine();
                        System.out.println("Autor do Livro:");
                        String autor = sc.nextLine();
                        System.out.println("Gênero do Livro:");
                        String genero = sc.nextLine();
                        System.out.println("Ano de publicação do Livro:");
                        int ano = sc.nextInt();
                        System.out.println("Código do Livro:");
                        int cod = sc.nextInt();
                        Livro livro = new Livro(titulo, autor, genero, ano, cod);
                        biblioteca.adicionarLivro(livro);
                        i++;
                    }
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:

                    break;
                case 4:
                    System.out.print("Código: ");
                    int codCheck = sc.nextInt();
                    Livro livroEncontrado = biblioteca.buscaCod(codCheck);
                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado com sucesso! \n" + livroEncontrado.toString());
                    }
                    break;
                case 5:
                    System.out.println("\ninsira o código do livro que deseja excluir:");
                    int codigoExcluir = sc.nextInt();
                    sc.nextLine();
                    biblioteca.removerLivro(codigoExcluir);
                    break;
                case 6:
                    System.exit(0);
                    break;
                case 7:
                    System.out.println("Saindo");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inexistente. Tente novamente.");
                    break;
            }
        }
        //sc.close();
    }


}
