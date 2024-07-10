# Programa de Cadastro e Gestão de Funcionários

Este projeto em Java foi desenvolvido para exemplificar o uso de encapsulamento, listas, entrada de dados e operações sobre objetos no curso do professor Nélio Alves, oferecido pela EducandoWeb. 
O projeto foi desenvolvido utilizando Java 21 e a IDE IntelliJ IDEA.

## Descrição do Projeto

O projeto consiste em um programa desenvolvido em Java para gerenciar o cadastro e a gestão de funcionários de uma empresa. Ele utiliza conceitos de encapsulamento, listas, entrada de dados e operações sobre objetos para realizar as seguintes funcionalidades:

1. ### Cadastro de Funcionários:
   - O programa permite ao usuário cadastrar um número especificado de funcionários.
   - Para cada funcionário, são fornecidos um id único, nome e salário.
2. ### Validação de Id Único:
   - Durante o cadastro, o sistema verifica se o id fornecido já está em uso por outro funcionário.
   - Caso o id já exista, o usuário é solicitado a fornecer outro id até que seja único para cada funcionário.
3. ### Atualização Salarial por Porcentagem:
   - Após o cadastro dos funcionários, o usuário pode escolher um funcionário específico pelo id para aumentar seu salário em uma porcentagem determinada.
   - O aumento salarial é aplicado utilizando um método que encapsula o comportamento de atualização do salário, garantindo que o salário só possa ser modificado através dessa operação.
4. ### Exibição da Listagem Atualizada:
   - Após todas as operações de cadastro e atualização salarial, o programa exibe uma listagem atualizada dos funcionários, mostrando seus ids, nomes e salários atualizados conforme as operações realizadas.


## Funcionalidades Implementadas

- Cadastro de funcionários com verificação de id único.
- Atualização salarial baseada em porcentagem para um funcionário específico.
- Listagem atualizada dos funcionários após as operações.

## Tecnologias Utilizadas

- Java 21
- IntelliJ IDEA

## Como Executar

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto no IntelliJ IDEA.
3. Execute o programa a partir do método `main` na classe `Main`.

## Exemplo de Uso

Ao iniciar o programa, você será solicitado a informar quantos funcionários deseja cadastrar. Para cada funcionário, você deverá fornecer um id único, nome e salário. Caso um id já exista, será solicitado outro id até que seja único.

Após o cadastro, você poderá escolher um funcionário pelo id para aplicar um aumento salarial específico. Informe o id do funcionário e a porcentagem de aumento desejada. O programa verificará se o id existe na lista de funcionários e realizará o aumento salarial apenas se o id for válido.

Ao final, o programa exibirá a listagem atualizada dos funcionários, incluindo seus ids, nomes e salários ajustados conforme as operações realizadas.
