package collections.list.operacoes2;

public class MainCarrinho {
    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.adicionarItem("Whey", 99, 2);
        carrinhoCompras.exibirItens();

        carrinhoCompras.adicionarItem("Post-it", 4, 5);
        carrinhoCompras.adicionarItem("Post-it", 4, 5);
        carrinhoCompras.adicionarItem("Caneta Muji", 5, 2);

        carrinhoCompras.exibirItens();

        System.out.println(carrinhoCompras.calcularValorTotal());

    }
}
