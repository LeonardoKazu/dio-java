package banco_digital_oo;

public class ContaCorrente extends Conta{
    public ContaCorrente() {
        super();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===-Conta Corrente-===");
        super.imprimirExtrato();
    }
}
