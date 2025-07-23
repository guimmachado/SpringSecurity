# Spring Security - Exemplo de Autenticação e Autorização

Este projeto demonstra a implementação de segurança em uma aplicação Spring Boot usando **Spring Security**. O foco está na autenticação baseada em usuários em memória, controle de acesso por roles e proteção de endpoints da API REST.

## 📌 Funcionalidades

- Autenticação de usuários com **Spring Security**
- Controle de acesso com base em **roles** (usuário/admin)
- Proteção de rotas específicas via configuração programática
- Implementação simples e clara para fins de aprendizado ou extensão

## 🛠 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Security
- Maven

## 🚀 Como executar o projeto

1. **Clone o repositório:**

```bash
git clone https://github.com/guimmachado/SpringSecurity.git
cd SpringSecurity
```

2. **Execute a aplicação:**

Você pode usar sua IDE (como IntelliJ ou Eclipse) ou via terminal com:

```bash
./mvnw spring-boot:run
```

3. **Testar os endpoints:**

Utilize uma ferramenta como o Postman ou cURL. Por padrão, a aplicação estará disponível em:

```
http://localhost:8080
```

### 🧪 Credenciais de exemplo

- **Usuário:** `user`  
  **Senha:** `password`  
  **Role:** `ROLE_USER`

- **Usuário:** `admin`  
  **Senha:** `admin`  
  **Role:** `ROLE_ADMIN`

## 🔐 Endpoints protegidos

| Método | Endpoint     | Permissão necessária |
|--------|--------------|----------------------|
| GET    | `/admin`     | ADMIN                |
| GET    | `/user`      | USER ou ADMIN        |
| GET    | `/public`    | Público              |

## 📂 Estrutura do Projeto

```bash
src
└── main
    ├── java
    │   └── com.example.security
    │       ├── config            # Configurações de segurança
    │       ├── controller        # Controladores REST
    │       └── SpringSecurityApplication.java
    └── resources
        └── application.properties
```

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Desenvolvido por [Guilherme Machado](https://github.com/guimmachado) 🚀
