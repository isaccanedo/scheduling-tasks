# Getting Started

# 1. O que você construirá?
Você construirá um aplicativo que imprime a hora atual a cada cinco segundos usando a ```@Scheduled``` anotação do Spring .

# 2. Adicionando a awaitilityDependência

Os testes complete/src/test/java/com/example/schedulingtasks/ScheduledTasksTest.javarequerem a awaitility biblioteca.

Versões posteriores da awaitilitybiblioteca não funcionam para este teste, então você deve especificar a versão 3.1.2.

Para adicionar a awaitilitybiblioteca ao Maven, adicione a seguinte dependência:

```
< dependência >
  < groupId > org.awaitility </ groupId >
  < artifactId > aguardo </ artifactId >
  < versão > 3.1.2 </ versão >
  < escopo > teste </ escopo >
</ dependency >
```

A Scheduledanotação define quando um método específico é executado.

Este exemplo usa ```fixedRate```, que especifica o intervalo entre as chamadas do método, medido a partir da hora de início de cada chamada. Existem outras opções , como ```fixedDelay```, que especifica o intervalo entre as chamadas medido a partir da conclusão da tarefa. Você também pode usar ```@Scheduled(cron=". . .")``` expressões para agendamento de tarefas mais sofisticado.

