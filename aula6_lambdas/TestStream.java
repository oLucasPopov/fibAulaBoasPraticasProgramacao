import java.util.List;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;

public class TestStream {
  public static void main(String[] args) {
    Aluno maria = new Aluno("Maria", "maria@gmail.com", 7.0);
    Aluno joao = new Aluno("Joao", "joao@gmail.com", 4.0);
    Aluno paulo = new Aluno("Paulo", "paulo@gmail.com", 9.0);
    Aluno anderlanderson = new Aluno("Anderlanderson", "anderlanderson@gmail.com", 9.5);
    Aluno anderlanderson1 = new Aluno("Anderlanderson", "anderlanderson@gmail.com", 10.0);
    List<Aluno> alunos = Arrays.asList(maria, joao, paulo, anderlanderson, anderlanderson1);

    List<Aluno> alunosFiltrados = alunos
        .stream()
        .filter(a -> a.getNota() > 8.0)
        .sorted((u1, u2) -> u1.getNome().compareTo(u2.getNome()))
        .collect(toList());

    alunosFiltrados.forEach(u -> System.out.println(u.getNome()));

    Double notaMaxima = alunos
        .stream()
        .mapToDouble(Aluno::getNota)
        .max().getAsDouble();

    Double notaMinima = alunos
        .stream()
        .mapToDouble(Aluno::getNota)
        .min().getAsDouble();

    Double total = alunos
        .stream()
        .mapToDouble(Aluno::getNota)
        .sum();

    Double media = alunos
        .stream()
        .mapToDouble(Aluno::getNota)
        .average().getAsDouble();

    System.out.println(total);
    System.out.println(media);
    System.out.println(notaMaxima);
    System.out.println(notaMinima);
  }
}
