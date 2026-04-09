# 🚀 API de Gerenciamento de Usuários

API REST desenvolvida com Java e Spring Boot para gerenciamento de usuários, permitindo operações de CRUD com integração ao banco de dados PostgreSQL.

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
- controller → recebe requisições HTTP
- service → regras de negócio
- repository → acesso ao banco de dados
- model → entidades do sistema
- dto → transferência de dados

---

## ⚙️ Funcionalidades

- Criar usuário
- Listar usuários
- Integração com banco PostgreSQL
- Arquitetura em camadas (Controller, Service, Repository)

---

## ▶️ Como rodar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/pedrobragga/api-usuarios.git

## 📌 Endpoints

### GET /users
Lista usuários

### POST /users
Cria usuário

{
  "nome": "Pedro",
  "email": "pedro@email.com"
}

---

Desenvolvido por Pedro Braga Bardini