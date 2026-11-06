import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('file:///Users/aliza/Documents/index.html')

WebUI.setText(findTestObject('Page_Inventory System/input_Product Name'), 'Tas')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '200000')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '1')

WebUI.click(findTestObject('Page_Inventory System/button_Add Item'))

WebUI.setText(findTestObject('Page_Inventory System/input_Product Name'), '')

WebUI.click(findTestObject('Page_Inventory System/input_Product Name'))

WebUI.click(findTestObject('Page_Inventory System/input_Price'))

WebUI.click(findTestObject('Page_Inventory System/input_Quantity'))

WebUI.click(findTestObject('Page_Inventory System/button_Add Item'))

WebUI.setText(findTestObject('Page_Inventory System/input_Product Name'), 'Sepatu')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '100000')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '40')

WebUI.click(findTestObject('Page_Inventory System/button_Add Item'))

WebUI.click(findTestObject('Page_Inventory System/input_Product Name'))

WebUI.click(findTestObject('Page_Inventory System/input_Price'))

WebUI.setText(findTestObject('Page_Inventory System/input_Product Name'), 'Case')

WebUI.click(findTestObject('Page_Inventory System/button_Add Item'))

WebUI.setText(findTestObject('Page_Inventory System/input_Product Name'), '')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '')

WebUI.click(findTestObject('Page_Inventory System/td_Case'))

WebUI.doubleClick(findTestObject('Page_Inventory System/td_Case'))

WebUI.click(findTestObject('Page_Inventory System/td_100000'))

WebUI.click(findTestObject('Page_Inventory System/button_Delete'))

WebUI.click(findTestObject('Page_Inventory System/button_Delete_1'))

WebUI.click(findTestObject('Page_Inventory System/button_Delete_2'))

WebUI.click(findTestObject('Page_Inventory System/button_Delete_1'))

WebUI.click(findTestObject('Page_Inventory System/button_Delete'))

WebUI.click(findTestObject('Page_Inventory System/button_Delete_2'))

WebUI.click(findTestObject('Page_Inventory System/td_200000'))

WebUI.click(findTestObject('Page_Inventory System/td_4000000'))

WebUI.click(findTestObject('Page_Inventory System/td_200000'))

WebUI.click(findTestObject('Page_Inventory System/td_4000000'))

WebUI.click(findTestObject('Page_Inventory System/td_4000000_1'))

WebUI.click(findTestObject('Page_Inventory System/td_40'))

WebUI.click(findTestObject('Page_Inventory System/td_40_1'))

WebUI.click(findTestObject('Page_Inventory System/td_1'))

WebUI.click(findTestObject('Page_Inventory System/td_40'))

WebUI.click(findTestObject('Page_Inventory System/td_200000_1'))

WebUI.click(findTestObject('Page_Inventory System/td_100000_1'))

WebUI.click(findTestObject('Page_Inventory System/td_100000'))

WebUI.click(findTestObject('Page_Inventory System/th_Name'))

WebUI.click(findTestObject('Page_Inventory System/td_Tas'))

WebUI.click(findTestObject('Page_Inventory System/td_Sepatu'))

WebUI.click(findTestObject('Page_Inventory System/td_Case'))

WebUI.setText(findTestObject('Page_Inventory System/input_Product Name'), '100')

WebUI.click(findTestObject('Page_Inventory System/input_Price'))

WebUI.setText(findTestObject('Page_Inventory System/input_Product Name'), '1111')

WebUI.click(findTestObject('Page_Inventory System/input_Quantity'))

WebUI.click(findTestObject('Page_Inventory System/div_Inventory Manager'))

WebUI.click(findTestObject('Page_Inventory System/button_Delete_3'))

WebUI.doubleClick(findTestObject('Page_Inventory System/button_Delete_3'))

WebUI.click(findTestObject('Page_Inventory System/button_Delete_3'))

WebUI.setText(findTestObject('Page_Inventory System/input_Product Name'), 'Tumbler')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '650000')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '1')

WebUI.click(findTestObject('Page_Inventory System/button_Add Item'))

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '2')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '3')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '4')

WebUI.doubleClick(findTestObject('Page_Inventory System/input_Quantity'))

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '3')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '2')

WebUI.doubleClick(findTestObject('Page_Inventory System/input_Quantity'))

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '1')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '0')

WebUI.click(findTestObject('Page_Inventory System/input_Product Name'))

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '1')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '2')

WebUI.doubleClick(findTestObject('Page_Inventory System/input_Price'))

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '3')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '4')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '5')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '6')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '7')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '6')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '5')

WebUI.doubleClick(findTestObject('Page_Inventory System/input_Price'))

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '4')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '3')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '2')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '1')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '0')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '-1')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '-2')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '-3')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '-4')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '1')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '0')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '-1')

WebUI.doubleClick(findTestObject('Page_Inventory System/input_Quantity'))

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '-2')

WebUI.click(findTestObject('Page_Inventory System/input_Product Name'))

WebUI.click(findTestObject('Page_Inventory System/button_Add Item'))

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '')

WebUI.click(findTestObject('Page_Inventory System/input_Quantity'))

WebUI.setText(findTestObject('Page_Inventory System/input_Product Name'), '')

WebUI.click(findTestObject('Page_Inventory System/td_5'))

