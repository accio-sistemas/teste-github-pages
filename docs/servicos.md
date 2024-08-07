# Serviços Groovy (Lista Inicial)

## Publicação de processos simplificados

Ideia de "Layout" inicial para novo serviço de publicação de processos simplificado.

```
<process name="nome do processo">
		<event id="" name="" type="start"/>
		<activity id="" name="" sync="" comp="" role="" param="" term="" term_type="" />
		<gateway id="" name="" type="join"  />
		<gateway id="" name="" type="split"  />
		<gateway id="" name="" type="decision"  />
		<transition id="" name="" from="" to="" />
		<event id="" name="" type="end"/>
</process>
```

Regras de formação do xml:

* nome do processo não pode ser vazio
* Campo id é numérico inteiro e deve ser único 
* Deve conter um único evento de início (event type start)
* Deve conter pelo menos um evento de fim (event type end)
* Campo name obrigatório em activity e transition


Preenchimento Activity
 
Campo      | Descrição    |Tipo   |Obrig.?|Valores
-----------|--------------|-------|-------|--------------
id         | id único     |Inteiro| Sim   | 
name       | Nome         |String | Sim   |
sync       | Sincronismo  |Boolean| Sim   | true ou false
comp       | Componente   |String | Sim   | nome de componente cadastrado por ex. "script/nv/IRPF"
role       | Papel        |String | Sim   | nome de papel cadastrado no sistema
param      | Parâmetro    |String | Não   | Parâmetro para atividade
term       | Prazo        |Inteiro| Não   | Prazo em quantidade de tempo definida em term_type
term_type  | Tipo de prazo|Inteiro| Não   | SEGUNDOS = 0; MINUTOS = 1; HORAS = 2; DIAS = 3; DIAS UTEIS = 4;


Definição de parâmetros de Componentes automáticos
```
<parameters>
		<parameter id="1" name="Documento"  type="String" var="" path=""    />
</parameters>
```
* path é o caminho XPATH de obtenção do valor do parâmetro em uma variável de processo.
* var é a variável onde será lido o xml e aplicado o XPATH 

Definição de retornos de Componentes automáticos.
```
<returns>
		<return id="1" value=""/>
</returns>
```
* Retornos são valores pré-definidos pela função como "ok", "erro", "finalizar", etc ... 


Definição de dependências de outros Componentes automáticos.
```
<dependencies>
		<component id="1" name=""/>
		<var id="2" name=""/>
</dependencies>
```
* dependẽncia pode ser de componentes ou de variáveis de processo.


* Scheduller e Processos Assíncronos

		<activity id="" name="" sync="false" comp="" role="" param="" term="" term_type="" >
			<sched type="" time=""/>
		</activity>

Campo      | Descrição     |Tipo   |Obrig.?|Valores
-----------|---------------|-------|-------|--------------
type       | Tipo de evento|Inteiro| Sim   | 0 a 9 (id do tipo)  
time       | Tempo         |String | Sim   | formato conforme campo "type"



Tipo       | Descrição                      |Formato Tempo 
-----------|--------------------------------|--------------
0          | AGENDAMENTO_HORARIO_ANUAL      | dd/MM HH:mm  
1          | AGENDAMENTO_HORARIO_MENSAL     | dd HH:mm
2          | AGENDAMENTO_HORARIO_SEMANAL    | EEE HH:mm
3          | AGENDAMENTO_HORARIO_DIARIO     | HH:mm
4          | AGENDAMENTO_HORARIO_UNICO      | dd/MM/yyyy HH:mm
5          | NOVA_TENTATIVA_INTERVALO       | 
6          | AGENDAMENTO_INTERVALO_SEGUNDOS | Inteiro
7          | AGENDAMENTO_INTERVALO_MINUTOS  | Inteiro
8          | AGENDAMENTO_INTERVALO_HORAS    | Inteiro
9          | AGENDAMENTO_INTERVALO_DIAS     | Inteiro

