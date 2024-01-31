import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*- Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:

Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
 */
public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> multiplos3e5 = numeros.stream()
            .filter(n -> n % 3 == 0 || n % 5 == 0)
            .peek(System.out::println)
            .collect(Collectors.toList());

        int somamultiplos3e5 = multiplos3e5.stream()
            .reduce(0, Integer::sum);
        System.out.println("A soma dos múltiplos de 3 e 5 é: " + somamultiplos3e5);

    }
}
