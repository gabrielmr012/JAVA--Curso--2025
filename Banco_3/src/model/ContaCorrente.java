package model;

public class ContaCorrente extends Conta {

    public ContaCorrente(String titular, int numconta, double saldo) {
        super(titular, numconta, saldo);
    }

    @Override
    public String toString() {
        return "ContaCorrente: " + "\nTitular: " + getTitular() + 
        "\nNumero da Conta: " + getNumconta() + "\nSaldo: " + getSaldo();
    }    
    
}
