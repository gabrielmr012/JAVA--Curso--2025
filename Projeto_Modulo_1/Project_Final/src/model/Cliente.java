package model;

public class Cliente extends Pessoa {

    public Cliente(String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone, endereco);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
