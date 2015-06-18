package med.OLP.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



//**********************
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class OLPHomePageModel {
	
	protected WebDriver driver = null;
	String subName;
	String modName;
	String titleName;
	String titleString;
	String chapName;
	String eleName;
		
	public OLPHomePageModel(WebDriver driver){
		this.driver= driver;
	}
	
	public void clickOnPreviousTest(){
		WebElement clickOnSubName = driver.findElement(By.xpath(".//*[@id='imgpreviousTests']"));
		waitFor(2);
		subName = clickOnSubName.getText();
		clickOnSubName.click();
	}
	
	public void clickOnToplink(){
		int subName = driver.findElements(By.xpath("//td[2]/table[2]/tfoot/tr[2]/td/a/img")).size();
		if(subName>0){
			WebElement clickOnSubName = driver.findElement(By.xpath("//td[2]/table[2]/tfoot/tr[2]/td/a/img"));
			waitFor(2);
			eleName = clickOnSubName.getText();
			clickOnSubName.click();
		}
	}
	
	public void clickOnAnalysislink(){
		int subName = driver.findElements(By.xpath("//tbody/tr/td[7]/a[1]")).size();
		if(subName>0){
			WebElement clickOnSubName = driver.findElement(By.xpath("//tbody/tr/td[7]/a[1]"));
			waitFor(2);
			//subName = clickOnSubName.getText();
			clickOnSubName.click();
		}	
	}
	
	public void clickOnReviewlink(){
		int subName = driver.findElements(By.xpath("//tbody/tr/td[7]/a[2]")).size();
		if(subName>0){
			WebElement clickOnSubName = driver.findElement(By.xpath("//tbody/tr/td[7]/a[2]"));
			waitFor(2);
			//subName = clickOnSubName.getText();
			clickOnSubName.click();
		}
	}
	
	public void clickOnReviewThistest(){
		int subName = driver.findElements(By.xpath("//table[2]/tbody/tr[2]/td[2]/a/img")).size();
		if(subName>0){
			WebElement clickOnSubName = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td[2]/a/img"));
			waitFor(2);
			//subName = clickOnSubName.getText();
			clickOnSubName.click();
		}
	}
	
	public void clickOnExplanationLink(){
		int subName = driver.findElements(By.xpath(".//*[contains(@id,'section')]/table/tbody/tr[4]/td[12]/a")).size();
		if(subName>0){
			WebElement clickOnSubName = driver.findElement(By.xpath(".//*[contains(@id,'section')]/table/tbody/tr[4]/td[12]/a"));
			waitFor(2);
			//subName = clickOnSubName.getText();
			clickOnSubName.click();
		}
	}
	
	public void clickOnCloseLink(){
		//driver.switchTo().frame("main").switchTo().frame("sequenceContentFrame");
		
		int subName = driver.findElements(By.xpath("//td/div/div[2]/div/div/div/span/img")).size();
		if(subName>0){
			WebElement clickOnSubName = driver.findElement(By.xpath("//td/div/div[2]/div/div/div/span/img"));
			waitFor(2);
			clickOnSubName.click();
		}
	}
		
	public void clickOnGoToAnalysis(){
		int subName = driver.findElements(By.xpath("//table[2]/tbody/tr/td/a/img")).size();
		if(subName>0){
			WebElement clickOnSubName = driver.findElement(By.xpath("//table[2]/tbody/tr/td/a/img"));
			waitFor(2);
			//subName = clickOnSubName.getText();
			clickOnSubName.click();
		}
	}
	
	public void clickOnViewReview(){
		int subName = driver.findElements(By.xpath("//tbody/tr[4]/td[5]/a")).size();
		if(subName>0){
			WebElement clickOnSubName = driver.findElement(By.xpath("//tbody/tr[4]/td[5]/a"));
			waitFor(2);
			//subName = clickOnSubName.getText();
			clickOnSubName.click();
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

	public void util(){
		List<WebElement> elx = driver.findElements(By.cssSelector("*"));

		for ( WebElement e : elx ) {
		  System.out.println("Tag Name BY cssSelector : " + e.getTagName());
		  System.out.println("Tag Name BY cssSelector : " + e.getText());
		}
		
		List<WebElement> el = driver.findElements(By.cssSelector("*"));

		for ( WebElement e : el ) {
		  System.out.println("Tag Name Before Frame : " + e.getTagName());
		  System.out.println(" Name Before Frame : " + e.getText());
		  
		}
	}

	public void  readTestData() throws IOException{
		 String FilePath = "C:\\Users\\AbRahman\\Desktop\\NAPLEX Master Syllabus (1).xlsx";
		  File src=new File(FilePath);
		  FileInputStream fis=new FileInputStream(src);
		  XSSFWorkbook wb=new XSSFWorkbook(fis);
		  XSSFSheet sh1= wb.getSheetAt(1);
		  System.out.println(sh1.getRow(0).getCell(2).getStringCellValue());
	}
}
