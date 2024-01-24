import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateExample {
    /*predicate representa uma função que aceita um argumento do tipo T  e retorna um valor
     * booleano.
     *  É comumente utilizadopara filtrar elementos do stream com base em alguma condição
     */

     public static void main(String[] args) {
        //lista de palavras
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "c", "c#", "C++", "Ruby");

        //Cria um predicate para verificar se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() < 5;

        palavras.stream()
            .filter(maisDeCincoCaracteres)
            .forEach(System.out::println);
     }
    
}
