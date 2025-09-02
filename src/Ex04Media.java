/*
Calcule a média de todos os saldos fornecidos. Se a lista estiver vazia, o resultado deve ser 0.
 */
import java.util.List;

public class Ex04Media {
    public static void main(String[] args) {
        List<Double> doubleList = List.of(100.0, 200.0, 300.0, 400.0);

        double media = doubleList.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
        System.out.println("Media dos valores: "+media);
    }
}
