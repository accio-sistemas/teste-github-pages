# Valores Constantes em Tabelas


*  [Acao](#classe-acao)
		
*  [Formapgto](#classe-formapgto)
			
*  [Operadora](#classe-operadora)
			
*  [Perfil](#classe-perfil)
			
*  [Statusdesp](#classe-statusdesp)
			
*  [Statuspagto](#classe-statuspagto)
			
*  [Statusped](#classe-statusped)
			
*  [Regiao](#classe-regiao)
			
*  [Tipoadic](#classe-tipoadic)
			
*  [Tipocat](#classe-tipocat)
			
*  [Tipocomp](#classe-tipocomp)
			
*  [Tipocontato](#classe-tipocontato)
			
*  [Tipodesp](#classe-tipodesp)
			
*  [Tipodestaq](#classe-tipodestaq)
			
*  [Tipoend](#classe-tipoend)
			
*  [Tipofrete](#classe-tipofrete)
			
*  [Tipoimg](#classe-tipoimg)
			
*  [Tipomidia](#classe-tipomidia)
			
*  [Tipopagto](#classe-tipopagto)
			
*  [Tipopart](#classe-tipopart)
			
*  [Uf](#classe-uf)
			

##    Classe Acao

### Valores

ID| Descricao
--|----------
1 | Incluir
2 | Excluir


##    Classe Perfil

### Valores

ID|DESCRICAO
--|---------
1 |	Resgatador 		
2 |	Visualizador 		
3 |	Administrador


##    Classe Região

### Valores

ID|DESCRICAO
--|---------
1 |	Centro-Oeste 		
2 |	Nordeste 		
3 |	Norte 		
4 |	Sudeste 		
5 |	Sul


##    Classe Statuspagto

### Valores


TIPOPAGTO|STATUSPAGTO|NOME|POSICAO
---------|-----------|----|-------
1|NR|Não Recebido|I
1|RC|Recebido (Não Depositado)|J
1|DP|Depositado|P
1|SF|Sem Fundo|P
1|LB|Liberado|F
1|DC|Devolvido ao Cliente|P
2|EM|Boleto Enviado|P
2|LB|Liberado|F
3|NP|Não Processado|I
3|PA|Pré-aprovado|P
3|EC|Enviado ao Cliente|P
3|RC|Recebido do Cliente|P
3|LB|Liberado|F
3|NA|Não Aprovado|P
4|NP|Não Processado|I
4|LI|Negado por Limite|P
4|NI|Número Inválido|P
4|LB|Liberado|F
5|NR|Não Recebido|I
5|SF|Sem Fundo|P
5|LB|Liberado|F
2|NC|Não Emitida Cobrança|I
4|VE|Vencido|P
4|EN|Endereco Nao Confere|P
6|LB|Liberado|F
6|NR|Não Recebido|I
6|ES|Estornado|E
1|NE|Negado|P
1|SU|Sustado|P
1|DV|Devolvido|P
2|ES|Estornado|E
3|ES|Estornado|E
4|ES|Estornado|E
5|ES|Estornado|E
4|NE|Negado|P
2|LC|Liberado para Compra|G
2|NL|Não Liberado para Compra|P
2|PT|Protestado|P
4|BP|Boletim Protecao|P
1|FN|Faturado não Liberado|P
2|FN|Faturado não Liberado|P
3|FN|Faturado não Liberado|P
4|FN|Faturado não Liberado|P
5|FN|Faturado não Liberado|P
6|FN|Faturado não Liberado|P
4|RT|Reter Cartão|P
7|LB|Liberado|I
1|CN|Crédito Negado|P
4|CF|Cancelar Faturamento|P
4|IN|Inconsistente|P
4|BL|Cartão Bloqueado|P
8|LB|Liberado Brinde|I
2|NE|Negado|P
3|GA|Garantido|G
1|GA|Garantido|G
3|NE|Negado|P
3|TD|Titulo Descontado|P
1|TD|Titulo Descontado|P
9|FD|Faturamento Direto|I
3|NR|Não Recebido|P
2|LI|Negado por Limite|P
1|LI|Negado por Limite|P
5|NE|Negado|P
5|LI|Negado por Limite|P
10|NP|Não Processado|I
10|PA|Pré-aprovado|P
10|EC|Enviado ao Cliente|P
10|RC|Recebido do Cliente|P
10|LB|Liberado|F
10|NA|Não Aprovado|P
10|ES|Estornado|E
10|FN|Faturado não Liberado|P
2|VE|Vencido|P
11|NP|Não Processado|I
11|PA|Pré-aprovado|P
11|EC|Enviado ao Cliente|P
11|RC|Recebido do Cliente|P
11|LB|Liberado|F
11|NA|Não Aprovado|P
11|ES|Estornado|E
11|FN|Faturado não Liberado|P
11|GA|Garantido|G
11|NE|Negado|P
11|TD|Titulo Descontado|P
11|NR|Não Recebido|P
4|FD|Falta de Documentos|P
6|VE|Vencido|P
4|CT|Cartao de terceiros|P
4|CI|Cartao Internacional|P
4|AE|Autorizacao Entrega|P
12|NR|Nao recebido|I
12|LB|Pagamento recebido|F
12|ES|Estornado|E


##    Classe Statusped

### Valores


STATUSPED|DESCRICAO
---------|---------
C|Cancelado
E|Encomendado
R|Recebido
T|Em trânsito
S|Pedido Suspenso
D|Despachado
I|Nao Processado (Inicial)
A|Alteracao de Produto


##    Classe Statusdesp

### Valores

STATUSDESP|DESCRICAO
----------|---------
E|Enviado para o Cliente
N|Endereço não Encontrado
R|Recebido pelo Cliente
D|Devolvido/Recusado
L|Liberado Financeiro
F|Todas parcelas liberadas
P|Não Processado
A|Alocado do Estoque
I|Não disponível no estoque
S|Suspenso
X|Extravio
T|Troca simul.
V|Reenvio para Cliente
G|Envio Gradiente

##    Classe Tipoadic

### Valores

ID|DESCRICAO
--|---------
1 | Frete 			
2 | Valor 		
3 | Total

##    Classe Tipodestaq

### Valores

ID|DESCRICAO
--|---------
1 |	Banner 		
2 |	Novidade 		
3 |	Destaque

##    Classe Tipoend

### Valores

ID|DESCRICAO
--|---------
1 | Cobrança 		
2 |	Entrega 		
3 |	Ambos



##    Classe Tipofrete

### Valores

ID| Descricao
--|----------
1 |	Ponderado por UF (Capital e Interiror) 		
2 |	Frete Zero (Ponderado pelo parceiro) 		
3 |	Frete Real 		
4 |	Frete Ponderado por Região 		
5 |	Percentual definido na Campanha 		
6 |	Frete por Campanha/Produto


##    Classe Tipoimg

### Valores

ID|DESCRICAO
--|---------
1 | Pequena 		
2 | Média
3 | Grande 		
4 |	Menor
5 | Maior 		
6 | Zoom

##    Classe Tipopagto

### Valores

TIPOPAGTO|NOME
---------|----
1|Cheque
2|Cobrança Bancária
3|CDC - Crédito Direto
4|Cartão de Crédito
5|Depósito Bancário
6|Vale Postal
7|Fat. Direto
8|Brindes
9|Faturamento Direto
10|CDC - Compaq
11|CDC - Pré
12|Pagamento Online

##    Classe Uf

### Valores

Codigo|	Descricao|	Regiao|	Cepini|	Cepfim
------|----------|--------|-------|-------
AC    |	Acre     |	3	  | 69900 |	69999
AL|	Alagoas|	2|	57000|	57999
AP|	Amapá|	3|	68900|	68999
AM|	Amazonas|	3|	69400|	69899
BA|	Bahia|	2|	40000|	48999
CE|	Ceará|	2|	60000|	63999
DF|	Distrito Federal|	1|	70000|	73699
ES|	Espirito Santo|	4|	29000|	29999
GO|	Goiás|	1|	72800|	76799
MA|	Maranhão|	2|	65000|	65999
MT|	Mato Grosso| 1|	78000|	78899
MS|	Mato Grosso do Sul|	1|	79000|	79999
MG|	Minas Gerais|	4|	30000|	39999
PA|	Pará|	3|	66000|	68899
PB|	Paraiba|	2|	58000|	58999
PR|	Paraná|	5|	80000|	87999
PE|	Pernambuco|	2|	50000|	56999
PI|	Piauí|	2|	64000|	64999
RJ|	Rio de Janeiro|	4|	20000|	28999
RN|	Rio Grande do Norte|	2|	59000|	59999
RS|	Rio Grande do Sul|	5|	90000|	99999
RO|	Rondônia|	3|	78900|	78999
RR|	Roraima|	3|	69300|	69339
SC|	Santa Catarina|	5|	88000|	89999
SP|	São Paulo|	4|	1000|	19999
SE|	Sergipe|	2|	49000|	49999
TO|	Tocantins|	3|	77000|	77995


