import java.util.Scanner;

public class Livro {

    private String titulo;
    private String autor;
    private String genero;
    private int ano;
    private int quantidade;
    private int cod;
    private boolean emprestado;
    private boolean excluir;

    // Construtor
    public Livro(String titulo, String autor, String genero, int ano, int cod) {

        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
        this.quantidade = quantidade;
        this.cod = cod;
        this.emprestado = false;
        this.excluir = false;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public boolean isExcluir() {
        return excluir;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro: " + titulo + "Emprestado com sucesso.");
        } else {
            System.out.println("Livro: " + titulo + "Não disponível para empréstimo.");
        }
    }

    public void devolucao() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro: " + titulo + "Devolvido com sucesso.");
        } else {
            System.out.print("Livro: " + titulo + "Não está emprestado.");
        }
    }

    public void excluir() {
        if (!excluir) {
            excluir = true;
            Scanner sc = new Scanner(System.in);
            System.out.print("digite o código do livro que deseja excluir");

            //achar um jeito de pelo código excluir o livro
            ;
        }
        return;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\n" +
                " Autor: " + autor + "\n" +
                " Gênero: " + genero + "\n" +
                " Ano: " + ano + "\n" +
                " Quantidade: " + quantidade + "\n" +
                " Código: " + cod + "\n" +
                " Disponível: " + (emprestado ? "Não" : "Sim") + "\n";
    }
}


