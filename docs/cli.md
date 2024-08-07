# Documentação CLI

## Ferramenta de Login

### login.sh

Login necessário e com tempo para expiração

* ./login USER PASSWORD

## Variavél ACCIO_HOST

Setar a variavél ACCIO_HOST para utilização do servidor (EX: localhost)

* export ACCIO_HOST=http://localhost

## Ferramentas CLI


### AccioFreqs

Lista quantativamente as atividades pendentes:

automaticas		(0)

interativas		(1)

decisão			(2)

separação		(3)

junção			(4)

estado inicial	(5)

estado final	(6)
	
* Parâmetros:

	1. type - tipo de atividade (0 até 6)

	2. results - quantidade de resultados máxima

```
./AccioFreqs 0 20
```

* Retorno:

```
<table>
  <h1>Atividades automáticas mais frequentes</h1>
  <p>Extração dia 30/07/2019 as 11:27</p>
  <ativ process='OrdemVendaLacoste' ativ='RomaneioTxt' count='406' />
  <ativ process='OrdemVendaLacosteEcom' ativ='Gera Expedição' count='212' />
  <ativ process='OrdemVendaLepostiche' ativ='Rota fechada?' count='44' />...
```

### AccioStarts

Informa a quantidade de tickets iniciados, mostrando a data da criação em ordem ascendente, em uma faixa de tempo:

dia		(0) - default

hora	(1)

minuto	(2)

* Parâmetros:

	1. results - quantidade de resultados máxima

	2. periodo - intervalo de tempo para os resultados (0 até 2)

	3. nomeProcesso - nome do processo

```
./AccioStarts 10 1 OrdemVendaLepostiche
```

* Retorno:

```
<table>
  <h1>Ticket iniciados por dia</h1>
  <p>Extração dia 08/08/2019 as 15:12</p>
  <starts date='2019-07-30 03' count='204' />
  <starts date='2019-07-30 04' count='171' />
  <starts date='2019-07-30 05' count='169' />
  <starts date='2019-07-30 06' count='92' />
  <starts date='2019-07-30 07' count='72' />
  <starts date='2019-07-30 08' count='2' />
  <starts date='2019-07-30 09' count='46' />
  <starts date='2019-07-30 10' count='4' />
  <starts date='2019-07-30 11' count='1' />
  <starts date='2019-07-31 01' count='132' />
</table>
```

### UserFreqs

Mostra a quantidade de acessos por usuário (passando a quantidade de linhas na variável results)

* Parâmetros:

	1. results - quantidade de resultados máxima

```
./UserFreqs 5
```

* Retorno:

```

```

### execAutos

Ação de iniciar ou parar atividades repetidas independentes sem ticket

* Parâmetros:

	1. option - define a ação de iniciar ou parar a atividade (start ou stop)

	2. nomeProcesso - nome do processo

	3. nomeAtividade - nome da atividade

```
./execAutos start OrdemVendaLacoste FTP
```

* Retorno:

```

```

### execItems

Ação de listar, executar atividades(interarivas e síncronas), iniciar atividades (automáticas e assíncronas)ou encaminha-lás com uma transação

* Parâmetros:

	1. option - define a ação de iniciar/executar/listar/encaminhar uma atividade (start/exec/list/enc)

	2. nomeProcesso - nome do processo

	3. nomeAtividade - nome da atividade

	4. filtro - numero do ticket

	5. transition - transição apenas utilizada com a option enc

```
./execItems enc OrdemVendaLacoste "Reprocessar Rota" 239215 Reprocessar
```

* Retorno:

```

```

### execPends

Ação de iniciar, parar ou listar uma pendência das atividades automáticas (assíncronas) com ticket

* Parâmetros:

	1. option - define a ação de iniciar/parar/listar uma atividade (start/stop/list)

	2. nomeProcesso - nome do processo

	3. nomeAtividade - nome da atividade

```
./execPends start OrdemVendaLacoste FTP
```

* Retorno:

```

```

### lastItems

Exibe os ultimos itens de uma atividade

* Parâmetros:

	1. results - quantidade de resultados máxima

	2. sentido - definir in para itens que entraram ou out para itens que saíram

	3. nomeProcesso - nome do processo

	4. nomeAtividade - nome da atividade

```
./lastItems 5 in exec OrdemVendaLacoste FTP
```

* Retorno:

```

```

### movItems

Lista ou move itens de uma atividade para outra

* Parâmetros:

	1. option - list/move

	2. nomeProcesso - nome do processo

	3. nomeAtividade - nome da atividade

	4. filtro - numero do ticket (não obrigatório, usar "" quando for nulo)
	
	5. nomeAtividadePara - para qual atividade o item irá
	
	6. tickets - lista de tickets separado por vírgulas (não obrigatório)

```
./movItems.sh list OrdemVendaLacosteEcom "Aguarda arquivo confirmação" "" "Processamento ok" "166922,167003,76323,76321,76307"
```

* Retorno:

```
<table>
  <h1>Mov  OrdemVendaLacosteEcom/Aguarda arquivo confirmação para Processamento ok </h1>
  <p>Extração dia 30/07/2019 as 11:31</p>
  <item id_item='113734' id_ativ='2408' name='Erro de Validação' role='Administrador' process='CadastroFornecedorLacosteEcom' process_version='2' comp='SendMailTemplate' retry_interval='0' retry_times='0' param='' syncr='0' onLoad='0' actors='0' descr='Arquivo Cadastro de Fornecedor não gerado' />
  <item id_item='76334' id_ativ='2408' name='Erro de Validação' role='Administrador' process='CadastroFornecedorLacosteEcom' process_version='2' comp='SendMailTemplate' retry_interval='0' retry_times='0' param='' syncr='0' onLoad='0' actors='0' descr='Arquivo Cadastro de Fornecedor não gerado' />
</table>
```

### listVars

A partir do número do ticket, é exibido suas variáveis

* Parâmetros:

	1. ref - numero do ticket

```
./listVars 225418
```

* Retorno:

```
Variáveis de Processo item 225418 - 8 itens
```

### showHist

Mostra o historico do ticket desejado

* Parâmetros:

	1. ticket - numero do ticket

```
./listVars 100
```

* Retorno:

```

```

### oldestItems

Exibe os itens mais antigos que entraram do processo desejado

* Parâmetros:

	1. results - quantidade de resultados máxima

	2. nomeProcesso - nome do processo

	3. nomeAtividade - nome da atividade

```
./oldestItems 20 OrdemVendaLacoste FTP
```

* Retorno:

```

```

### showAccios

Mostra a descrição da atividade passada

* Parâmetros:

	1. nomeProcesso - nome do processo

	2. nomeAtividade - nome da atividade

	3. results - quantidade de resultados máxima

```
./showAccios OrdemVendaLacoste FTP 20
```

* Retorno:

```

```

### updateAccios

Atualiza a descrição de uma atividade que o comando showAccios previamente listou


```
./updateAccios

```

* Retorno:

```

```

## Observações

* O parâmetro results, se não escrito já é definido como 10, mas para mais ou menos resultados basta setar um valor

* O uso de aspas duplas é necessário para enviar dados com espacos entre as palavras para uma variável

	Exemplo: ```./execItems exec OrdemRecebimentoLepostiche "Gerar Interface" 239215```