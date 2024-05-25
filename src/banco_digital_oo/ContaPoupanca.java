package banco_digital_oo;

public class ContaPoupanca extends Conta{
    public ContaPoupanca() {
        super();
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("===-Conta Poupança-===");
        super.imprimirExtrato();
    }
}