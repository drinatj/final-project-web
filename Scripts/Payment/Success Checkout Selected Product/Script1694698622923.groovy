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

WebUI.callTestCase(findTestCase('Login-Logout/Login Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Home/Open Tablets Detail Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Payment Order/txt_HP ELITEPAD 1000 G2 TABLET'))

WebUI.verifyElementVisible(findTestObject('Payment Order/img_tablet'))

WebUI.verifyElementVisible(findTestObject('Payment Order/txt_1,009.00'))

WebUI.verifyElementVisible(findTestObject('Payment Order/txt_Color'))

WebUI.verifyElementVisible(findTestObject('Payment Order/label_Quantity'))

WebUI.verifyElementVisible(findTestObject('Payment Order/button_AddToCart'))

WebUI.click(findTestObject('Payment Order/button_AddToCart'))

WebUI.verifyElementPresent(findTestObject('Payment Order/table_CheckoutDetail'), 0)

WebUI.click(findTestObject('Payment Order/btn_Checkout(price)'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Payment Order/txt_Order Payment'), 0)

WebUI.verifyElementPresent(findTestObject('Payment Order/txt_Order Payment'), 0)

WebUI.verifyElementPresent(findTestObject('Payment Order/txt_Shipping Details'), 0)

WebUI.verifyElementPresent(findTestObject('Payment Order/txt_Payment Method'), 0)

WebUI.verifyElementPresent(findTestObject('Payment Order/txt_OrderSummary'), 0)

WebUI.verifyElementPresent(findTestObject('Payment Order/button_NEXT'), 0)

WebUI.click(findTestObject('Payment Order/button_NEXT'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Payment Method/btn_Back to shipping details'), 0)

