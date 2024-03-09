package aula1;

public class OperacoesContaCorrenteImpl implements OperacoesContaCorrente{

    @Override
    public double realizaDeposito(ContaCorrente contaCorrente, Double deposito) {
        if (deposito <= 0){
            throw new IllegalArgumentException("Apenas valores positivos!");
        }
        contaCorrente.setSaldo(deposito);
        return contaCorrente.getSaldo();
    }

    @Override
    public boolean realizaSaque(ContaCorrente contaCorrente, Double saque) {
        if(saque <= contaCorrente.getSaldo()){
            contaCorrente.setSaldo(-saque);
            return true;
        }
        return false;
    }
}
