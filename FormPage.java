package projetpablo;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class FormPage extends FormElementMap {
	
	private static WebDriver driver;
	
	public FormPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	//formulario enter vehicle data
	public void preenchoForm() {
	Select selMake = new Select(make);
	selMake.selectByVisibleText("Audi");
	
	
	Select selModel = new Select(model);
	selModel.selectByVisibleText("Scooter");
	
	cylindercapacity.sendKeys("10");	
	engineperformance.sendKeys("250");
	dateofmanufacture.sendKeys("01/01/2020");
	
	Select numberOfSeats1 = new Select(numberofseats);
	numberOfSeats1.selectByVisibleText("1");
	
	Select cmbFuel = new Select(fuel);
	cmbFuel.selectByVisibleText("Petrol");
	
	listprice.sendKeys("20000");
	annualmileage.sendKeys("1000");
	//proxima tela
	nextenterinsurantdata.click();
	
	
	//formulario enter insurant data
	firstname.sendKeys("Mario");
	lastname.sendKeys("Silva");
	birthdate.sendKeys("01/01/1990");
	
	Select cmbCountry = new Select(country);
	cmbCountry.selectByVisibleText("Brazil");
	
	zipcode.sendKeys("25635190");
		
	Select cmbOccupation = new Select(occupation);
	cmbOccupation.selectByVisibleText("Employee");
	
	speeding.click();
	bungeejumping.click();
		
	//proxima tela
	nextenterproductdata.click();
	
	//formulario enter product data
	startdate.sendKeys("04/04/2021");
	
	Select cmbInsurancesum = new Select(insurancesum);
	cmbInsurancesum.selectByVisibleText("3.000.000,00");
	
	Select cmbMeritrating = new Select(meritrating);
	cmbMeritrating.selectByVisibleText("Bonus 1");
	
	Select cmbDamageinsurance = new Select(damageinsurance);
	cmbDamageinsurance.selectByVisibleText("No Coverage");
	
	
	EuroProtection.click();
	
	Select cmbCourtesycar = new Select(courtesycar);
	cmbCourtesycar.selectByVisibleText("Yes");
	//proxima tela
	nextselectpriceoption.click();
	
	//formalulario select price option	
	selectsilver.click();
	//proxima tela
	nextsendquote.click();
	
	//formulario send quote
	email.sendKeys("teste@teste.com");
	phone.sendKeys("22332233");
	username.sendKeys("f12345");
	password.sendKeys("Ab12345");
	
	confirmpassword.sendKeys("Ab12345");
			
	}
	

	public void clicSend() {
	sendemail.click();
		
	}

	public void mensag() {

	WebElement mensagem = driver.findElement(By.id("Sending e-mail success!"));
	assertTrue(mensagem.getText().equals("Sending e-mail success!"));
	
	}
	
	
}
