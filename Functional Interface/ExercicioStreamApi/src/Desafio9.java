import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    /*- Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):

Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console. */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 
        /*a expressão numeros.stream().distinct().count() == numeros.size() verifica se o número de elementos distintos na stream é igual ao tamanho original da lista. Se forem iguais, significa que não há elementos duplicados na lista. A mensagem correspondente é exibida no console. */
        boolean semDuplicados = numeros.stream()
            .distinct()
            .count() == numeros.size();

            if(semDuplicados){
            System.out.println("São distintos");
            }else{
                System.out.println("Há duplicados.");
            }
        
    }
}
