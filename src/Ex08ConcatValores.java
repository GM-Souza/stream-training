import java.util.List;
import java.util.stream.Collectors;

public class Ex08ConcatValores {
    public static void main(String[] args) {
        List<Double> doubleList = List.of(100.00,200.00,-10.00,2.0,-3.0, 400.00);

        String listaDeInteiros = doubleList.stream()
                .filter(v -> v > 0)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(listaDeInteiros);
    }
}
