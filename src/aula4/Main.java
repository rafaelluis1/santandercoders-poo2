package aula4;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.emprestarLivro(livro);
        biblioteca.devolverLivro(livro);
    }
}