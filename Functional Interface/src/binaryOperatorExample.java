import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class binaryOperatorExample {
        /*Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
        É usada para realizar operações de redução em pares de elemento, como somar numeros ou combinar objetos;
         */

          public static void main(String[] args) {
            //Cria uma lista de numeros int
            List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
            
            //usar o binaryOperator com lambda  para somar dois números int

            
            //BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;
            BinaryOperator<Integer> somar = Integer::sum;
            //usar o binaryOperator para somar todos os numeros no Stream
            int resultado = numeros.stream()
                .reduce(0, somar);

            //imprimir o resultado da soma
            System.out.println("Soma dos números é: " + resultado);

          }
}
