package lista01;

import java.util.List;

public class Ex10ProdutoAcumulado {
    public static void main(String[] args) {
        List<Double> doubleList = List.of(0.2, 0.5, 0.3);
        double produtoAcumulado = doubleList.stream().reduce(1.0, (a, b) -> a * b);
        System.out.println(produtoAcumulado);
    }
}
