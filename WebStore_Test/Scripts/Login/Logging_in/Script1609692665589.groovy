import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

/*
 * WebBrowser start command.
 */
	WebUI.openBrowser('')
/*
  Navigate to url from global variable.   
*/
	WebUI.navigateToUrl(rawUrl=GlobalVariable.Web_URL)
/*
 * Click Sign in button.
 */
	WebUI.click(findTestObject('Object Repository/Login_Test/Sign_btn'))
/*
	Insert text to email login field.
*/
	WebUI.setText(findTestObject('Object Repository/Login_Test/Email_field'), GlobalVariable.Register_Email)
/*
 * Insert text to password login field.
 */
	WebUI.setText(findTestObject('Object Repository/Login_Test/Password_field'), GlobalVariable.Reg_Password)
/*
 * Click submit button to login.
 */
	WebUI.click(findTestObject('Object Repository/Login_Test/Submit_btn'))
/*
 * Check if account name on dashboard matches with this one on registration process.
 */
	name=WebUI.getText(findTestObject('Object Repository/Login_Test/Name_check'))
	REname=WebUI.concatenate(GlobalVariable.First_Name_Login, GlobalVariable.Last_Name)
	try{
	assert name == REname}
	catch(Exception ex){
	System.out.println('Nazwa uzytkownika sie nie zgadza! Test zostal przerwany')
	}
	
/*
 * After successfull assertion logging out.
 */
	WebUI.click(findTestObject('Object Repository/Login_Test/Log_out_btn'))
	WebUI.closeBrowser()
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	