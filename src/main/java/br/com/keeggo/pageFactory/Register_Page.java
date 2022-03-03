package br.com.keeggo.pageFactory;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.listener.Reporter;

import br.com.keeggo.util.Wait;



/*
 * Elementos da pagina de registro 
 */

public class Register_Page {
WebDriver driver;
	public Register_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"menuUserLink\"]/span")
	private WebElement btn_Login;
	
	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement txtbx_UserName;
	
	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement txtbx_Password;
	
	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement txtbx_Email;
	
	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement txtbx_ConfirmPassword;
	
	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
    private WebElement txtbx_FirstName;
    
    @FindBy(how = How.NAME, using = "last_nameRegisterPage")
    private WebElement txtbx_LastName;
    
    @FindBy(how = How.NAME, using = "phone_numberRegisterPage")
    private WebElement txtbx_PhoneNumber;
    
    @FindBy(how = How.NAME, using = "cityRegisterPage")
    private WebElement txtbx_City;
    
    @FindBy(how = How.NAME, using = "countryListboxRegisterPage")
    private WebElement listbx_Country;
    
    @FindBy(how = How.NAME, using = "addressRegisterPage")
    private WebElement txtbx_Address;
    
    @FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
    private WebElement txtbx_State;

    @FindBy(how = How.NAME, using = "postal_codeRegisterPage")
    private WebElement txtbx_PostalCode;
    
    @FindBy(how = How.NAME, using = "i_agree")
    private WebElement checkbx_Agree;
    
    @FindBy(how = How.ID, using = "register_btnundefined")
    private WebElement btn_Register;
    
    public void enter_UserName(String username) {
    	txtbx_UserName.sendKeys(username);
    }
    public void enter_Password(String password) {
    	txtbx_Password.sendKeys(password);
    }
    public void enter_Email(String email) {
    	txtbx_Email.sendKeys(email);
    }
    public void enter_ConfirmPassword(String confirm) {
        txtbx_ConfirmPassword.sendKeys(confirm);
    }
   
    public void enter_FirstName(String firstName) {
        txtbx_FirstName.sendKeys(firstName);
    }
   
    public void enter_LastName(String lastName) {
        txtbx_LastName.sendKeys(lastName);
    }
   
    public void enter_PhoneNumber(String phoneNumber) {
        txtbx_PhoneNumber.sendKeys(phoneNumber);
    }
   
    public void enter_Country(String country) {
        Select select = new Select(listbx_Country);
        select.selectByVisibleText(country);
       
    }
   
    public void enter_City(String city) {
        txtbx_City.sendKeys(city);
    }
   
    public void enter_Address(String address) {
        txtbx_Address.sendKeys(address);
    }
   
    public void enter_State(String state) {
        txtbx_State.sendKeys(state);
    }
   
    public void enter_PostalCode(String postalCode) {
        txtbx_PostalCode.sendKeys(postalCode);
    }
   
    public void accept_Terms() {
        checkbx_Agree.click();
    }
   
    public void click_Register() {
        btn_Register.click();
    }

    public void registro()  {
        enter_UserName("LEO3334");
        enter_Email("leonardoferreiraw4@hotmail.com");
        enter_Password("Teste@1234");
        enter_ConfirmPassword("Teste@1234");
        enter_FirstName("Leonardo");
        enter_LastName("Ferreira");
        enter_PhoneNumber("11951978296");
        enter_Country("Brazil");
        enter_City("Osasco");
        enter_Address("Rua Alto Alegre");
        enter_State("São Paulo");
        enter_PostalCode("06223070");
        accept_Terms();
        click_Register();

        Wait.untilJqueryIsDone(driver);

    }
    public void validaRegisto() {
		assertTrue(btn_Login.isDisplayed());
		
	}


}
