import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNayara = new Dev();
        devNayara.setNome("Nayara");
        devNayara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Nayara" + devNayara.getConteudosInscritos());
        devNayara.progredir();
        System.out.println("progrediu...");
        System.out.println("Conteúdos inscritos Nayara" + devNayara.getConteudosInscritos());
        devNayara.progredir();
        System.out.println("progrediu...");
        System.out.println("Conteúdos inscritos Nayara" + devNayara.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Nayara" + devNayara.getConteudosConcluidos());
        System.out.println("Pontos de XP " + devNayara.calcularTotalXp());
        System.out.println("__________________________________________________");
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Pedro" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("progrediu...");
        devPedro.progredir();
        System.out.println("progrediu...");
        devPedro.progredir();
        System.out.println("progrediu...");
        System.out.println("Conteúdos inscritos Pedro" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Pedro" + devPedro.getConteudosConcluidos());
        System.out.println("Pontos de XP " + devPedro.calcularTotalXp());

    }
}
