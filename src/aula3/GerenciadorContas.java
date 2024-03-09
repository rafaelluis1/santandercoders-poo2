package aula3;

public class GerenciadorContas<T extends IConta> {

    public boolean transferir(T origem, T destino, double valor){
        if(!(origem.equals(destino)) && origem.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}
