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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://advantageonlineshopping.com/#/')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Login/btn_ForgotYourPassword'), 0)

WebUI.verifyElementVisible(findTestObject('Landing Page/btn_login'))

WebUI.click(findTestObject('Landing Page/btn_login'))

WebUI.verifyElementPresent(findTestObject('Login/label_Or'), 0)

WebUI.verifyElementVisible(findTestObject('Login/label_Username'))

WebUI.verifyElementVisible(findTestObject('Login/input_Username'))

WebUI.verifyElementVisible(findTestObject('Login/input_Password'))

WebUI.verifyElementVisible(findTestObject('Login/input_Password'))

WebUI.verifyElementNotChecked(findTestObject('Login/input_RememberMe'), 0)

WebUI.verifyElementNotClickable(findTestObject('Login/btn_SignIn'))

WebUI.verifyElementVisible(findTestObject('Login/btn_ForgotYourPassword'))

WebUI.verifyElementVisible(findTestObject('Login/btn_CreateNewAccount'))

WebUI.setText(findTestObject('Login/input_Username'), GlobalVariable.username)

WebUI.setText(findTestObject('Login/input_Password'), GlobalVariable.password)

WebUI.check(findTestObject('Login/input_RememberMe'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Login/btn_SignIn'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login/btn_SignIn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Login/txt_usernameDisplay'), 0)

WebUI.verifyElementText(findTestObject('Login/txt_usernameDisplay'), GlobalVariable.username)
