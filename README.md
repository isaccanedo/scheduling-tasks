# Getting Started

# 1. O que você construirá?
Você construirá um aplicativo que imprime a hora atual a cada cinco segundos usando a ```@Scheduled``` anotação do Spring .

# 2. Adicionando a dependência awaitility

Os testes complete/src/test/java/com/example/schedulingtasks/ScheduledTasksTest.java requerem a awaitility biblioteca.

Versões posteriores da biblioteca awaitility não funcionam para este teste, então você deve especificar a versão 3.1.2.

Para adicionar a biblioteca awaitility ao Maven, adicione a seguinte dependência:

```
< dependência >
  < groupId > org.awaitility </ groupId >
  < artifactId > aguardo </ artifactId >
  < versão > 3.1.2 </ versão >
  < escopo > teste </ escopo >
</ dependency >
```

A anotação @Scheduled define quando um método específico é executado.

Este exemplo usa ```fixedRate```, que especifica o intervalo entre as chamadas do método, medido a partir da hora de início de cada chamada. Existem outras opções , como ```fixedDelay```, que especifica o intervalo entre as chamadas medido a partir da conclusão da tarefa. Você também pode usar ```@Scheduled(cron=". . .")``` expressões para agendamento de tarefas mais sofisticado.


```@SpringBootApplication``` é uma anotação de conveniência que adiciona todos os seguintes:

- @Configuration: marca a classe como uma fonte de definições de bean para o contexto do aplicativo.

- @EnableAutoConfiguration: Diz ao Spring Boot para começar a adicionar beans com base nas configurações de classpath, outros beans e várias configurações de propriedade. Por exemplo, se spring-webmvc estiver no caminho de classe, esta anotação sinaliza o aplicativo como um aplicativo da web e ativa comportamentos-chave, como configurar um DispatcherServlet.

- @ComponentScan: Diz ao Spring para procurar outros componentes, configurações e serviços no pacote com / example, permitindo que ele encontre os controladores.

