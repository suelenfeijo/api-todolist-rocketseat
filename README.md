# api-todolist-rocketseat
No curso promovido pela Rocketseat de Java, desenvolvemos juntos uma aplicação Todolist e pude aprimorar meus conhecimentos nas seguintes tecnologias:

* Docker
* Spring Boot 
* Spring Web 
* Spring DevTools 
* ORM JPA (Hibernate)
* Git
* Banco de Dados para testes H2 
* Consumo de API via Postman
* Framework Lombok Criptografia e descriptografia de senhas com Bcrypt
* Deploy do serviço na nuvem (Render)

Link da API | https://api-todolist-rocketseat.onrender.com
---|-----------

```POST``` Criando um novo usuário <br/>
 uri: | https://api-todolist-rocketseat.onrender.com/users/
 --|--
 ```
 arquivo JSON
{
    "name": "Teste1",
    "username": "teste1",
    "password": "123"
}
```

```POST``` Criando uma nova tarefa (ativar Auth, type Basic Auth e inserir o username e password): <br/> 

 uri: | https://api-todolist-rocketseat.onrender.com/tasks/
 --|--

```
 arquivo JSON
{
"description":"Ação para listar tarefas primeiramente",
"title":"Realização da primeira tarefa dia 14/10/2023",
"startAt":"2023-10-17T10:00:00",
"endAt":"2023-10-18T18:50:00",
"priority":"ALTA",
"createdAt":"2023-10-14T21:36:00"
}
```

 ```GET```  Listando todas as tarefas do usuário autenticado (ativar Auth, type Basic Auth e inserir o username e password):  <br/>

 uri: | https://api-todolist-rocketseat.onrender.com/tasks/
 --|--

```POST``` Atualização de tarefa (ativar Auth, type Basic Auth e inserir o username e password):  <br/>
uri: | https://api-todolist-rocketseat.onrender.com/id-da-tarefa-retornada-apos-criacao
--|-- 

Finalizamos o curso com os seguintes itens implementados:

## Tasks

> Create: <br/> criação de tarefa com restrição de quantidade máxima de caracteres no título. Caso a restrição da tabela "task" seja desrespeitada, uma exceção é lançada, a qual personalizamos com a anotação @ExceptionHandler para fornecer um retorno mais amigável ao usuário. Também é gerado automaticamente um ID para cada tarefa, do tipo UUID, que é criptografado para proteger os dados do usuário antes de serem gravados no banco de dados. Além disso, é realizada a verificação se a tarefa é registrada com datas válidas.
> Update: <br/> é possível atualizar selecionando quais campos desejamos alterar sem modificar o valor da tarefa anterior. Além disso, os usuários também são autenticados, garantindo que apenas o usuário que criou a tarefa possa alterá-la. Caso contrário, é lançada a exceção "usuário não autorizado".
> List:  <br/>criamos também um método de listagem em que todas as tarefas criadas pelo usuário autenticado e identificado através do nome de usuário e senha são retornadas pela API.
## Users

> Create: <br/>implementamos a criação de usuários de acordo com o modelo de negócio pensado. Cada usuário possui um ID, nome de usuário, nome, senha e data de criação. Também implementamos uma verificação para evitar que usuários com o mesmo nome de usuário sejam cadastrados, lançando a exceção "Usuário já existe".
E, finalmente, usamos o Git Bash para fazer o upload do código para o GitHub e, em seguida, fazer o deploy da aplicação na nuvem.

 ###### Abaixo imagem da api ativa rodando online


![render-api-ativa](https://i.postimg.cc/tJ3RSkSB/Captura-de-tela-2023-10-21-223206.png)
Meus sinceros agradecimentos à grande professora Daniele Leão, que possui uma didática incrível. E também à RocketSeat por tornar possível a produção do curso, que foi muito enriquecedor para mim.
