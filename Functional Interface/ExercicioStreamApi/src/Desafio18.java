import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    /*- Desafio 18 - Verifique se todos os números da lista são iguais:

Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console. */
public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    //um boolean para checar se são iguais
    boolean todosIguais = numeros.stream()     
        //removemos elementos duplicados
                //count retorna os elementos da lista. Se restar 1 elemento, os números são todos iguais
        .distinct().count()==1;
        //impressão do resultado da verificação dos números da lista.
    if(todosIguais){
        System.out.println("Todos números da lista são iguais");
    }else {
        System.out.println("Os números da lista não são todos iguais.");
    }
}
}
