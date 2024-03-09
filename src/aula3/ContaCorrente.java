package aula3;

public class ContaCorrente implements IConta{

    private int numeroConta;
    private double saldo;

    public ContaCorrente(int numeroConta){
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean depositar(double valor){
        if(valor <= 0.0){
            return false;
        }
        setSaldo(getSaldo() + valor);
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > getSaldo()){
            return false;
        }
        setSaldo(getSaldo() - valor);
        return true;
    }

    @Override
    public double saldo(){
        return getSaldo();
    }
}

