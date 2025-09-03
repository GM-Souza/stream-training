package lista01;

import java.util.List;

public class Ex09SomaPositivos {
    public static void main(String[] args) {
        List<Double> doubleList = List.of(100.00,-10.00,30.00,-20.00,100.00,200.00);
        double somaPositivos = doubleList.stream().filter(n -> n>0).reduce(0.0, Double::sum);

        System.out.println("Soma de positivos: "+somaPositivos);

    }
}
