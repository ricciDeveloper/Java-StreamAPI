import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio10 {
    /*- Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:

Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console. */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        Map<Boolean, List <Integer>> resultado = numeros.stream()
        //seleciona os ímpares
            .filter(n-> n % 2 != 0)
            //filtra os multiplos de 3 e 5
            .filter(n -> n % 3 ==0 ||  n % 5 ==0)
            //usamos collect, com collector e o método grouping By, para separar os multiplos de 3 e 5 em true. E outros impares em false
            .collect(Collectors.groupingBy(n -> n %3 == 0 ||n % 5 ==0 ));

            //imprimindo os resultados
            System.out.println("Valores múltiplos de 3 ou 5 agrupados:");
            //multiplos de 3 e 5 agrupados
            System.out.println("multiplos de 3 ou 5: " + resultado.get(true));
            //Outros impares, resultará em null, pois o exercicio pede apenas multiplos 3 e 5
            System.out.println("outros ímpares: "+ resultado.get(false));

        }
}
