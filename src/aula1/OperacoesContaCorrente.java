package aula1;

public interface OperacoesContaCorrente {
    public double realizaDeposito(ContaCorrente contaCorrente, Double deposito);
    public boolean realizaSaque(ContaCorrente contaCorrente, Double saque);

    default String imprimeSaque(ContaCorrente contaCorrente){
        return "Saldo: " + Double.toString(contaCorrente.getSaldo());
    }

}
