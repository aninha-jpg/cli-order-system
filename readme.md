# 🛒 Order Management System

## 🧠 Sobre o projeto

Este projeto simula um sistema de gerenciamento de pedidos, onde é possível cadastrar um cliente, criar um pedido e associar múltiplos itens a esse pedido.

A aplicação permite registrar produtos, quantidades e calcular automaticamente o valor total da compra, além de exibir um resumo completo do pedido.

## 🎯 Objetivo

Praticar conceitos fundamentais de programação orientada a objetos, como:

* Organização de entidades
* Relacionamento entre classes
* Uso de enums para controle de status
* Manipulação de datas
* Estruturação de um sistema baseado em pedidos

## ⚙️ Funcionalidades

* Cadastro de cliente com dados pessoais
* Criação de pedidos com status definido
* Adição de múltiplos itens ao pedido
* Associação de produtos aos itens
* Cálculo automático do valor total
* Exibição de um resumo detalhado do pedido


## 🏗️ Estrutura do sistema

`Program.java` → Classe principal (entrada do sistema)

* `entities/`
    
    - `Client.java` → Representa o cliente

    - `Order.java` → Representa o pedido

    - `OrderItem.java` → Representa os itens do pedido

    - `Product.java` → Representa o produto

* `enumsentities/`
    - `OrderStatus.java` → Status do pedido (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED)


## 🚀 Como executar

💡 Certifique-se de ter o Java instalado na sua máquina.

1. Clonar o repositório:
```
    git clone https://github.com/aninha-jpg/cli-order-system.git
``` 

2. Acesse a pasta do projeto:

```
    cd cli-order-system
``` 

3. Compile a aplicação: 
``` 
javac Program.java
``` 
4. Execute
``` 
java Program
``` 


## 📚 Aprendizados

Durante o desenvolvimento deste projeto, foram reforçados conceitos como:

* Modelagem de sistemas reais
* Separação de responsabilidades
* Estruturação de dados
* Cálculos baseados em listas de itens
* Boas práticas de organização de projeto