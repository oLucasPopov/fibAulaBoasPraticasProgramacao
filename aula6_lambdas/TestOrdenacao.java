import java.util.Arrays;
import java.util.List;

public class TestOrdenacao {
  public static void main(String[] args) {
    Aluno maria = new Aluno("Maria", "maria@gmail.com");
    Aluno joao = new Aluno("Joao", "joao@gmail.com");
    Aluno paulo = new Aluno("Paulo", "paulo@gmail.com");

    List<Aluno> alunos = Arrays.asList(maria, joao, paulo);

    alunos.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
  }
}
