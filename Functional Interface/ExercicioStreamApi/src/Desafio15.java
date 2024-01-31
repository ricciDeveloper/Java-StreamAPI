import java.util.Arrays;
import java.util.List;


public class Desafio15 {/*- Desafio 15 - Verifique se a lista contém pelo menos um número negativo:

    Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console. */
   
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Exemplo com Filter, o que é menos eficinte que com anyMatch
        /*List<Integer> negativos = numeros.stream()
            .filter(n -> n < 0)
            .collect(Collectors.toList());

        
            System.out.println("Negativos da lista: " + negativos);*/
        boolean negativos = numeros.stream()
            .anyMatch(n -> n < 0);
        
        if (negativos == true){
            System.out.println("A lista contém pelo menos um negativo");
        } else {
            System.out.println("Não contém negativos na lista.");
        }
    }
}
