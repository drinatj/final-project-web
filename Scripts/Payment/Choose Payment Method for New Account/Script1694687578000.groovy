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

WebUI.verifyElementPresent(findTestObject('Payment Method/Safepay/input_safepay'), 0)

WebUI.verifyElementPresent(findTestObject('Payment Method/Master Card/input_masterCredit'), 0)

def paymentMethod

if (GlobalVariable.paymentMethod == 'Safepay') {
    WebUI.click(findTestObject('Payment Method/Safepay/input_safepay'))

    WebUI.setText(findTestObject('Payment Method/Safepay/input_safepayUsername'), 'jenidangsut')

    WebUI.setText(findTestObject('Payment Method/Safepay/input_safepay_Password'), 'Admin@12345')

    WebUI.waitForElementClickable(findTestObject('Payment Method/Safepay/button_PayNow_safepay'), 2)

    WebUI.click(findTestObject('Payment Method/Safepay/button_PayNow_safepay'), FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.click(findTestObject('Payment Method/Master Card/input_masterCredit'))

    WebUI.setText(findTestObject('Payment Method/Master Card/input_CardNumber'), '2345678901234596')

    WebUI.setText(findTestObject('Payment Method/input_cvvNumber'), '2333')

    WebUI.selectOptionByIndex(findTestObject('Payment Method/Master Card/select_ExpMonth'), 11)

    WebUI.selectOptionByIndex(findTestObject('Payment Method/Master Card/select_ExpYear'), 7)

    WebUI.setText(findTestObject('Payment Method/Master Card/input_CardholderName'), 'drinetest')

    WebUI.waitForElementClickable(findTestObject('Payment Method/Master Card/button_PayNow_master'), 2)

    WebUI.click(findTestObject('Payment Method/Master Card/button_PayNow_master'))
}

WebUI.waitForElementPresent(findTestObject('Payment Order/txt_Thank you for buying with Advantage'), 0)

WebUI.verifyElementPresent(findTestObject('Payment Order/txt_Thank you for buying with Advantage'), 0)

WebUI.closeBrowser()

