import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {
    /*- Desafio 16 - Agrupe os números em pares e ímpares:

Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console. */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Temos a forma de criar duas listas, com filter para cada, usando o collect para coletar os valores para a nova lista

        /* 
        List<Integer> numerosPares = numeros.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        List<Integer> numerosImpares = numeros.stream() 
            .filter(n -> n % 2 == 1)
            .collect(Collectors.toList());

        System.out.println("números par da lista: " + numerosPares);
        System.out.println("números ímpar da lista: " + numerosImpares);
        */
        //Conseguimos fazer, criando um map e list dos numeros agrupados. Particionando eles em dois grupos definidos no predicado do lambda. True para resto de divisão 0 e False para resto 1.
        Map<Boolean , List<Integer>> numberosAgrupados = numeros.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        //Atribuimos True(par) a sua lista e False(impar) a sua lista
        List<Integer> numerosPar = numberosAgrupados.get(true);
        List<Integer> numerosImpar = numberosAgrupados.get(false);
        //Imprimindo os valores de cada lista
        System.out.println("números par da lista: " + numerosPar);
        System.out.println("números ímpar da lista: " + numerosImpar);

    }
}
