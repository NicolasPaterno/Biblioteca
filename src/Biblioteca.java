import java.util.ArrayList;
import java.util.List;


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
                return livro;
            }
        }
        System.out.print("Código não encontrado!");
        return null;
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

    //public void removerLivro(String titulo, int cod) {
      //  for (Livro livro : livros) {
        //    if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getCod() == cod) {
          //      livro.excluir();
            //}
        //}
    //}
}
