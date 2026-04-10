# 🚀 API de Gerenciamento de Usuários

API REST desenvolvida com **Java + Spring Boot** para gerenciamento de usuários, permitindo operações completas (CRUD) com integração ao banco de dados PostgreSQL.

---

## 🛠️ Tecnologias

* Java 21
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven

---

## 📂 Estrutura do Projeto

```
src/main/java/com/seuprojeto/api_usuarios
├── controller  # Recebe requisições HTTP
├── service     # Regras de negócio
├── repository  # Acesso ao banco de dados
├── model       # Entidades
└── dto         # Transferência de dados
```

---

## ⚙️ Funcionalidades

* ✅ Criar usuário (POST)
* ✅ Listar usuários (GET)
* ✅ Atualizar usuário (PUT)
* ✅ Deletar usuário (DELETE)
* 🔗 Integração com PostgreSQL
* 🧱 Arquitetura em camadas (Controller, Service, Repository)

---

## ▶️ Como rodar o projeto

```bash
# Clonar o repositório
git clone https://github.com/pedrobragga/api-usuarios.git

# Entrar na pasta
cd api-usuarios

# Rodar o projeto
./mvnw spring-boot:run
```

A API estará disponível em:

```
http://localhost:8080
```

---

## 📌 Endpoints

### 🔍 Listar usuários

```
GET /users
```

### ➕ Criar usuário

```
POST /users
```

### ✏️ Atualizar usuário

```
PUT /users/{id}
```

### ❌ Deletar usuário

```
DELETE /users/{id}
```

---

## 📥 Exemplo de requisição (POST / PUT)

```json
{
  "name": "Pedro",
  "email": "pedro@email.com"
}
```

---

## 🧠 Próximas melhorias

* 📄 Documentação com Swagger
* 🔐 Implementar autenticação (Spring Security)
* ✅ Validações com Bean Validation
* 🌐 Padronização completa para inglês

---

## 👨‍💻 Autor

Desenvolvido por **Pedro Braga Bardini**
🔗 https://github.com/pedrobragga
