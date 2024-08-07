# Interface para atuar nos Processos

**Login**
/ProcessExecutionServlet?comando=login&usuario={paramUsuario}&senha={paramSenha}

**Keep Alive (Chamada para manter sessão)**
/KeepAlive

**ProcessInfo**
/ProcessExecutionServlet?comando=processInfo

**Start Process**
/ProcessExecutionServlet?comando=start&amp;nomeProcesso={NomeProcesso}&idUser={Usuario}&var={NomeVar}

**Carregar Variável de Processo**
/ProcessExecutionServlet?comando=getVar&var={NomeVar}

**Salvar Variável de Processo**
/ProcessExecutionServlet?comando=setVar&var={NomeVar}

**Listar Pendências de processo**
/InboxServlet?comando=listarPendentes&escopoFiltro={Escopo}&textoFiltro={filtro)}&pagina={page}&amp;ordem={page}&linhasporPagina={LinhasPorPagina}

**Listar Atividades Independentes**
/InboxServlet?comando=listarIndependentes&paramModel={model}

**Executar Item**
/ProcessExecutionServlet?comando=executar&nomeProcesso={Processo}&referenciaExterna={referenciaExterna}&idItem={idItem}&atividade={atividade}

**Executar Atividade Independente**
/ProcessExecutionServlet?comando=executarIndependente&nomeProcesso={Processo}&referenciaExterna={referenciaExterna}&idItem={idItem}&atividade={AtividadeID}&atividadeItem={atividade}

**Avançar Item no Processo**
/ProcessExecutionServlet?comando=avancar&processReturn={opção}&obs={observação}

**Finalizar Item**
/ProcessExecutionServlet?comando=FinalizarItem&atividade={atividade}&idItem={idItem}

**Cancelar Item**
/ProcessExecutionServlet?comando=cancelar&atividade={atividade}&idItem={idItem}

# Interface Groovy para Processos

**ProcessInfo**
/GroovyExecServlet?command=scripts/process/Execution&option=processInfo

**Start Process**
/GroovyExecServlet?command=scripts/process/Execution&option=start&nomeProcesso={NomeProcesso}&idUser={Usuario}&var={NomeVar}

**Carregar Variável de Processo**
/GroovyExecServlet?command=scripts/process/Execution&option=getVar&var={NomeVar}

**Salvar Variável de Processo**
/GroovyExecServlet?command=scripts/process/Execution&option=setVar&var={NomeVar}

**Posicionar Item**
/GroovyExecServlet?command=scripts/process/Execution&option=positem&idItem={idItem}&atividade={atividade}

**Avançar Item no Processo**
/GroovyExecServlet?command=scripts/process/Execution&option=encaminhar&transition={transição}&obs={observação}

**Finalizar Item**
/GroovyExecServlet?command=scripts/process/Execution&option=FinalizarItem&atividade={atividade}&idItem={idItem}

**Cancelar Item**
/GroovyExecServlet?command=scripts/process/Execution&option=cancelar&atividade={atividade}&idItem={idItem}

**Executar Processo e retornar variável**
Exec Process
/GroovyExecServlet?command=scripts/process/Execution&option=exec&nomeProcesso={NomeProcesso}&idUser={Usuario}&referencia={id de referência externa do item}&returnVar={NomeVar}

O groovy retorna o xml dos dados de processInfo exceto a option exec que retorna o valor de returnVar.
```
<?xml version="1.0"?>
<process>
  <transition nome="Criar Pedido"/>
  <transition nome="Revisar Cesta"/>
  <reference>150</reference>
  <idItem>150</idItem>
  <idUserResp/>
  <idUserCreation>32403980873</idUserCreation>
  <name>Pedidos Manuais</name>
  <version>5</version>
  <type>0</type>
  <activity>474</activity>
  <activityName>Revisar Cesta </activityName>
  <activityType>1</activityType>
  <param/>
  <userID>32403980873</userID>
  <Company/>
  <userName/>
  <loginGerenciador/>
  <gerenciador/>
  <associatedFile/>
  <idRole>1</idRole>
  <userRole>Administrador</userRole>
  <group/>
  <parameterData/>
  <lang>po</lang>
  <server>http://www.directmkpdesenv.com:8080/</server>
  <folder>bpw-war-1.0</folder>
  <RecordsPerPage>12</RecordsPerPage>
  <SelectorRecordsPerPage>5</SelectorRecordsPerPage>
  <page>0</page>
  <pages>0</pages>
  <highlightBorder>1</highlightBorder>
  <orient>1</orient>
  <ambiente>P</ambiente>
  <formDefault>0</formDefault>
  <formAtiv>forms/dshub/Pedido</formAtiv>
  <appData/>
  <sessionTimeout>3600</sessionTimeout>
  <returnPage/>
  <appDomain/>
  <executar>0</executar>
  <adm>0</adm>
</process>
```
**Obter Variáveis de um processo**
```
/GroovyExecServlet?command=scripts/process/ListVars&ref={id de referência externa do item}
```