import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de livros a serem listados: ");
        int numeroAdd = sc.nextInt();
        for (int i = 0; i < numeroAdd; i++) {
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


            sc.close();
            Livro livro = new Livro(titulo, autor, genero, ano, cod);

        }

        biblioteca.listarLivros();


    }
}