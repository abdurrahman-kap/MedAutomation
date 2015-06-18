package med.jasper.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OMAQALogInPageModel {
	protected WebDriver driver = null;
	
	public OMAQALogInPageModel(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickOnUser(){
		WebElement clickUser = driver.findElement(By.xpath("html//tr[1]/td/map/area[1]"));
		waitFor(2);
		clickUser.click();
	}
	
	public void clickOnCreateProfile(){
		WebElement clickCreatePro = driver.findElement(By.xpath("//tr[2]/td[2]//tr[8]/td[2]/input[1]"));
		waitFor(2);
		clickCreatePro.click();
	}
	
	public void clickCreateStudent(){
		WebElement clickCreate = driver.findElement(By.xpath("//tr[2]/td[1]/table/tbody/tr[3]/td[2]/a"));
		waitFor(2);
		clickCreate.click();
	}
	
	public void setFName(String fName){
		WebElement fNameTBox = driver.findElement(By.xpath("//tr[2]/td[2]/form/table[2]//tr[3]/td[2]//tr[2]/td[2]/input[1]"));
		waitFor(2);
		fNameTBox.sendKeys(fName);
	}
	
	public void setLName(String lName){
		WebElement lNameTBox = driver.findElement(By.xpath("//tr[3]/td[2]//tr[2]/td[5]/input[1]"));
		waitFor(2);
		lNameTBox.sendKeys(lName);
	}
	
	public void SelectProgram(String item){
		Select combo = new Select(driver.findElement(By.xpath("//tr[3]/td[2]//tr[6]/td[2]/select")));
		List<WebElement> list = combo.getOptions();
		waitFor(3);
		for(WebElement e : list){
			System.out.println("outside value : "+e.getText());
			if(e.getText().contentEquals(item)){
				waitFor(3);
				e.click();
				waitFor(3);
			}
		}
	}

//*************************************Utility**********************************
	public void waitFor(int sec){
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
		
}
