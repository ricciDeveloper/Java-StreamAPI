import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Desafio2 {
    /*Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console. */
public static void main(String[] args) {
   List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 
    
   // Filtrando e imprimindo números pares
    numeros.stream()
        .filter(n->n%2==0)
        .forEach(System.out::println);

    int somaNumerosPares = numeros.stream()
        .filter(n->n%2==0)
        .reduce(0, Integer::sum);
        System.out.println("Soma dos números pares: " + somaNumerosPares);
}
}