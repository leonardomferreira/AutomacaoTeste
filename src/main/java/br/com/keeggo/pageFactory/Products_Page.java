package br.com.keeggo.pageFactory;
import static org.testng.Assert.assertTrue;

import  java.io.IOException ;

import org.openqa.selenium.WebDriver ;
import  org.openqa.selenium.WebElement ;
import  org.openqa.selenium.support.FindBy ;
import  org.openqa.selenium.support.How ;
import  org.openqa.selenium.support.PageFactory ;
import  org.openqa.selenium.support.ui.ExpectedConditions ;
import  org.openqa.selenium.support.ui.WebDriverWait ;
/*
* Elementos da pagina de produtos
 */

public class Products_Page {
	WebDriver driver;

	
	public Products_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT, using = "HP Chromebook 14 G1(ENERGY STAR)")
	private WebElement lnk_Laptop;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"Description\"]/h1")
	private WebElement title_Product;
	

	
	@FindBy(how = How.LINK_TEXT, using = "HP USB 3 Button Optical Mouse")
	private WebElement lnk_Mouse;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div/label/span")
	private WebElement title_NoResult;
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"Description\"]/h1")
	private WebElement Title_Mouse;
		
	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement btn_Cart;
	
	@FindBy(how = How.ID, using = "mainImg")
	private WebElement Img_Laptop;
	
	
	@FindBy(how = How.ID, using = "mainImg")
	private WebElement Img_Mouse;

	@FindBy(how = How.XPATH, using = "//*[@id='productProperties']/div[4]/button")
	private WebElement btnAddToCart;

	@FindBy(how = How.ID, using = "checkOutButton")
	private WebElement vld_Cart;

	@FindBy(how = How.ID, using = "shoppingCartLink")
	private WebElement btnCart;
	
	public String title_Mouse() {
		return Title_Mouse.getText();
	}
	public String title_NoResultFor() {
		return title_NoResult.getText();
		
	}
	public void search_Mouse() {
		lnk_Mouse.click();
	}
	public String txt_Mouse() {
		return lnk_Mouse.getText().toUpperCase();

	}
	public void search_Laptop() throws InterruptedException, IOException {
		lnk_Laptop.click();
	}
	
	public String title_Laptop() {
		return title_Product.getText();
	}
	public void safe_Card() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(btn_Cart));
	}
	public void Img_Laptop() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Img_Laptop));
	}
	public void Img_Mouse() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Img_Mouse));
	}
	public void clickAddToCart(){
		btnAddToCart.click();
	}
	public void clickCart(){
		btnCart.click();
	}
	public void validAddToCart(){
		assertTrue(vld_Cart.isDisplayed());
	}
}