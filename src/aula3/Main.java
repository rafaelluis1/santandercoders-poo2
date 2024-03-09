package aula3;

public class Main {
    public static void main(String[] args) {
        IConta contaCorrente = new ContaCorrente(1234);

        IConta contaPoupanca = new ContaPoupanca(4567);

        contaCorrente.depositar(5000.0);
        contaPoupanca.depositar(5000.0);

        System.out.println(contaCorrente.saldo());
        System.out.println(contaPoupanca.saldo());

        GerenciadorContas<IConta> gerenciador = new GerenciadorContas<>();

        System.out.println(gerenciador.transferir(contaPoupanca, contaCorrente, 200.0));
        System.out.println(contaCorrente.saldo());
        System.out.println(contaPoupanca.saldo());
        System.out.println(gerenciador.transferir(contaCorrente, contaPoupanca,  400.0));
        System.out.println(contaCorrente.saldo());
        System.out.println(contaPoupanca.saldo());
        System.out.println(gerenciador.transferir(contaPoupanca, contaPoupanca, 5000.0));


    }
}
