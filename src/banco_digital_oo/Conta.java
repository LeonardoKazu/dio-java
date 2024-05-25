package banco_digital_oo;

public abstract class Conta implements IConta{

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Agência: "+agencia);
        System.out.println("Número: "+numero);
        System.out.printf("%.2f%n",saldo);
    }
}

