#  QA Automation E-commerce

Projeto de automação de testes End-to-End (E2E) desenvolvido para praticar e demonstrar conhecimentos em **Quality Assurance e Automação de Testes**, utilizando **Java, Selenium WebDriver, JUnit 5 e Maven**.

Os testes são executados na aplicação [SauceDemo](https://www.saucedemo.com/), simulando fluxos de uma aplicação de e-commerce.

##  Objetivo do projeto

O objetivo deste projeto é automatizar cenários funcionais de uma aplicação web, aplicando boas práticas de organização e manutenção dos testes.

Foram utilizados conceitos como:

* Automação de testes E2E
* Page Object Model (POM)
* Separação entre páginas e testes
* Reutilização de métodos
* Assertions para validação dos resultados
* Gerenciamento de dependências com Maven
* Controle de versão com Git e GitHub

##  Tecnologias utilizadas

* **Java**
* **Selenium WebDriver**
* **JUnit 5**
* **Maven**
* **WebDriverManager**
* **Git**
* **GitHub**

##  Cenários automatizados

###  Login

* Login com credenciais válidas
* Validação de tentativa de login inválido

###  Carrinho

* Adicionar produto ao carrinho
* Remover produto do carrinho
* Validar produtos adicionados

### Checkout

* Acessar o fluxo de checkout
* Preencher os dados do cliente
* Prosseguir para a etapa de confirmação
* Finalizar a compra
* Validar a conclusão do pedido

##  Estrutura do projeto

```text
qa-automation-ecommerce
│
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── saucedemo
│   │               └── Main.java
│   │
│   └── test
│       └── java
│           ├── base
│           │   └── BaseTest.java
│           │
│           ├── pages
│           │   ├── CartPage.java
│           │   ├── CheckoutPage.java
│           │   ├── InventoryPage.java
│           │   └── LoginPage.java
│           │
│           └── tests
│               ├── CartTest.java
│               ├── CheckoutTest.java
│               └── LoginTest.java
│
├── .gitignore
├── pom.xml
└── README.md
```

##  Arquitetura dos testes

O projeto utiliza o padrão **Page Object Model (POM)**.

As responsabilidades são separadas da seguinte forma:

**`base/`**
Contém a configuração utilizada pelos testes, incluindo inicialização e encerramento do WebDriver.

**`pages/`**
Contém as Page Objects, responsáveis por mapear elementos e representar as ações disponíveis em cada página da aplicação.

**`tests/`**
Contém os cenários de teste e suas respectivas validações utilizando JUnit.

Essa separação evita duplicação de código e facilita a manutenção dos testes.

##  Como executar o projeto

### Pré-requisitos

Para executar os testes é necessário possuir:

* Java instalado
* Maven instalado
* Google Chrome
* Git

### 1. Clone o repositório

```bash
git clone git@github.com:eduardaparrela/qa-automation-ecommerce.git
```

### 2. Acesse a pasta do projeto

```bash
cd qa-automation-ecommerce
```

### 3. Execute os testes

```bash
mvn test
```

O Maven irá compilar o projeto e executar os testes automatizados configurados com JUnit.

##  Aplicação utilizada

Os testes foram desenvolvidos utilizando a aplicação:

**SauceDemo**
https://www.saucedemo.com/

A aplicação disponibiliza um ambiente de demonstração de e-commerce que permite testar diferentes fluxos, como autenticação, catálogo de produtos, carrinho e checkout.

##  Aprendizados

Durante o desenvolvimento deste projeto foram praticados conceitos importantes de automação de testes, como:

* Localização e interação com elementos web
* Criação de testes automatizados com Selenium WebDriver
* Assertions com JUnit
* Organização de testes utilizando Page Object Model
* Configuração e reutilização do WebDriver
* Execução de testes com Maven
* Estruturação de um projeto de automação
* Versionamento de código com Git e GitHub

##  Próximas melhorias

Como evolução do projeto, podem ser adicionados:

* Testes de ordenação dos produtos
* Validação de preços
* Mais cenários negativos
* Screenshots em caso de falha
* Geração de relatórios de execução
* Execução automática dos testes através de CI/CD

##  Autora

**Maria Eduarda Parrela**

Estudante de Análise e Desenvolvimento de Sistemas, com experiência em Quality Assurance e foco no desenvolvimento de conhecimentos em automação de testes.
