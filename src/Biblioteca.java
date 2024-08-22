import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Método para adicionar um livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro" + livro.getTitulo() + "adicionado com sucesso!");

    }

    // Método para buscar livro pelo código
    public Livro buscaCod(int cod) {
        for (Livro livro : livros) {
            if (livro.getCod() == cod) {
                return livro; // Retorna o livro se o código for encontrado
            }
        }
        System.out.println("Código não encontrado!");
        return null; // Retorna null se nenhum livro com o código for encontrado
    }


    // Método para listar todos os livros
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca.");
        } else {
            System.out.println("Livros na biblioteca:");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    //Método para o empréstimo de livros
    public void emprestarLivro(String titulo, int cod) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getCod() == cod) {
                livro.emprestar();
            }
        }
    }

    public void removerLivro(int cod) {
        Scanner sc = new Scanner(System.in);
        // Buscar o livro pelo código
        Livro livroParaRemover = livros.stream()
                .filter(livro -> livro.getCod() == cod)
                .findFirst()
                .orElse(null);

        // Verifica se o livro foi encontrado
        if (livroParaRemover == null) {
            System.out.println("Código não encontrado!");
            return;
        }
        String resposta;
        do {
            System.out.println("Tem certeza que deseja excluir? \nS/N");
            resposta = sc.nextLine().trim().toUpperCase();

            // Verifica se a resposta é válida
            if (!resposta.equals("S") && !resposta.equals("N")) {
                System.out.println("Opção inválida. Digite 'S' para Sim ou 'N' para Não.");
            }
        } while (!resposta.equals("S") && !resposta.equals("N"));

        // Se o usuário confirmou com "S", remove o livro, caso contrário, cancela a exclusão
        if (resposta.equals("S")) {
            boolean removido = livros.remove(livroParaRemover);
            if (removido) {
                System.out.println("Livro " + livroParaRemover.getTitulo()  + " (Código: " + cod + ") removido com sucesso!");
            } else {
                System.out.println("Código não encontrado!");
            }
        } else {
            System.out.println("Operação de remoção cancelada.");
            return;
        }
    }
}
