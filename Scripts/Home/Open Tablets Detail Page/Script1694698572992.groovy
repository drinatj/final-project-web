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

WebUI.waitForElementPresent(findTestObject('Landing Page/btn_Tablets'), 0)

WebUI.click(findTestObject('Landing Page/btn_Tablets'))

WebUI.waitForElementPresent(findTestObject('Add to Cart Tablets/button_BuyNow'), 0)

WebUI.verifyElementVisible(findTestObject('Add to Cart Tablets/txt_Travel banner'))

WebUI.verifyElementVisible(findTestObject('Add to Cart Tablets/txt_Built for Durability banner'))

WebUI.verifyElementVisible(findTestObject('Add to Cart Tablets/txt_HP ElitePad 1000 G2 banner'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Add to Cart Tablets/button_BuyNow'))

WebUI.verifyElementVisible(findTestObject('Add to Cart Tablets/txt_Home'))

WebUI.verifyElementVisible(findTestObject('Add to Cart Tablets/link_Tablets'))

WebUI.verifyElementPresent(findTestObject('Add to Cart Tablets/txt_Tablets'), 0)

WebUI.verifyElementPresent(findTestObject('Add to Cart Tablets/txt_Tablets'), 0)

WebUI.verifyElementPresent(findTestObject('Add to Cart Tablets/txt_3 ITEMS'), 0)

WebUI.verifyElementPresent(findTestObject('Add to Cart Tablets/label_FILTER BY'), 0)

WebUI.verifyElementPresent(findTestObject('Add to Cart Tablets/txt_Price'), 0)

WebUI.verifyElementPresent(findTestObject('Add to Cart Tablets/txt_Display'), 0)

WebUI.verifyElementPresent(findTestObject('Add to Cart Tablets/txt_Processor'), 0)

WebUI.verifyElementPresent(findTestObject('Add to Cart Tablets/txt_Color'), 0)

WebUI.verifyElementPresent(findTestObject('Add to Cart Tablets/btn_HP ElitePad 1000 G2 Tablet'), 0)

WebUI.verifyElementPresent(findTestObject('Add to Cart Tablets/link_1,009.00'), 0)

WebUI.click(findTestObject('Add to Cart Tablets/btn_HP ElitePad 1000 G2 Tablet'), FailureHandling.STOP_ON_FAILURE)

