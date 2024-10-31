# Desafio: Buscador de CEP

Este projeto é um simples buscador de CEP que utiliza a API do ViaCEP para recuperar informações sobre endereços a partir de um CEP fornecido pelo usuário.

## Objetivos do projeto
- Criar uma classe que representa um endereço (cep, uf, cidade, bairro, logradouro e complemento);
- Criar uma classe que consulta a API ViaCEP para buscar um endereço a partir de um cep (exemplo: https://viacep.com.br/ws/04101300/json);
- Criar uma classe que cria um arquivo json contendo os dados de um objeto Endereco;
- Criar uma classe com método main que deve solicitar ao usuário que informe um CEP e na sequencia utilizar as classes para consultar a api ViaCEP e salvar os dados do endereço em um arquivo json.

## Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/luccaByte/java-buscador-cep
cd java-buscador-cep
```

2. Adicione a dependência do Gson:

Se você estiver usando Maven, adicione a seguinte dependência ao seu arquivo pom.xml:
```xml
<dependency>
<groupId>com.google.code.gson</groupId>
<artifactId>gson</artifactId>
<version>2.10.1</version>
</dependency>
```
Se estiver usando Gradle, adicione ao seu arquivo build.gradle:

```groovy
implementation 'com.google.code.gson:gson:2.10.1'
```

Caso esteja utilizando o JAR do Gson, certifique-se de que o JAR esteja incluído no seu classpath.

3. Compile o projeto:

```bash
javac -d out src/com/java/cep/*.java
```
Execute o projeto:

```bash
java -cp out com.java.cep.Main
```
*Siga as instruções no terminal para inserir um CEP e visualizar os resultados.*