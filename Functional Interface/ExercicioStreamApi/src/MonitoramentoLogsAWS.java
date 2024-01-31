import java.util.*;

/*Neste desafio, você deve criar um programa em Java para realizar o monitoramento e análise de logs gerados na infraestrutura da AWS (Amazon Web Services). O programa receberá informações de eventos de diferentes serviços da AWS e realizará uma análise simples desses logs.

Entrada
Linha 1: A quantidade de logs a serem analisados;
Linhas Seguintes: Cada linha terá as informações de log de um determinado serviço AWS, no seguinte:
yyyy-MM-dd HH:mm:ss,{Nome do Serviço AWS},{Log do Evento Registrado Neste Serviço AWS}
Saída
O programa exibirá os resultados da análise, apresentando:

A quantidade de eventos específicos para cada log de serviço AWS lido na Entrada (em ordem de leitura):
Eventos por servico:
{Nome do 1º Serviço AWS}:{Quantidade de Logs do 1º Serviço AWS}
{Nome do 2º Serviço AWS}:{Quantidade de Logs do 2º Serviço AWS}
{Nome do Nº Serviço AWS}:{Quantidade de Logs do Nº Serviço AWS}
O serviço AWS que teve a maior* quantidade de eventos registrados:
Maior:{Nome do Serviço AWS}
O serviço AWS que teve a menor* quantidade de eventos registrados:
Menor:{Nome do Serviço AWS}
* Tenha como verdade que sempre teremos um serviço com maior incidência e outro com menor, ou seja, nunca teríamos um empate. Veja exemplos abaixo.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis. */
public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeLogs = scanner.nextInt();
        
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L) + 1);
            //TODO: Utilize o mapa para registrar/incrementar o serviço em questão.
        }

        //TODO: Identifique no mapa os serviços com maior e menor quantidade de logs.
        //      Dica: Utilize Java Streams para tornar essa tarefa mais simples.
        String servicoMaior = Collections.max(eventosPorServico.entrySet(), Map.Entry.comparingByValue()).getKey();
        String servicoMenor = Collections.min(eventosPorServico.entrySet(), Map.Entry.comparingByValue()).getKey();

        //TODO: Imprima a saída no padrão definido no enunciado deste desafio.
        System.out.println("Eventos por servico:");
        for (Map.Entry<String, Long> entry : eventosPorServico.entrySet()){
          System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("Maior:" + servicoMaior);
        System.out.println("Menor:" + servicoMenor);
        
        
    }
}