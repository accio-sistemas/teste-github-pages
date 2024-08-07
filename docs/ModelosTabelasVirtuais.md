# Como criar e alterar tabelas virtuais

## Criar/alterar o modelo no BPW arquivo .ecore

As tabelas são criadas utilizando-se um modelo e-core da seguinte forma :

- Criar as tabelas no modelo e-core.
- Gerar o arquivo de meta-modelo com a opção (botão direito no ecore) "Accio Generate Meta Model"
- Será gerado o arquivo *.model.
- Esse arquivo *.model dever publicado com a opção "Accio Meta-Model Publisb" 
- Utilizar o form (Projeto ADM) ADM/Forms/Adm/AdmVTAB.xhtml para criar as tabelas virtuais no banco.
- Menu Tabelas Virtuais -> Inserir Modelos

## Do ecore podemos gerar os cruds que podem ser publicados como CRUDs normais.
- Selecionado o arquivo e-core. Com o botão da direita gerar os xhtml com a opção Accio Generate XForms
- Na pasta forms publicar os xhtml gerados.


## Observações
- O /TIVIT/eforms.ecore é um exemplo de tabelas virtuais criadas. 
- O Campo "Abstrato" da tabela do modelo deve estar true para gerar CRUD de tabela virtual.


