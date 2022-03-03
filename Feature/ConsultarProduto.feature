Feature: ação de pesquisa

@ConsultarProduto  @03
Scenario: Pesquisa em categoria válida
	Given Usuario esteja na pagina inicial
	When Clicar na categoria desejada
	And Clicar no notebook escolhido
	And Clicar em adicionar ao carrinho
	Then Validar carrinho de compras
	
@ConsultarProduto  @04 
Scenario: Pesquisando produto errado pela imagem na tela principal
	Given Usuario esteja na pagina inicial
	When Usuario clicar para ver detalhes do laptop
	Then Será exibido uma página de outro laptop