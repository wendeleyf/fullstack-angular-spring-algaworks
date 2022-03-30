# Fullstack Angular e Spring - Algamoney-api

Repositório contendo o backend do projeto Algamoney do curso Fullstack Angular e Spring da [Algaworks](https://www.algaworks.com/)

## 💻 Tecnologias Utilizadas (Backend)

* API Rest utilizando **Spring Boot 2.6** no **Java 11**
* Banco de Dados **H2**(Será feita migração para MySQL ou PostgreSQL)
* FlywayDB (Scripts de migração de banco de dados)
* Maven

## ⚙ Funcionalidades Implementadas (WIP)

* Categorias
  * Inserção de categoria
  * Buscar uma categoria pelo ID
  * Listar todas as categorias cadastradas
* Pessoas
  * Inserção de pessoa
  * Buscar uma pessoa pelo ID
  * Listar todas as pessoas cadastradas
  * Deletar uma pessoa pelo ID
  * Atualizar uma pessoa cadastrada pelo ID

## 🛠 Ferramentas Utilizadas

* [**IntelliJ Idea 2021.3.3**](https://www.jetbrains.com/pt-br/idea/)
* [**Insomnia 2020.5.2**](https://insomnia.rest/)
* [**OpenJDK 11**](https://adoptopenjdk.net/)
* [**CMDER 210912**](https://cmder.net/)



## 🌏 Endpoints da API

| URL                                  | Método                                        | Descrição                        |
|--------------------------------------|-----------------------------------------------|----------------------------------|
| `localhost:8080/categorias`          | <span style="color:#0275D8">**GET**</span>    | Listar categorias cadastradas    |
| `localhost:8080/categorias/{codigo}` | <span style="color:#0275D8">**GET**</span>    | Buscar uma categoria por ID      |
| `localhost:8080/categorias`          | <span style="color:#5CB58C">**POST**</span>   | Adicionar uma categoria          |
| `localhost:8080/pessoas`             | <span style="color:#0275D8">**GET**</span>    | Listar pessoas cadastradas       |
| `localhost:8080/pessoas/{codigo}`    | <span style="color:#0275D8">**GET**</span>    | Buscar uma pessoa por ID         |
| `localhost:8080/pessoas`             | <span style="color:#5CB58C">**POST**</span>   | Adicionar uma pessoa             |
| `localhost:8080/pessoas/{codigo}`    | <span style="color:#F0AD4E">**PUT**</span>    | Atualizar os dados de uma pessoa |
| `localhost:8080/pessoas/{codigo}`    | <span style="color:#D9534F">**DELETE**</span> | Deletar uma pessoa cadastrada    |

<br>
<div id="header" align="center">
  <img src="https://media.giphy.com/media/13HgwGsXF0aiGY/giphy.gif" width="300"/>
</div>

<h3 align="center"> ⚠ README em Construção! </h3>

