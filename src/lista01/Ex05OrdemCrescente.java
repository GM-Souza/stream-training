package lista01;/*
Reordenar os valores fornecidos (tipo double) da lista em ordem decrescente.
 */

import java.util.Comparator;
import java.util.List;

public class Ex05OrdemCrescente {
    public static void main(String[] args) {
        List<Double> doubleList = List.of(100.00,200.0,300.00,400.00);
        List<Double> ordemDecrescente = doubleList.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Ordem decrescente: "+ordemDecrescente);
    }
}