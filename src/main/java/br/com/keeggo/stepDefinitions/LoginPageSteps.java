package br.com.keeggo.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import br.com.keeggo.cucumber.TestContext;
import br.com.keeggo.pageFactory.Login_Page;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	
	WebDriver driver;
	TestContext testContext;
	Login_Page loginPage;
	

	public LoginPageSteps(TestContext context) {
		testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
	}
	
	@When("^Usuario clicar no botao criar nova conta$")
	public void usuario_clicar_no_botao_criar_nova_conta() throws Throwable {
		Reporter.addStepLog("Navegando para a pagina de registro");
		loginPage.create_Account();

	}

	@When("^Preencher os dados de login$")
	public void Preencher_os_dados_de_login() throws Throwable {
		Reporter.addStepLog("Preencher os dados de login");
		loginPage.entraUsuario();
		loginPage.entraSenha();
		loginPage.login();
		
	}
}
