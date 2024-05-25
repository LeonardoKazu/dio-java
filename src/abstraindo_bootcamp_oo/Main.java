package abstraindo_bootcamp_oo;

import abstraindo_bootcamp_oo.entities.Bootcamp;
import abstraindo_bootcamp_oo.entities.Curso;
import abstraindo_bootcamp_oo.entities.Dev;
import abstraindo_bootcamp_oo.entities.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição Curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLeo = new Dev();
        devLeo.setNome("Leonardo");
        devLeo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devLeo.getConteudosInscritos());
        devLeo.progredir();
        System.out.println(devLeo.calcularXp());
        System.out.println("Conteudos inscritos" + devLeo.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devLeo.getConteudosConcluidos());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());

        System.out.println(devJoao.calcularXp());
        System.out.println("Conteudos concluidos" + devJoao.getConteudosConcluidos());


    }
}

