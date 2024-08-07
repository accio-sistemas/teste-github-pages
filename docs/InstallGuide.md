# Guia de Instalação Accio BPMS

## Instalação JBOSS

### Baixar versão Jboss Accio
Baixar [jboss-as-7.1.1.Final.tar.gz](https://s3-sa-east-1.amazonaws.com/kitdev/Comum/jboss-as-7.1.1.Final.tar.gz) 

## Camada Apache

### Instalar conforme a plataforma específica

### Baixar arquivos para prover apache com recursos estáticos do produto
Baixar  [accio4.tar.gz](https://s3-sa-east-1.amazonaws.com/kitdev/Comum/accio4.tar.gz)


## Pastas ACCIO_HOME

### Configurar pasta ACCIO_HOME em $JBOSS_HOME/bin/standalone.conf
Baixar exemplo [standalone.conf](https://s3-sa-east-1.amazonaws.com/kitdev/Comum/standalone.conf)

A pasta ACCIO_HOME deve conter os arquivo de configuração 

Exemplo dos arquivos da ACCIO_HOME

```text
-rw-r--r--   1 accio_bpm accio_bpm      5028 Mar 23 09:00 accio.properties
-rw-rw-r--   1 accio_bpm accio_bpm      1070 Jun 25  2020 akka.properties
drwxrwxr-x   2 accio_bpm accio_bpm         6 Jan 30 18:25 backup
-rw-r--r--   1 accio_bpm accio_bpm       103 Set 19  2018 birt.properties
drwxrwxr-x   2 accio_bpm accio_bpm      4096 Mar 24 16:38 cli
drwxr-xr-x  10 accio_bpm accio_bpm       214 Mai 18  2018 jboss-as-7.1.1.Final
drwxrwxr-x   2 accio_bpm accio_bpm        68 Fev 11 08:53 logs
drwxrwxr-x   2 accio_bpm accio_bpm    917504 Mar 26 14:05 tmp
``` 

### accio.properties

Arquivo de configurações de aplicação
Exemplo em [accio.properties](https://s3-sa-east-1.amazonaws.com/kitdev/Comum/accio.properties)

### akka.properties

Arquivo de configuração de processamento de fila em "background".

Exemplo [akka.properties](https://s3-sa-east-1.amazonaws.com/kitdev/Comum/akka.properties)

### Pasta cli

Comandos administração por linha de comando. [Comandos cli](cli.md)

### Pasta logs

Pasta das logs EAF.log (log de processos) e BPW.log (log da interface web)

### Pasta tmp

Arquivos temporários de aplicação. Cache de scrips e relattórios.

