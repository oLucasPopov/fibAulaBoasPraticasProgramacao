
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Test {
    public static void main(String[] args) {
        ReadCsv read = new ReadCsv();
        List<BolsaFamilia> dados = read.getData();

        List<BolsaFamilia> salaryStream = dados
                .stream()
                .sorted(Comparator.comparing(BolsaFamilia::getValor).reversed())
                .collect(toList());

        Double highestSalary = salaryStream
                .stream()
                .mapToDouble(BolsaFamilia::getValor)
                .max()
                .getAsDouble();

        Double lowestSalary = salaryStream
                .stream()
                .mapToDouble(BolsaFamilia::getValor)
                .min()
                .getAsDouble();

        Double medianSalary = salaryStream
                .stream()
                .mapToDouble(BolsaFamilia::getValor)
                .average()
                .getAsDouble();

        List<BolsaFamilia> highestSalaries = salaryStream
                .stream()
                .limit(5)
                .collect(toList());

        System.out.println("Maior valor pago: " + highestSalary.toString());
        System.out.println("Menor valor pago: " + lowestSalary.toString());
        System.out.println("Média do valor pago: " + medianSalary.toString());

        System.out.println("\nMaiores salários:");
        highestSalaries.forEach(b -> System.out.println(b.getValor()));
    }
}
