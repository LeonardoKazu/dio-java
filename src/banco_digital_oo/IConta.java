package banco_digital_oo;

public abstract interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
}
