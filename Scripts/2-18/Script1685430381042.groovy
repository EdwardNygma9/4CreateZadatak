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

WebUI.navigateToUrl('https://rahulshettyacademy.com/seleniumPractise/#/')

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/a_'))

WebUI.doubleClick(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/a_'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/a_'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/img'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_PROCEED TO CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/input_Total_promoCode'), '613')

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_Place Order'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/select_SelectAfghanistanAlbaniaAlgeriaAndor_973f8b'), 
    'Anguilla', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/select_SelectAfghanistanAlbaniaAlgeriaAndor_973f8b'), 
    'Austria', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/select_SelectAfghanistanAlbaniaAlgeriaAndor_973f8b'), 
    'Bahrain', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/select_SelectAfghanistanAlbaniaAlgeriaAndor_973f8b'), 
    'Bahrain', true)

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/input_Choose Country_chkAgree'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/input_Choose Country_chkAgree'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/select_SelectAfghanistanAlbaniaAlgeriaAndor_973f8b'), 
    'Lebanon', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/select_SelectAfghanistanAlbaniaAlgeriaAndor_973f8b'), 
    'Lebanon', true)

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_Proceed'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/input_Choose Country_chkAgree'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_Proceed'))

WebUI.switchToWindowTitle('WebDriverUniversity.com')

WebUI.click(findTestObject('Object Repository/Page_WebDriverUniversity.com/h1_ACTIONS'))

WebUI.switchToWindowTitle('WebDriver | Actions')

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Actions/b_DRAG ME TO MY TARGET'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Actions/a_Link 1'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.webdriveruniversity.com/Contact-Us/contactus.html')

WebUI.setText(findTestObject('Object Repository/Page_WebDriver  Contact Us/textarea_CONTACT US_message'), 'http://www.webdriveruniversity.com/Contact-Us/contactus.html')

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Contact Us/body_Toggle navigationWebdriverUniversity.c_80e78a'))

WebUI.setText(findTestObject('Object Repository/Page_WebDriver  Contact Us/textarea_CONTACT US_message'), 'Well done you clicked on the link!')

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Contact Us/input_CONTACT US_contact_button'))

WebUI.closeBrowser()

