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

if (GlobalVariable.paymentMethod == 'Safepay') {
    WebUI.click(findTestObject('Payment Method/Safepay/input_safepay'))

    WebUI.verifyElementPresent(findTestObject('Payment Method/Safepay/input_safepayUsername'), 0)

    WebUI.verifyElementPresent(findTestObject('Payment Method/Safepay/input_safepay_Password'), 0)

    WebUI.waitForElementClickable(findTestObject('Payment Method/Safepay/button_PayNow_safepay'), 2)

    WebUI.click(findTestObject('Payment Method/Safepay/button_PayNow_safepay'), FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.click(findTestObject('Payment Method/Master Card/input_masterCredit'))

    WebUI.verifyElementVisible(findTestObject('Payment Method/Master Card/txt_MasterCredit'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementClickable(findTestObject('Exisiting/button_PayNow_Master'), 2)

    WebUI.click(findTestObject('Exisiting/button_PayNow_Master'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.waitForElementPresent(findTestObject('Payment Order/txt_Thank you for buying with Advantage'), 0)

WebUI.verifyElementPresent(findTestObject('Payment Order/txt_Thank you for buying with Advantage'), 0)

WebUI.closeBrowser()

