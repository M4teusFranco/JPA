# Sistema de Manipulação de Dados com JPA em Java

### 📋 Descrição do Projeto

O projeto é uma Ferramenta de Gerenciamento de Tênis conectada a um Bando de Dados MySQL via JPA que realiza operações por linha de comando em Java

- persistense.xml: Estabelece a conexão com o banco de dados 
- ProdutoDAO: Armazena os métodos de gerenciamento dos dados
- Produto: Classe do Produto que será manipulado, com getters e setters
- Main: Interface principal que oferece um menu interativo com as opções disponíveis.

### 🔧 Pré-requisitos

- Java JDK 8 ou superior
- Banco de dados relacional (ex: MySQL, PostgreSQL, SQLite)
- Framework JPA
- Método DOA aplicado  
- IDE Java (Eclipse, IntelliJ, etc.)

### 🚀 Instalação e execução

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/JPA
```

2. Importe o projeto no Eclipse:
- File → Import → Existing Projects into Workspace
- Selecione a pasta do projeto clonado

3. Configure a URL de conexão, usuário e senha em persistense.xml:

```
<property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/seu_banco"/>
<property name="javax.persistence.jdbc.user" value="root"/>
```

5. Execute a classe Main.java e siga as instruções no terminal.

### 🛠️ Funcionalidades Implementadas

- Conexão com banco de dados via JDBC
- Menu interativo via console
- Adição de registros, que cria um ID
- Atualização de registros por ID
- Remoção de registros por ID
- Leitura dos registros

### 📝 Exemplo de saída

#### Interface Principal

![image](https://github.com/user-attachments/assets/60ebf3fd-6c30-40d9-85de-54a6abec0935)
![image](https://github.com/user-attachments/assets/8bd3ec51-1250-4d60-8ad7-b15daa945e4e)


#### Inserção de Tênis

![image](https://github.com/user-attachments/assets/ba06454a-47cd-490e-b2a8-3cf145386da4)
![image](https://github.com/user-attachments/assets/afa81fbf-129a-4bf1-afab-f705c8b11b6d)


#### Atualização de Tênis

![image](https://github.com/user-attachments/assets/96dffd38-d6d5-46d1-9a29-74c84a6c4f65)
![image](https://github.com/user-attachments/assets/b1477686-538d-45bf-9d80-c9e240bbae79)


#### Leitura de registros de Tênis

![image](https://github.com/user-attachments/assets/3dcad4a8-46bc-4964-be23-a6e13a6ae629)


#### Remoção de Tênis

![image](https://github.com/user-attachments/assets/479be6dc-4442-4702-9ce4-ed72b49f3667)
![image](https://github.com/user-attachments/assets/54005917-da5d-4444-8ef7-2792fd17d132)


#### Sair

![image](https://github.com/user-attachments/assets/14c9629f-6139-46a9-82f7-938510bc4c0a)


## ✒️ Autores

* **Mateus Franco Bezerra** - *Trabalho Inicial* - JPA
