package collections.list.operacoes2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> listaItens;

    public CarrinhoCompras() {
        listaItens = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> itensRemover = new ArrayList<>();
        for (Item item : listaItens){
            if (item.getNome().equalsIgnoreCase(nome)){
                itensRemover.add(item);
            }
        }
        listaItens.removeAll(itensRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item item : listaItens){
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }
}
