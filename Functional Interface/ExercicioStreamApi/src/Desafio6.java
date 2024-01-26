import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    /*
     * - Desafio 6 - Verificar se a lista contém algum número maior que 10:

Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
     */
    
        public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean maiorQDez  = numeros.stream()
        //usamos o anyMatch pois Verifica se algum elemento da Stream atende ao predicado especificado.
            .anyMatch(n -> n >10);
            //condição após a verificação do anyMatch
        if(maiorQDez){
            System.out.println("Temos um número maior que 10 no array.");
        }else{
            System.out.println("Não temos um número maior que 10 no array.");
        }
    }
}
