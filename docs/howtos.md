# How to (roteiros e procedimentos)


* Chamada para iniciar processo

/ProcessExecutionServlet?comando=start&amp;nomeProcesso=Pedidos Manuais&idUser={Usuario}&var=order

* Encaminhar o item pelo processo (Exemplo Calcular)

/ProcessExecutionServlet?comando=avancar&processReturn=Calcular&obs={observação}

* Obter o valor de uma variável ( Exemplo order )

/ProcessExecutionServlet?comando=getVar&var={NomeVar}

* Informações gerais do processo

/ProcessExecutionServlet?comando=processInfo


## Executar o processo "VerificarCesta" e ler a variável order como retorno

/GroovyExecServlet?command=scripts/process/Execution&option=exec&nomeProcesso=VerificarCesta&idUser=ADMIN&referencia={id externo}&returnVar=order

## Executar o processos "CriaPedidoMkp" e ler a variável order como retorno

/GroovyExecServlet?command=scripts/process/Execution&option=exec&nomeProcesso=CriaPedidoMkp&idUser=ADMIN&referencia={id externo}&returnVar=order

## Incluir e atualizar a tabela Endpart Endereço de Participantes
Utilizar a documentação do CRUD no pacote

Localizar a tabela/classe Endpart

Para listar utilizar a url do serviço Listar com método POST. Passar o xml conforme o modelo em "xml para filtros"

Para operações de CRUD utilizar o "xml para CRUD". Para incluir não preencher o ID que será gerado automaticamente 

