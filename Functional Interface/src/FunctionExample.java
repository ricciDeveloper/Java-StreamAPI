import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
       //Lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //function com lambda para dobrar os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //função para dobrar todos os numeros da lista e salvar em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());

        //imprimir a lista de numeros dobrados
        numerosDobrados.forEach(System.out::println);
    }
}
