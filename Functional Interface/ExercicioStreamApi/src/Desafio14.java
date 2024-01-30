import java.util.Arrays;
import java.util.List;

/*- Desafio 14 - Encontre o maior número primo da lista:

Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console. */
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Integer maiorPrimo = numeros.stream()
        //realizamos o filtro em lambda
        .filter(numero -> {
                //verifica se é maior que 2
            if ( numero < 2){
                return false; 
            }
            //iniciamos a variável de controle em 2, pois ja foi verificado acima se é maior q 2
                //bloco condicional pra verificar se o numero divido por i tem resto 0, se sim, tem um divisor a mais, e nao é primo

            for (int i = 2; i <=Math.sqrt(numero); i++){
                if (numero % i == 0){
                    return false;//não é primo 
                }
            }
            return true; //é primoo

        }).max(Integer::compareTo) //método para encontrar o maior
        .orElse(null);//evitar erro
         //condição para impressão
         
        if (maiorPrimo != null){
            System.out.println("O maior primo da lista é: " + maiorPrimo);
        }else{
            System.out.println("Não há primos na lista!");
        }
    }
}