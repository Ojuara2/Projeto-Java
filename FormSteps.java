package projetpablo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FormSteps {

    @Given ("preencho o formulario") 
    public void preenchoForm() { 
    FormPage formPage = new FormPage();
    formPage.preenchoForm();
    
    }
    
    @And ("e clico em Send")    
    public void clicSend() {    	
    FormPage formPage = new FormPage();
    formPage.clicSend();
    }
    
    @Then ("devo ver a mensagem de sucesso")
    public void mensag() {    	
    FormPage formPage = new FormPage();
    formPage.mensag();
    }
	
}
