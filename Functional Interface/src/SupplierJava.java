import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierJava {
    public static void main(String[] args) {
        //usar o supplier com lambda para fornecer uma saudação personalizada.

        Supplier<String> saudacao = ()-> "Olá, seja bem-vindo!";

        //obter lista com 5 saudações utilizando supplier

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        //Imprimir as saudações
        //reference method lambda
        listaSaudacoes.forEach(System.out::println);
    }
}