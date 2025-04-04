# Desafio Técnico - Login com JWT

## 📝 Descrição

Este é um desafio técnico para avaliar seus conhecimentos em:

- Criação de endpoints REST com Spring Boot
- Uso de DTOs para entrada e saída de dados
- Organização em camadas (Controller, Service, Repository)
- Geração de tokens JWT

---

## 🚀 Tecnologias esperadas

- Java 17
- Spring Boot
- Maven
- Biblioteca `jjwt` (já está no projeto, você só precisa usar)

---
## 🎯 Objetivo

Você deve implementar um sistema de login com JWT. Ao enviar um e-mail e senha válidos, o sistema deve retornar um token JWT assinado com tempo de expiração.

---

## 📥 Requisição esperada

**POST** `/auth/login`

```json
{
  "email": "admin@email.com",
  "password": "123456"
}
```

---

## ✅ Resposta esperada

**Status: 200 OK**

```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
```

Se o login for inválido, retornar:

**Status: 401 Unauthorized**

---

## 🧱 Estrutura do Projeto

```
src/
├── controller/
│   └── AuthController.java
├── dto/
│   ├── LoginRequestDTO.java
│   └── TokenResponseDTO.java
├── service/
│   ├── AuthService.java
│   └── AuthServiceImpl.java
├── repository/
│   ├── UserRepository.java
│   └── UserRepositoryImpl.java
├── model/
│   └── User.java
├── security/
│   └── JwtUtil.java
```

---

## 🔐 Libs permitidas

- Todas as libs já estão instaladas.

---

## 🔎 O que será avaliado

- Uso correto de DTOs
- Geração segura de token JWT
- Separação em camadas
- Código limpo e legível
- Boas práticas com Spring Boot

---

## 📦 Observações

- Não é necessário usar banco de dados ou JPA.
- O repositório está simulado em memória (`UserRepositoryImpl`).
- Apenas um usuário está cadastrado para validação:
  - **email:** `admin@email.com`
  - **senha:** `123456`
