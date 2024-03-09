package aula1;
import aula1.OperacoesContaCorrenteImpl;
public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("1234", "456789");
        ContaCorrente conta2 = new ContaCorrente("1234", "789456");

        OperacoesContaCorrente operacao = new OperacoesContaCorrenteImpl();

        //System.out.println(operacao.realizaDeposito(conta1, 0d));
        System.out.println(operacao.realizaDeposito(conta1, 5000d));
        System.out.println(operacao.realizaSaque(conta1, 6000d));
        System.out.println(operacao.realizaSaque(conta1, 4500d));

        System.out.println(operacao.imprimeSaque(conta1));
        System.out.println(operacao.imprimeSaque(conta2));

    }

}
