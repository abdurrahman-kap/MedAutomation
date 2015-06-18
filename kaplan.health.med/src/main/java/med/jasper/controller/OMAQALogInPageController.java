package med.jasper.controller;

import med.jasper.model.OMAQALogInPageModel;

import org.openqa.selenium.WebDriver;

public class OMAQALogInPageController {

	protected WebDriver driver = null;
	public OMAQALogInPageModel homePage = null;
	
	public OMAQALogInPageController(WebDriver driver){
		this.driver = driver;
		homePage = new OMAQALogInPageModel(driver);
	}
	
	public void test(){
		homePage.clickOnUser();
		homePage.clickCreateStudent();
		homePage.setFName("Abdur");
		homePage.setLName("Rahman");
		homePage.SelectProgram("COMLEX");
	}


}
