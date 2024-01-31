import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;


public class Desafio17 {
    /*- Desafio 17 - Filtrar os números primos da lista:

Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console. */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //criamos uma lista inteira
        List<Integer> primos = numeros.stream()
            //filtro de numeros menor que 2
            .filter (n -> {
                if (n < 2){
                    return false; //não é primo
                }
                //laço para passar pelos números, caso seja divisivel por algum deles além dele mesmo, será false
                for( int i = 2 ; i <= Math.sqrt(n); i++){
                    if(n % i == 0){
                        return false; //Não é primo
                    }
                }
                //True para primos divisiveis por 1 e ele mesmo
                return true; //é primo
                //coletamos e colocamos na lista criada para os primos
            }).collect(Collectors.toList());

            //se a lista de primos não estiver vazia, imprimimos os numeros primos.
            if (!primos.isEmpty()){
                System.out.println("Números primos da lista: " + primos);
            }else { 
                System.out.println("não há primos na lista. ");
            }
       
    }
}
