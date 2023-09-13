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

WebUI.waitForElementPresent(findTestObject('Landing Page/btn_Headphones'), 0)

WebUI.verifyElementVisible(findTestObject('Landing Page/Logo'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/btn_OurProducts'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/btn_SpecialOffer'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/btn_PopularItems'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/btn_ContactUs'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/btn_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/btn_login'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/btn_cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/btn_About'), FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementText(findTestObject('Login/txt_usernameDisplay'), '')) {
	WebUI.click(findTestObject('Landing Page/btn_login'))
} else {
	WebUI.click(findTestObject('Landing Page/btn_Tablets'))
}

