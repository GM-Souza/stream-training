package lista01;

import java.util.List;

public class Ex07AlgumValorMaiorQue {
    public static void main(String[] args) {
        List<Double> doubleList = List.of(60000.00,70000.00, 80000.00, 100000.00, 120000.00, 130000.00);

        boolean verificaValor = doubleList.stream()
                .anyMatch(v-> v>100000.00);

       if(verificaValor){
           System.out.println("valor maior que 100.000,00: ");
       }else{
           System.out.println("Não existe valor maior que 100.000,00");
       }
    }
}
