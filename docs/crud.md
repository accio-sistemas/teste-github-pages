# CRUD

## Modelos

Toda tabela do modelo de administração BPM podem ser acessados por servlets.

[Modelo do bpm](classes.md)

[Valores fixos ou pré-definidos](Valores.md)

**Consulta com filtro (Exemplo tabela Catalogo)**
/LoadModelServlet?servlet=br.com.accio.hub.bpw.servlet.model.CatalogoServlet&command=filter

Post (Exemplo tabela Catalogo)

```xml
<table>
     <filter>
          <ID min="" max="" order="Asc"/>
          <Integrador_ID in="" order=""/>
          <Loja_ID in="" order=""/>
          <Produto_ID in="" order=""/>
          <Disponibilidade min="" max="" order=""/>
          <Preco order=""/>
          <Precode order=""/>
          <Sku contains="" order=""/>
          <EAN contains="" order=""/>
          <Modelo contains="" order=""/>
          <Ultatu min="" max="" order=""/>
     </filter>
     <list RecordsPerPage="0" Page="0" Pages="0"/>
     <result success="">
          <error.msg/>
     </result>
</table>
```

Retorno:

```xml
<table>
  <filter>
       <ID min="" max="" order="Asc"/>
       <Integrador_ID in="" order=""/>
       <Loja_ID in="" order=""/>
       <Produto_ID in="" order=""/>
       <Disponibilidade min="" max="" order=""/>
       <Preco order=""/>
       <Precode order=""/>
       <Sku contains="" order=""/>
       <EAN contains="7891378032075" order=""/>
       <Modelo contains="" order=""/>
       <Ultatu min="" max="" order=""/>
  </filter>
  <result success="1"/>
  <list RecordsPerPage="0" Page="0" Pages="0">
       <record>
            <ID value="417"/>
            <Integrador_ID table="Integrador">
                 <ID value="1"/>
                 <Descricao value="CNOVA"/>
            </Integrador_ID>
            <Loja_ID table="Loja">
                 <ID value="1"/>
                 <Descricao value="Ponto Frio"/>
            </Loja_ID>
            <Produto_ID table="Produto">
                 <ID value="309"/>
                 <Descricao value="Refrigerador Continental Duplex Massima RCCT490 - 467 L"/>
            </Produto_ID>
            <Disponibilidade value="0"/>
            <Preco value="1389.9"/>
            <Precode value="1389.9"/>
            <Sku value="332782"/>
            <EAN value="7891378032075"/>
            <Modelo value="110v"/>
            <Ultatu value=""/>
            <delete value="0"/>
       </record>
       <record>
            <ID value="20877"/>
            <Integrador_ID table="Integrador">
                 <ID value="1"/>
                 <Descricao value="CNOVA"/>
            </Integrador_ID>
            <Loja_ID table="Loja">
                 <ID value="3"/>
                 <Descricao value="Casas Bahia"/>
            </Loja_ID>
            <Produto_ID table="Produto">
                 <ID value="19495"/>
                 <Descricao value="Refrigerador Continental Duplex Massima RCCT490 - 467 L"/>
            </Produto_ID>
            <Disponibilidade value="0"/>
            <Preco value="1369.9"/>
            <Precode value="1369.9"/>
            <Sku value="332782"/>
            <EAN value="7891378032075"/>
            <Modelo value="110v"/>
            <Ultatu value=""/>
            <delete value="0"/>
        </record>
  </list>
</table>
```

**Insert (Exemplo Tabela Catalogo)**
/LoadModelServlet?servlet=br.com.accio.hub.bpw.servlet.model.CatalogoServlet&amp;command=insert&amp;table=Catalogo

Post

```xml
<table>
     <record rowid="">
          <ID value=""/>
          <Integrador_ID table="Integrador">
               <ID value=""/>
               <Descricao value=""/>
          </Integrador_ID>
          <Loja_ID table="Loja">
               <ID value=""/>
               <Descricao value=""/>
          </Loja_ID>
          <Produto_ID table="Produto">
               <ID value=""/>
               <Descricao value=""/>
          </Produto_ID>
          <Disponibilidade value=""/>
          <Preco value=""/>
          <Precode value=""/>
          <Sku value=""/>
          <EAN value=""/>
          <Modelo value=""/>
          <Ultatu value=""/>
          <delete value= "false"/>
     </record>
     <result success="">
          <error.msg/>
     </result>
</table>
```

**Update (Exemplo Tabela Catalogo)**
/LoadModelServlet?servlet=br.com.accio.hub.bpw.servlet.model.CatalogoServlet&amp;command=update&amp;table=Catalogo

Post

