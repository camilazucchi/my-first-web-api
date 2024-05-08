# Minha Primeira Web API
Este é um projeto de exemplo feito durante o Bootcamp Santander em parceria com a DIO que demonstra como construir uma API RESTful simples usando Spring Boot.
Inicialmente, o projeto não incluía interação com banco de dados e mapeamento JPA. Porém, funcionalidades adicionais foram implementadas
posteriormente para incluir essa funcionalidade.

## Visão Geral
Minha Primeira Web API fornece endpoints para gerenciar usuários. Ela é construída com Spring Boot e utiliza o Spring Data JPA para persistência de dados.

## Instalação
1. Clone o repositório:
```
git clone https://github.com/zucchicamila/my-first-web-api.git
```
2. Navegue até o diretório do projeto:
```
cd my-first-web-api
```
3. Construa o projeto usando o Maven:
```
./mvnw clean install
```
4. Execute a aplicação.

## Uso
Depois de executar a aplicação, você pode acessar os endpoints da API usando uma ferramenta como o Postman. A
URL base para a API é `http://localhost:8080`.

## Endpoints
- `GET /users`: Retorna uma lista de todos os usuários.
- `GET /users/{id}`: Retorna um usuário pelo ID.
- `POST /users`: Cria um novo usuário.
- `PUT /users/{id}`: Atualiza um usuário existente.
- `DELETE /users/{id}`: Deleta um usuário pelo ID.

Para informações detalhadas sobre cada endpoint, incluindo formatos de requisição e resposta, consulta a documentação Swagger em `http://localhost:8080/swagger-ui/index.html#/` após executar a aplicação.

## Melhorias Futuras
Este projeto ainda não está finalizado, gostaria de futuramente adicionar uma camada de segurança para as senhas fictícias dos usuários
e tratamentos de erros personalizados através de uma programação defensiva.