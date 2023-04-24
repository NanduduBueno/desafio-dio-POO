import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        Bootcamp bootcamp1 = new Bootcamp();

        Devs devXYZ = new Devs();
        Devs devABC = new Devs();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(6);

        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        bootcamp1.setNome("Bootcamp java developer");
        bootcamp1.setDescricao("Descrição bootcamp java developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        devXYZ.setNome("xyz");
        devXYZ.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos: " + devXYZ.getConteudosIncritos());
        devXYZ.progredir();
        devXYZ.progredir();
        System.out.println("Conteúdos inscritos: " + devXYZ.getConteudosIncritos());
        System.out.println("Conteúdos concluidos: " + devXYZ.getConteudosConcluidos());
        System.out.println("XP: " + devXYZ.calcularTotalXp());

        devABC.setNome("abc");
        devABC.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos: " + devABC.getConteudosIncritos());
        devABC.progredir();
        devABC.progredir();
        devABC.progredir();
        System.out.println("Conteúdos inscritos: " + devABC.getConteudosIncritos());
        System.out.println("Conteúdos concluidos: " + devABC.getConteudosConcluidos());
        System.out.println("XP: " + devABC.calcularTotalXp());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

    }
}
