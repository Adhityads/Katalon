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

WebUI.click(findTestObject('Object Repository/PostTest28/Page_playboy x missguided plus size grey li_ba0ff0/a_Checkout'))

WebUI.setText(findTestObject('Object Repository/PostTest28/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 
    'Dhitty')

WebUI.setText(findTestObject('Object Repository/PostTest28/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 
    'Dua')

WebUI.click(findTestObject('Object Repository/PostTest28/Page_Checkout  ToolsQA Demo Site/span_Indonesia'))

WebUI.setText(findTestObject('Object Repository/PostTest28/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 
    'Tambun Utara')

WebUI.setText(findTestObject('Object Repository/PostTest28/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 'Bekasi')

WebUI.click(findTestObject('Object Repository/PostTest28/Page_Checkout  ToolsQA Demo Site/span_Jawa Barat'))

WebUI.setText(findTestObject('Object Repository/PostTest28/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), '17510')

WebUI.setText(findTestObject('Object Repository/PostTest28/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), '0812233445566')

WebUI.click(findTestObject('Object Repository/PostTest28/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/PostTest28/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.closeBrowser()

