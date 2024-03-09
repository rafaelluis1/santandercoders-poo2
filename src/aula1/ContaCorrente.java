package aula1;

public class ContaCorrente {
    private String agencia;
    private String conta;
    private Double saldo;


    public ContaCorrente(String agencia, String conta){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0d;
    }
    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo += saldo;
    }
}
