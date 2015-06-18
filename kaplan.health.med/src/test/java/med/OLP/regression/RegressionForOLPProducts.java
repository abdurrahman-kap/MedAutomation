package med.OLP.regression;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.testng.annotations.Test;
import med.base.BaseScript;

public class RegressionForOLPProducts extends BaseScript{
	
	/*@DataProvider(name="dp1"){
	 public static Objects testData(){
		 return new Objects {"COMLEXQbankOLP","COMLEXSampleQbankOLP","NAPLEXQbankOLP","PANCEQbankOLP","USMLEIMQbankOLP","USMLEStep2PLSQbank"};
	 }*/

	
	@Test
	public void VerifyTestAnalysisReviewpageforQbankOLP(){
		openOPLLogInPage().logInOLPPage("abrahman", "abrahman", "COMLEXQbankOLP");
		olphomepage().verifyAnalysisReviewpage();
	}
	
	@Test
	public void VerifyAnalysispageforQbankOLPproducts(){
		openOPLLogInPage().logInOLPPage("abrahman", "abrahman", "COMLEXQbankOLP");
		olphomepage().verifyAnalysispageforQbankOLP();
	}
	
	@Test
	public void VerifyAnalysispageforQbankOLP(){
		openOPLLogInPage().logInOLPPage("abrahman", "abrahman", "COMLEXQbankOLP");
		olphomepage().verifyAnalysispageforQbankOLP();
	}
	
	@Test
	public void VerifyReviewpageforQbankOLPproducts(){
		openOPLLogInPage().logInOLPPage("abrahman", "abrahman", "COMLEXQbankOLP");
		olphomepage().verifyReviewpageforQbankOLP();
	}
	
	@Test
	public void VerifyExplanationforQbankOLPproducts(){
		openOPLLogInPage().logInOLPPage("abrahman", "abrahman", "COMLEXQbankOLP");
		olphomepage().verifyExplanationOLP();
	}
	
	@Test 
	public void dateCheck(){
		 SimpleDateFormat df = (SimpleDateFormat) DateFormat.getDateInstance(DateFormat.SHORT);
		    System.out.println("The short date format is  " + df.toPattern());
		    Locale loc = Locale.US;
		    df = (SimpleDateFormat) DateFormat.getDateInstance(DateFormat.SHORT, loc);
		    System.out.println("The short date format is  " + df.toPattern());
	}
}
