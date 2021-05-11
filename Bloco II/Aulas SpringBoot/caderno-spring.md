<h1><center>Spring Initializr</center></h1>

<h3><center>Criando Projeto no spring.io</center></h3>

**Project:** Maven Project

**Language:** Java

**Spring Boot:** 2.4.5 (Versão padrão estavel no momento 26/04/2021)

***Utilizar Java na Versão 8***

#### Dependencies:

- **Spring Boot DevTools** (Atualiza automaticamente a aplicação a cada alteração feita)
- **Spring Web** (Todas as funcionalidades de uma API REST WEB, ex.: protocolo Http entre outros)
- **MySQL Driver** (Utilizado para fazer a conexão do projeto com o banco de dados MySQL)
- **Spring Data JPA **(Permite fazer manipulações no banco de dados, CRUD)
- **Validation** (Serve para trabalhar com validação no banco de dados)

###### Clique em *GENERATE* para criar o projeto.



<h4><center>CAMADAS:</center></h4>

**Model / Entity** *->* classe responsável pela abstração de nossos objetos e tabelas em nossos banco de dados.

**Repository / DAO** *->* Interface responsável pena comunicação direta com o banco de dados.

**Controller** *->* “End point”, é a camada responsável por manipular todas as requisições feitas do lado de fora da nossa API, essas requisições são feitas atravésde URL’s seguindo o protocolo HTTP

**Service** *->* Classe responsável por toda regra de negocio e trata



<h3><center>@Anotations</center></h3>

#### Model:

- **@Entity** (Informar que é uma entidade)

- **@Table*(name = *nome-da-tabela*)*** (Define nome da tabela que sera criada no BANCO)

- **@Id** (Informa que  variavel é um ID no banco)
  - **@GeneratedValue*(strategy = GenerationType.IDENTITY)*** (Transforma o Id em Chave Primaria)
- **@NotNull** (Não pode ficar vazio)
- **@Size*(min = 5, max = 100)*** (Define o minino e o maximo de caracteres)
- **@Temporal(TemporalType.TIMESTAMP)** (Informa que é um tempo e o tipo de tempo neste caso pegando o tempo atual)



#### Repository:@

- **@Repository**(Informar que é um Repositorio)

- **extends** *JpaRepository* <Nome da Classe, Long(Tipo primitivo do id)>	

  ```
  // Pega tudos que contem a palavra titulo ignorando letras maiusculas
  public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo); 
  ```



#### Controller:

- **@RestController** (Informar que é um controller)
- **@RequestMapping*("uri")*** (Informar por qual uri essa classe será acessada)
- **@CrossOrigin(origins = "\*", allowedHeaders = "\*")** (Para a classe aceitar requisições de qualquer origem. Ex.: Angular, REACT e etc)
- **@Autowired** (Serve para instanciar interfaces / ajuda a fazer o acesso a uma inteface)
- **@GetMapping** (Acionado quando a requisição é somente a da classe)
- **@GetMapping*("/{id}")*** (Get que recebe uma variavel no caminho como parametro)
  - **@PathVariable** (Pega a viriavel do caminho da *URI* do GetMapping)
- **.map() / .orElse()** (Serve para dar uma condição igual ***if*** e ***else***)
- **@PostMapping** (Informa que sera um Post que pegara uma info parecido com o Insert Into do Banco de Dados)
  - **@RequestBody** (Pega a informação que esta no corpo(Body) da requisição feita no post para ser utilizada)
- **@PutMapping** (Para atualizar UPDATE)
- **@DeleteMapping*("/{id}")*** (Deleta um dado do banco orientado pela requisição)
- **@OneToOne** (Relacionamento um para um) - ***1 para 1*** - 
- **@OneToMany** (Relacionamento um para muitos) - ***1 para N*** -
  - **@OneToMany*(mappedBy = "tema", cascade = CascadeType.ALL)*** (Serve para alterar tudo ao que esta relacionado)
- **@ManyToOne** (Relacionamento muitos para um) - ***N para 1*** -
- **@ManyToMany** (Relacionamento muitos para muitos) - ***N para N*** -
- **@JsonIgnoreProperties*(*nome-da-propriedade*)*** (Ignora a propriedade para quebrar o looping de puxar os dados infinitamente)



#### Security:

- **@EnableWebSecurity **(informa q se trada de uma classe de Configuração de segurança do spring)
- **extends** ***WebSecurityConfigurerAdapter*** (puxa as configurações de segurança)
- **@Override** (Para informar que é uma subescriva de metodo)

#### Service:

- @Service (Informar que é um serviço )

# AJUDA EXTRA

#### application.properties

- *spring.jpa.hibernate.ddl-auto=update
  spring.datasource.url=jdbc:mysql://localhost/blog_pessoal?createDatabaseIfNotExist=true&serverTimezone=UTC&useSSl=false
  spring.datasource.username=root
  spring.datasource.password=senhadobanco
  spring.jpa.show-sql=true*