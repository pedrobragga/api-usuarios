# 🚀 API de Gerenciamento de Usuários
API REST desenvolvida com **Java + Spring Boot** para gerenciamento de usuários, permitindo operações básicas com integração ao banco de dados PostgreSQL.

---

## 🛠️ Tecnologias
- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

---

## 📂 Estrutura do Projeto
src/main/java/com/seuprojeto/api_usuarios
- controller → Recebe requisições HTTP
- service → Contém as regras de negócio
- repository → Responsável pelo acesso ao banco de dados
- model → Entidades do sistema
- dto → Objetos de transferência de dados

---

## ⚙️ Funcionalidades
- ✅ Criar usuário
- ✅ Listar usuários
- Integração com banco PostgreSQL
- Arquitetura em camadas (Controller, Service, Repository)

---

## ▶️ Como rodar o projeto
# Clone o repositório
git clone https://github.com/pedrobragga/api-usuarios.git
# Acesse a pasta do projeto
cd api-usuarios
# Execute a aplicação
./mvnw spring-boot:run

---

## 📌 Endpoints
### 🔍 GET /users
Lista todos os usuários

### ➕ POST /users
Cria um novo usuário

Exemplo de requisição:
{
  "nome": "Pedro",
  "email": "pedro@email.com"
}

---

## 🧠 Próximas melhorias
- Implementar atualização de usuários (PUT)
- Implementar remoção de usuários (DELETE)
- Adicionar validações nos dados
- Documentação da API com Swagger

---

## 👨‍💻 Autor
Desenvolvido por Pedro Braga Bardini