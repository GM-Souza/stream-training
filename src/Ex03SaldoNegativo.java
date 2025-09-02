import java.util.List;

public class Ex03SaldoNegativo {
    public static void main(String[] args) {
        List<Double> doubleList = List.of(3000.00,1000.00,-2000.00,-4000.00);

        List<Double> valoresNegativos = doubleList.stream().filter(v -> v<0).toList();
        System.out.println(valoresNegativos);


    }
}
