/*
Dada uma lista de valores de depósito (tipo double),
determine o maior valor absoluto.
 */

import java.util.List;


public class Ex02ListaMaior {
    public static void main(String[] args) {
        List<Double> doubleList = List.of(30.0,45.0, 50.0, 67.0, 92.0, 98.5, 99.9);
        double maiorValor = doubleList.stream()
                .mapToDouble(Double::doubleValue)
                .max().orElse(0);

        System.out.println(maiorValor);



    }
}
