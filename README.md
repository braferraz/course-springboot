## <img width="25px" src="https://user-images.githubusercontent.com/50770601/91883063-43fbab00-ec5a-11ea-898a-f8270afb723e.jpg"/> Web services com Spring Boot e JPA / Hibernate    

### Recursos
- :coffee: **Java** - Linguagem de programação utilizada
- :atom: **Spring Boot** - Facilita a criação de aplicativos baseados em Spring 
- :bird: **Maven** - Gerencia as dependências e automatiza os builds.
- :basketball: **Postman** - Teste de Api's

### Começando
Assegure-se de ter o [Heroku CLI](https://cli.heroku.com/) instalado.

```sh
$ git clone https://github.com/braferraz/course-springboot.git 
```

## Fazendo Deploy no Heroku

```
$ heroku create
$ git push heroku master
$ heroku open
```
ou

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

### Objetivos
- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções
