package med.OLP.regression;

public class OlpRegressionRunner {

	public static void main(String[] args) {
		
		RegressionForOLPProducts regRunner = new RegressionForOLPProducts();
		
		regRunner.beforeMethod();
		regRunner.VerifyTestAnalysisReviewpageforQbankOLP();
		regRunner.afterMethod();
		
		regRunner.beforeMethod();
		regRunner.VerifyAnalysispageforQbankOLPproducts();
		regRunner.afterMethod();
		
		regRunner.beforeMethod();
		regRunner.VerifyExplanationforQbankOLPproducts();
		regRunner.afterMethod();
		
		regRunner.beforeMethod();
		regRunner.VerifyReviewpageforQbankOLPproducts();
		regRunner.afterMethod();
		
		regRunner.beforeMethod();
		regRunner.VerifyAnalysispageforQbankOLP();
		regRunner.afterMethod();
	}
}
