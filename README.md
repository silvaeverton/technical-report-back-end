# Relatórios Técnicos - Back-End

Este é o back-end da aplicação de gerenciamento de relatórios técnicos, desenvolvido com **Spring Boot**. Ele fornece uma API REST que permite que técnicos preencham relatórios com imagens, vídeos, assinatura e avaliações, enquanto um administrador pode acessar e gerenciar todos os dados via painel administrativo.

---

## ⚙️ Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security (com JWT)
- MySQL
- Lombok
- Multipart Upload (para imagens e assinaturas)

---

## 🔐 Funcionalidades

### Técnicos
- Cadastro e login com senha criptografada
- Envio de relatórios com:
  - Imagens e vídeos
  - Assinatura digital do cliente
  - Observações e avaliação
- Histórico de relatórios enviados

### Administrador
- Visualização de todos os relatórios
- Filtro por técnico, data ou status
- Painel para acompanhar desempenho dos técnicos
- Controle financeiro com base nos relatórios

---
## 📦 Estrutura do Projeto

src/

├── controller/ # Endpoints REST

├── model/ # Entidades JPA

├── repository/ # Repositórios (JPA)

├── service/ # Lógica de negócio

├── security/ # JWT e autenticação

└── dto/ # Objetos de transferência de dados


---

## 🚀 Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/silvaeverton/technical-report-back-end

2. Configure o application.properties com suas credenciais do MySQL:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/report
   spring.datasource.username=root
    spring.datasource.password=Tujad&99
   jwt.secret=segredo123

3. Rode o projeto:
 - No IntelliJ ou VS Code, execute a classe RelatoriosApplication

 * Ou via terminal:
   ```bash 
   ./mvnw spring-boot:run

### 📫 API Endpoints (exemplo)

 - _POST /auth/register – Cadastrar técnico_

 - _POST /auth/login – Login técnico (JWT)_

 - _POST /report – Enviar novo relatório_

 - _GET /report – Listar todos os relatórios (admin)_

 - _GET /report/tecnico/{id} – Relatórios por técnico_


## 📁 Link do Front-end

➡️ Repositório do app mobile (Flutter):

📱 Aplicativo: [Acesse o repositório do App Flutter](https://github.com/silvaeverton/flutter-technical-reports-app)

📌 Licença
Este projeto está sob a licença MIT.
Sinta-se livre para usar, estudar, contribuir e compartilhar!

✍️ Autor
Feito com 💻 por Everton 


