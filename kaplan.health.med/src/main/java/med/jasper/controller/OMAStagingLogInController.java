package med.jasper.controller;

import med.jasper.model.JasperHomepageConfirmationPage;
import med.jasper.model.OMAStagingLogInConfirmationPage;
import med.jasper.model.OMAStagingLogInModel;

import org.openqa.selenium.WebDriver;

public class OMAStagingLogInController {
	
	protected WebDriver driver = null;
	public OMAStagingLogInModel homepage = null;
	public OMAStagingLogInConfirmationPage confmPage = null;
	
	
	public OMAStagingLogInController(WebDriver driver){
		this.driver = driver;
		homepage = new OMAStagingLogInModel(driver);
		confmPage = new OMAStagingLogInConfirmationPage(driver);
	}

}
