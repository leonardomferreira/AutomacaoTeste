Feature: Registro


@Registro @01
Scenario: Sucesso ao registrar usuario 
	Given Usuario esteja na pagina inicial
	When Usuario navegar para a pagina de Login
	And Usuario clicar no botao criar nova conta
	And Usuario peencher os campos com dados validos
	Then Usuario sera registrado com sucesso
	
@RegisterTest @02
Scenario: Falha ao registrar usuario 
	Given Usuario esteja na pagina inicial
	When Usuario navegar para a pagina de Login
	And Usuario clicar no botao criar nova conta
	And Usuario peencher os campos com dados invalidos 
	Then Usuario nao sera registrado
	
 @Login @03
 Scenario: sucesso ao realizar o login
  Given Usuario esteja na pagina inicial
	When Usuario navegar para a pagina de Login
	And Preencher os dados de login
	Then login sera efetuado com sucesso