import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio7 {
    /*- Desafio 7 - Encontrar o segundo número maior da lista:

Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */
public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    //Criamos uma variavel para ser atribuida ao segundo maior numero do array
    Integer segundoMaior = numeros.stream()
        //após chamarmos o stream, colocamos o método sorted, com comparator reverso a ordem natural (< p/ >)
            .sorted(Comparator.reverseOrder())
            //skip, método para pular o primeiro número maior, pois queremos o 2º
            .skip(1)
            //Puxamos o primeiro numero, após pular o primeiro, ou seja, o segundo maior
            .findFirst()
            //orElse para evitar retorno de nullPoint, oq geraria uma exception
            .orElse(null);
    //condição após verificação dos numeros
    if(segundoMaior != null){
        System.out.println("O segundo maior número da lista é: " + segundoMaior);
    }else{
        System.out.println("Não há segundo maior;");
    }        
        }
}
