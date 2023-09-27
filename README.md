# Projeto para cadastro de lista de contatos

![badge em desenvolvimento](https://user-images.githubusercontent.com/101880543/205785366-88c0d43a-2dc4-4ad0-a362-6e0b6fb8b089.png)

# 📝 Sobre o projeto

* Projeto realizado durante a fase 5 - **App World** da graduação **FIAP**;
* Trata-se de um aplicativo para cadastro de contatos;
* **Tecnologias usadas**: `🆔 Kotlin`

## Design Patterns aplicados

Padrões de design (*Design Patterns*) são aplicados para uma melhor organização de projetos, assim facilitando a manutenção e compreensão de partes da aplicação.

### MVC
O design pattern Model-View-Controller (*Modelo-Visualização-Controle*) tem como propósito separar as camadas da aplicação, aonde:
* **Model** &rarr; Representa a estrutura dos dados da regra de negócio da aplicação, assim centralizamos a estrutura das tabelas do banco de dados e das classes que as representam;
* **View** &rarr; Representa a interface da aplicação, renderizando os dados contidos nas estruturas da camada Model; 
* **Controller** &rarr; Realiza a integração entre as camadas de Model e de View, acessando o banco de dados e capturando dados inseridos pelo usuário.

Aplicamos o **MVC** separando as responsabilidades das classes, aonde cada arquivo representa uma camada do MVC:
* Model &rarr; <a href="https://github.com/bhS1lva/Projeto-Android-Design-Patterns/blob/main/app/src/main/java/br/com/bh/dadoslocais/model/Contato.kt">Contato.kt</a>;
* View &rarr; <a href="https://github.com/bhS1lva/Projeto-Android-Design-Patterns/blob/main/app/src/main/java/br/com/bh/dadoslocais/MainActivity.kt">MainActivity.kt</a>;
* Controller &rarr; <a href="https://github.com/bhS1lva/Projeto-Android-Design-Patterns/blob/main/app/src/main/java/br/com/bh/dadoslocais/database/repository/ContatoRepository.kt">ContatoRepository.kt</a>.

### DTO
O design pattern Data Transfer Object (*Objeto Transferidor de dados*) tem como propósito fornecer métodos para acesso ao banco de dados, configurando quais métodos poderão ser executados para
transferência de dados para o banco.

Aplicamos o **DTO** na interface <a href="https://github.com/bhS1lva/Projeto-Android-Design-Patterns/blob/main/app/src/main/java/br/com/bh/dadoslocais/database/dao/ContatoDao.kt">ContatoDao.kt</a>
que, por meio das anotações, fornece os métodos a serem implementados para realizarmos o CRUD (operações CREATE, READ, UPDATE e DELETE) nas tabelas do banco de dados. A classe 
<a href="https://github.com/bhS1lva/Projeto-Android-Design-Patterns/blob/main/app/src/main/java/br/com/bh/dadoslocais/database/dao/ContatoDb.kt">`ContatoDb`</a> possui o método `.contatoDao()` que
nos retorna uma instância da interface `ContatoDao`, isso é possível pois a biblioteca **Room Database** usada no projeto realiza o proxy dessa interface, instanciando-a e retornando essa instância.

### State Hoisting
O design pattern State Hoisting (*Elevação de estado*) tem como propósito a divisão de obrigações dos componentes da aplicação, aonde um componente pai fornece a lógica da aplicação para os componentes filhos. Esses componentes filhos
ficam encarregados de apenas renderizar o conteúdo recebido do componente pai, assim centralizando a lógica da aplicação.

Aplicamos o **State Hoisting** no arquivo <a href="https://github.com/bhS1lva/Projeto-Android-Design-Patterns/blob/main/app/src/main/java/br/com/bh/dadoslocais/MainActivity.kt">MainActivity.kt</a>,
aonde o componente pai
<a href="https://github.com/bhS1lva/Projeto-Android-Design-Patterns/blob/876e8a4a74eb7259139584d10d67c57dfe61a54f/app/src/main/java/br/com/bh/dadoslocais/MainActivity.kt#L65C18-L65C18">`ContatosScreen`</a>
armazena as funções e as passa para os componentes filho
<a href="https://github.com/bhS1lva/Projeto-Android-Design-Patterns/blob/876e8a4a74eb7259139584d10d67c57dfe61a54f/app/src/main/java/br/com/bh/dadoslocais/MainActivity.kt#L114">`ContatoForm`</a> e
<a href="https://github.com/bhS1lva/Projeto-Android-Design-Patterns/blob/876e8a4a74eb7259139584d10d67c57dfe61a54f/app/src/main/java/br/com/bh/dadoslocais/MainActivity.kt#L195">`ContatoList`</a>
que as recebem como argumentos.

### Singleton
O design pattern Singleton (*Coisa única*) tem como propósito haver apenas uma única instância de uma classe que é usada e acessada por todos os componentes da aplicação.

Aplicamos o **Singleton** na classe <a href="https://github.com/bhS1lva/Projeto-Android-Design-Patterns/blob/876e8a4a74eb7259139584d10d67c57dfe61a54f/app/src/main/java/br/com/bh/dadoslocais/database/dao/ContatoDb.kt#L10">`ContatoDb`</a>
no método <a href="https://github.com/bhS1lva/Projeto-Android-Design-Patterns/blob/876e8a4a74eb7259139584d10d67c57dfe61a54f/app/src/main/java/br/com/bh/dadoslocais/database/dao/ContatoDb.kt#L18">`.getDatabase()`</a>
que retorna uma instância única da classe `ContatoDb` para que a conexão com o banco de dados fique centralizada,
isso é feito utilizando o bloco `companion block` do Kotlin que permite a criação de códigos estáticos, e o modificador `lateinit` na propriedade `instance` que permite
a inicialização tardia de classes.


# 👥 Colaboradores

* Celso Furtado (instrutor da fase);
* Bruno Henrique;

# 🛎 Considerações

* Por enquanto nenhuma validação para a entrada de dados foi aplicada ao projeto;
* Caso encontre <strong>bugs</strong> ou tenha <strong>sugestões</strong>, estou à disposição.
