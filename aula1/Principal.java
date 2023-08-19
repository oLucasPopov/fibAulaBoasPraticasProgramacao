import javax.swing.JOptionPane;

public class Principal {
  public static void main(String[] args) {
    float[] vetor = new float[10];

    for (int i = 0; i < 10; i++) {
      vetor[i] = Float.parseFloat(JOptionPane.showInputDialog("Insira um número!"));
    }

    float menorNumero = 0;
    float maiorNumero = 0;
    float soma = 0;
    float media;
    String vetorEmTexto = "";

    for (int i = 0; i < vetor.length; i++) {
      if ((vetor[i] < menorNumero) || (i == 0)) {
        menorNumero = vetor[i];
      }

      if ((vetor[i] > maiorNumero) || (i == 0)) {
        maiorNumero = vetor[i];
      }

      vetorEmTexto += Float.toString(vetor[i]) + ((i == vetor.length - 1) ? "" : ", ");
      soma += vetor[i];
    }

    media = (soma / vetor.length);

    String mensagem = String.format("Maior: %f\n"
        + "Menor: %f\n"
        + "Média: %f\n"
        + "Vetor: %s\n",
        maiorNumero,
        menorNumero,
        media,
        vetorEmTexto);

    JOptionPane.showMessageDialog(null, mensagem);
  }
}