```xml
<table>
     <record rowid="">
          <ID value=""/>
          <Integrador_ID table="Integrador">
               <ID value=""/>
               <Descricao value=""/>
          </Integrador_ID>
          <Loja_ID table="Loja">
               <ID value=""/>
               <Descricao value=""/>
          </Loja_ID>
          <Produto_ID table="Produto">
               <ID value=""/>
               <Descricao value=""/>
          </Produto_ID>
          <Disponibilidade value=""/>
          <Preco value=""/>
          <Precode value=""/>
          <Sku value=""/>
          <EAN value=""/>
          <Modelo value=""/>
          <Ultatu value=""/>
          <delete value= "false"/>
     </record>
     <result success="">
          <error.msg/>
     </result>
</table>
```

**Delete**
/LoadModelServlet?servlet=br.com.accio.hub.bpw.servlet.model.CatalogoServlet&amp;command=delete&

**Batchdelete**
/LoadModelServlet?servlet=br.com.accio.hub.bpw.servlet.model.CatalogoServlet&amp;command=batchDelete&amp;RecordsPerPage={param}

**ObtemAliasServlet**
Query  - Permite executar queries genéricas no modelo em HQL.
/ObtemAliasServlet

Post

```xml
<root>
     <model>hub</model>
     <hql>select p.ID as ID, p.Descricao as Descricao, i.Url as Url from Produto p, Prodimg i where p.ID = i.Produto_ID and i.Tipoimg_ID = 2</hql>
     <list RecordsPerPage="20" Page="0" Pages="0">
          <record />
      </list>
     <result>
          <success />
          <errorMsg />
     </result>
</root>
```

Retorno

```xml
<?xml version="1.0" encoding="UTF-8"?>
<root>
  <model>hub</model>
  <hql>select p.ID as ID, p.Descricao as Descricao, i.Url as Url from Produto p, Prodimg i where p.ID = i.Produto_ID and i.Tipoimg_ID = 2</hql>
  <result success="1"/>
  <list RecordsPerPage="20" Page="1" Pages="3974">
  <record ID="1" Descricao="Fogao Lofra 4 Bocas MX66GI c/ Grill Churrasqueira - Inox" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=4041663"/>
  <record ID="2" Descricao="Cooktop a Gas 5 Bocas Brastemp Gourmand BDK75 - 220V" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=3331829"/>
  <record ID="3" Descricao="Lavadora de Roupas Electrolux 12 kg Turbo Economia LTE12" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=2592763"/>
  <record ID="457" Descricao="Cafeteira Eletrica Mondial Bella Arome Black 26 C-04" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=3054339"/>
  <record ID="4" Descricao="Depurador de Ar Electrolux DE60B - 60 cm" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=3845972"/>
  <record ID="5" Descricao="Secadora Brastemp 10 kg Ative- BSR10AB." Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=3845308"/>
  <record ID="6" Descricao="Lavadora de Roupas Mueller SuperPop 3kg Turbilhao Semi-automatica" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=2574241"/>
  <record ID="7" Descricao="Coifa de Parede Tramontina Vetro 94805 - 90 cm - Inox" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=2807609"/>
  <record ID="8" Descricao="Depurador de Ar Tramontina Compact 94810 - 60 cm - Inox" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=2812107"/>
  <record ID="456" Descricao="Grill George Foreman GBZ2 - Branco" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=3165707"/>
  <record ID="9" Descricao="Pia c/ Cooktop a Gas 2 Bocas Tramontina Cuba a Esquerda 93710/103 - 120x55 cm" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=2821836"/>
  <record ID="10" Descricao="Coifa de Parede Tramontina Prisma 94801 - 90 cm - Inox" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=2806012"/>
  <record ID="11" Descricao="Coifa Ilha Tramontina Dritta Isla 94831 - Inox - 90 cm" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=2811187"/>
  <record ID="12" Descricao="Fogao Brastemp 4 Bocas Clean BF050BR - Inox" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=3324468"/>
  <record ID="13" Descricao="Coifa de Parede Tramontina Vetro 94804 - 60 cm - Inox" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=2807155"/>
  <record ID="455" Descricao="Centrifuga Mondial CF02 Preto/Prata - 250W" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=3056312"/>
  <record ID="14" Descricao="Refrigerador Consul Frost Free Duplex CRM33EB - 263 L" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=3659489"/>
  <record ID="15" Descricao="Coifa de Parede Electrolux 90CV - 90 cm - Vidro/Inox" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=3310445"/>
  <record ID="16" Descricao="Forno Eletrico com Conveccao e Micro-ondas Brastemp Gourmand BMD35AT com Grill - Inox - 220V - 31 Li" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=3678179"/>
  <record ID="17" Descricao="Fogao Consul 5 Bocas Facilite CF676AR c/ Timer - Inox" Url="http://imagens.pontofrio.com.br/Control/ArquivoExibir.aspx?IdArquivo=3114209"/>
  </list>
</root>
```

Observe que os alias do HQL viram as propriedades do xml tag record.