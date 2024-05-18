package collections.list.operacoes1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefas(String descricao){
        List<Tarefa> tarefaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("Numero total de tarefas é: "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("Numero total de tarefas é: "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefas("Tarefa 2");
        System.out.println("Numero total de tarefas é: "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}
