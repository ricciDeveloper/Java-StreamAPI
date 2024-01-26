import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    /*- Desafio 8 - Somar os dígitos de todos os números da lista:

Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console. */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 
        int somaDosDigitos = numeros.stream()
        /* a expressão lambda dentro do mapToInt realiza diretamente a soma dos dígitos, sem a necessidade de um método auxiliar separado. O método chars() é usado para obter uma stream de valores inteiros representando os caracteres na representação de string do número, e map(Character::getNumericValue) é usado para converter cada caractere em seu valor numérico. Em seguida, a função de soma (sum()) é usada para calcular a soma dos dígitos de cada número. A função sum() final fora do mapToInt é usada para calcular a soma total dos dígitos de todos os números da lista. */
            .mapToInt(numero -> Integer.toString(numero)
                .chars()
                .map(Character::getNumericValue)
                .sum())
                    .sum()
                    ;
                    System.out.println(" A soma dos dígitos é : " + somaDosDigitos);
    }
}
