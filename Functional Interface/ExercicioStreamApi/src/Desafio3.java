import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    /*- Desafio 3 - Verifique se todos os números da lista são positivos:

Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console. */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        //passamos o array pelo streamm
        boolean positivo = numeros.stream()
            //allMatch(Predicate<T> predicate): Verifica se todos os elementos da Stream atendem ao predicado especificado. Exemplo: stream.allMatch(n -> n > 0)

            .allMatch( n -> n > 0);
        if(positivo){
            System.out.println("Todos números são positivos");
        }else{
            System.out.println("Nem todos números são positivos.");
        }
            
            

    }
}

