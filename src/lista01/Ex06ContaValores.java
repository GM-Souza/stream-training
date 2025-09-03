package lista01;/*
Conte quantos valores em uma lista são maiores que R$ 1.000,00.
 */

import java.util.List;

public class Ex06ContaValores {
    public static void main(String[] args) {
        List<Double> doubleList = List.of(100.0,500.00,600.00,1000.00,2000.00,3000.00);
        double contaValores = doubleList.stream()
                .filter(valor -> valor>1000.00).count();

        System.out.println("Valores maiores que 1000: "+contaValores);
    }
}
