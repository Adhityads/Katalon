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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.click(findTestObject('Object Repository/PostTest28/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Dismiss'))

WebUI.click(findTestObject('Object Repository/PostTest28/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account'))

WebUI.setText(findTestObject('Object Repository/PostTest28/Page_My Account  ToolsQA Demo Site/input__username'), 'dhittydua')

WebUI.setEncryptedText(findTestObject('Object Repository/PostTest28/Page_My Account  ToolsQA Demo Site/input__password'), 
    'ogt5Bu5jjbgSNWaiKMRfTuT1u2MfbzlC')

WebUI.click(findTestObject('Object Repository/PostTest28/Page_My Account  ToolsQA Demo Site/button_Log in'))

WebUI.click(findTestObject('Object Repository/PostTest28/Page_My Account  ToolsQA Demo Site/img_Checkout_custom-logo'))

WebUI.click(findTestObject('Object Repository/PostTest28/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/i_Checkout_icon_search'))

WebUI.setText(findTestObject('Object Repository/PostTest28/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/input_Type and Press Enter to Search_s'), 
    'dress')

WebUI.sendKeys(findTestObject('Object Repository/PostTest28/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/PostTest28/Page_Search Results for dress  ToolsQA Demo Site/p_Showing all 16 results'), 
    'Showing all 16 results')

WebUI.click(findTestObject('Object Repository/PostTest28/Page_Search Results for dress  ToolsQA Demo Site/a_white milkmaid hook and eye bodycon midi dress'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PostTest28/Page_white milkmaid hook and eye bodycon mi_dddcd5/select_Choose an optionWhite'), 
    'white', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PostTest28/Page_white milkmaid hook and eye bodycon mi_dddcd5/select_Choose an optionMediumSmallX-Large'), 
    'medium', true)

WebUI.click(findTestObject('Object Repository/PostTest28/Page_white milkmaid hook and eye bodycon mi_dddcd5/button_Add to cart'))

WebUI.verifyElementText(findTestObject('Object Repository/PostTest28/Page_white milkmaid hook and eye bodycon mi_dddcd5/div_View cart white milkmaid hook and eye b_9092d0'), 
    'View cart “white milkmaid hook and eye bodycon midi dress” has been added to your cart.')

WebUI.click(findTestObject('Object Repository/PostTest28/Page_white milkmaid hook and eye bodycon mi_dddcd5/a_Search'))

WebUI.setText(findTestObject('Object Repository/PostTest28/Page_white milkmaid hook and eye bodycon mi_dddcd5/input_Type and Press Enter to Search_s'), 
    'shirt')

WebUI.sendKeys(findTestObject('Object Repository/PostTest28/Page_white milkmaid hook and eye bodycon mi_dddcd5/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PostTest28/Page_Search Results for shirt  ToolsQA Demo Site/a_playboy x missguided plus size grey lips _adf89a'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PostTest28/Page_playboy x missguided plus size grey li_ba0ff0/select_Choose an optionGrey'), 
    'grey', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PostTest28/Page_playboy x missguided plus size grey li_ba0ff0/select_Choose an option404244'), 
    '40', true)

WebUI.click(findTestObject('Object Repository/PostTest28/Page_playboy x missguided plus size grey li_ba0ff0/button_Add to cart'))

WebUI.verifyElementText(findTestObject('Object Repository/PostTest28/Page_playboy x missguided plus size grey li_ba0ff0/div_View cart playboy x missguided plus siz_efad4d'), 
    'View cart “playboy x missguided plus size grey lips print front cropped t shirt” has been added to your cart.')

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

WebUI.verifyElementText(findTestObject('Object Repository/PostTest28/Page_Checkout  ToolsQA Demo Site/p_Thank you. Your order has been received'), 
    'Thank you. Your order has been received.')

