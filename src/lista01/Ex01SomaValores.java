package lista01;/*
Dada uma lista de valores (tipos double) em uma única classe,
 calcule a soma de todos os valores que excedem R$ 5.000,00.
 */

import java.util.List;

public class Ex01SomaValores {
    public static void main(String[] args) {
        List<Double> doubleList = List.of(4000.00,5000.00,6000.00, 7000.00, 8000.00);
        double soma = doubleList.stream()
                .filter(v -> v > 5000.00) // Filtra para manter apenas os valores > 5000.00
                .mapToDouble(Double::doubleValue) // Converte a Stream<Double> para DoubleStream
                .sum(); // Soma os valores da DoubleStream

        System.out.println("A lista de valores maiores que 5000.00 é: " + doubleList.stream().filter(v -> v > 5000.00).toList());

        System.out.println("A soma desses valores é: " + soma);
    }
}

