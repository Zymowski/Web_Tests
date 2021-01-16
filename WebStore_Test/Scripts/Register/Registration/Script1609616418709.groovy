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
 * Navigate to url
 */

	WebUI.navigateToUrl(rawUrl=GlobalVariable.Web_URL)
	
/*
 * Clik Sign In button
 */

	WebUI.click(findTestObject('Object Repository/Pre_registration/Sign_btn'))
	
/*
 * Pass email as global variable into email field
 */

	WebUI.setText(findTestObject('Object Repository/Pre_registration/E-Mail_Field'), GlobalVariable.Register_Email)
	
/*
 * Click register button to proceed to main registration
 */

	WebUI.click(findTestObject('Object Repository/Pre_registration/Register_button'))	
	
/*
 * ====================================
 * Proceed to main registration process
 * ====================================
 */
	
	
/*
 * Select the gender checkbox
 */

	WebUI.click(findTestObject('Object Repository/Main_Registration/Personal_Information/Gender_check'))
	
/*
 * Set text in First, and Last names
 */
	WebUI.setText(findTestObject('Object Repository/Main_Registration/Personal_Information/First_name'), GlobalVariable.First_Name)
	WebUI.setText(findTestObject('Object Repository/Main_Registration/Personal_Information/Last_name'), GlobalVariable.Last_Name)
	
/*
 * Get the email form field and check if it is correct
 */
	try{
	email = WebUI.getAttribute(findTestObject('Object Repository/Main_Registration/Personal_Information/Email_check'), 'value')
	assert GlobalVariable.Register_Email == email
	}catch(Exception ex){
		System.out.println("Email address doesn't match with address passed in pre_registration step")
	}
	
/*
 * Set text to password field
 */
	
	WebUI.setText(findTestObject('Object Repository/Main_Registration/Personal_Information/Password'), GlobalVariable.Reg_Password)
	
/*
 * Set the date of birth
 */
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Main_Registration/Personal_Information/DoB_Days'),'2' , false)
	WebUI.selectOptionByValue(findTestObject('Object Repository/Main_Registration/Personal_Information/DoB_Months'),'1' , false)
	WebUI.selectOptionByValue(findTestObject('Object Repository/Main_Registration/Personal_Information/DoB_Years'),'1997' , false)
	
/*
 * Select newsletter and SpecialOffer checkboxes.
 */
	WebUI.click(findTestObject('Object Repository/Main_Registration/Personal_Information/Newsletter'))
	WebUI.click(findTestObject('Object Repository/Main_Registration/Personal_Information/SpecialOffer'))
	
/*
 * ===============================
 * Proceed to Address information.
 * ===============================
 */
	
/*
 * Check if First and Last name is correct
 */
	/* Próba weryfikacji tych pól, niestety w żaden sposób mi się nie udało. Może Pan podpowie po sprawdzeniu projektu :).
	FName_check = WebUI.getAttribute(findTestObject('Object Repository/Main_Registration/Address/First_name'), 'value')
	assert GlobalVariable.First_Name == FName_check
	LName_check = WebUI.getText(findTestObject('Object Repository/Main_Registration/Address/Last_name'))
	assert GlobalVariable.Last_Name == LName_check*/
	

	//Set text to company,address etc fields from excel file
 
	WebUI.setText(findTestObject('Object Repository/Main_Registration/Address/Company_name'), Company)
	WebUI.setText(findTestObject('Object Repository/Main_Registration/Address/Address'), Address)
	WebUI.setText(findTestObject('Object Repository/Main_Registration/Address/Address_Line2'), Address_2)
	WebUI.setText(findTestObject('Object Repository/Main_Registration/Address/City'), City)
	WebUI.selectOptionByValue(findTestObject('Object Repository/Main_Registration/Address/State'), '2', false)
	WebUI.setText(findTestObject('Object Repository/Main_Registration/Address/Post_code'), Postal)
	WebUI.selectOptionByValue(findTestObject('Object Repository/Main_Registration/Address/Country'), '21', false)
	WebUI.setText(findTestObject('Object Repository/Main_Registration/Address/Home_phone'), Home_phone)
	WebUI.setText(findTestObject('Object Repository/Main_Registration/Address/Mobile_phone'), Mobile_phone)
	
	//Submit registration
	
	WebUI.click(findTestObject('Object Repository/Main_Registration/Address/Submit_btn'))
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	