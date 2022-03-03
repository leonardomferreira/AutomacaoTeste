Feature: ação de pesquisa

@ConsultarProdutoCarrinho  @04
Scenario: Adicionar um produto no carrinho
	Given Usuario esteja na pagina inicial
	When Clicar na categoria desejada
	And Clicar no notebook escolhido
	And Clicar em adicionar ao carrinho
	Then Validar carrinho de compras
	
@ConsultarProduto @05
Scenario: Pesquisa em categoria válida 
	Given Usuario esteja na pagina inicial 
	When Clicar na categoria desejada 
	And Clicar no notebook escolhido 
	Then A pagina do notebook escolhido será exibida 
	
@ConsultarProduto  @06
Scenario: Pesquisando produto errado pela imagem na tela principal
	Given Usuario esteja na pagina inicial
	When Usuario clicar para ver detalhes do laptop
	Then Será exibido uma página de outro laptop