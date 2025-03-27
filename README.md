# Projeto: Navegador Web Simulado

**Aluno:** Vinícius Castilho de Souza e Silva  
**Github:** [c4stilh0](https://github.com/c4stilh0/atividade-pilhas)

## Introdução

Este projeto implementa um simulador de navegação web com botões de avançar e voltar, utilizando a estrutura de dados **pilha (LIFO - Last In, First Out)** para armazenar o histórico de navegação.

## Implementação

### Estrutura de Dados
- **Pilha de Voltar**: Armazena as páginas visitadas anteriormente.
- **Pilha de Avançar**: Guarda páginas ao pressionar "voltar", permitindo retorno futuro.

### Principais Funções
- `visitarPagina(novaPagina)`: Salva a página atual na pilha de voltar, atualiza a página e limpa a pilha de avançar.
- `voltar()`: Move a página atual para a pilha de avançar e recupera a anterior.
- `avancar()`: Move a página atual para a pilha de voltar e recupera a próxima página.

## Testes Executados

| Teste | Ação | Resultado |
|---|---|---|
| 1 | Visitar 'Google' | Sucesso |
| 2 | Visitar 'YouTube' | 'Google' empilhado na pilha de voltar |
| 3 | Voltar | Retorna para 'Google', ativa avançar |
| 4 | Avançar | Retorna para 'YouTube', desativa avançar |

## Conclusão
O sistema de navegação baseado em pilhas foi implementado com sucesso, garantindo um histórico funcional de páginas visitadas.

## Referências
- "Estruturas de Dados e Algoritmos em Java" - Robert Lafore  
- [Documentação oficial da Oracle sobre Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)

---

# Projeto: Sistema de Senhas para Hospital

## Introdução

Este sistema organiza o atendimento hospitalar, gerando senhas sequenciais e mantendo um histórico de chamadas, utilizando **fila (FIFO - First In, First Out)** para garantir a ordem de atendimento.

## Implementação

### Estrutura de Dados
- **Fila de Senhas**: Gerencia as senhas em ordem de chegada.
- **Histórico de Senhas**: Mantém um registro das senhas chamadas.

### Principais Funções
- `gerarSenha()`: Cria uma nova senha e a adiciona à fila.
- `chamarProximo()`: Retira a senha mais antiga da fila e a registra no histórico.
- `exibirHistorico()`: Lista as senhas chamadas.

## Testes Executados

| Teste | Ação | Resultado |
|---|---|---|
| 1 | Gerar senhas (3x) | Sucesso (1, 2, 3) |
| 2 | Chamar dois pacientes | Chamadas na ordem correta (1, 2) |
| 3 | Chamar sem senhas na fila | Mensagem "Nenhuma senha na fila" |

## Conclusão
O sistema demonstrou eficácia no controle de senhas hospitalares, garantindo um fluxo organizado de atendimento.

## Referências
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)  
- "Java: How to Program" - Deitel & Deitel

