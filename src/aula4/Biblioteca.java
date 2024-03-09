package aula4;
import java.util.ArrayList;

public class Biblioteca {


    public void emprestarLivro(Livro livro) {
        if (!livro.isEmprestado()) {
            livro.setEmprestado(true);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro já emprestado!");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livro.isEmprestado()) {
            livro.setEmprestado(false);
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro já está na biblioteca!");
        }
    }
}
