import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://github.com/')

WebUI.click(findTestObject('Page_The worlds leading software de/h1_Built for developers'))

WebUI.setText(findTestObject('Page_The worlds leading software de/input_userlogin'), 'drops1')

WebUI.verifyElementPresent(findTestObject('Page_The worlds leading software de/dd_Username is already taken'), 0)

WebUI.setText(findTestObject('Page_The worlds leading software de/input_userlogin'), 'drops12')

WebUI.verifyElementVisible(findTestObject('Page_The worlds leading software de/dd_Username is already taken'))

WebUI.setText(findTestObject('Page_The worlds leading software de/input_userlogin'), 'drops123')

WebUI.verifyElementVisible(findTestObject('Page_The worlds leading software de/dd_Username is already taken'))

WebUI.setText(findTestObject('Page_The worlds leading software de/input_userlogin'), 'drops1234')

WebUI.closeBrowser()

