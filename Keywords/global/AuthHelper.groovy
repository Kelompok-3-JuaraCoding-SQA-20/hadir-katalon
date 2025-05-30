package global

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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType

static def executeLogin() {
	WebUI.openBrowser('https://magang.dikahadir.com/authentication/login')
	WebUI.maximizeWindow()
	TestObject emailInputField = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//input[@id='email']")
	WebUI.setText(emailInputField, 'admin@hadir.com')
	TestObject passwordInputField = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//input[@id='password']")
	WebUI.setEncryptedText(passwordInputField, 'aSC42nPN26UggVXAwmiGmQ==')
	TestObject submitButton = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//button[@type='submit']")
	WebUI.click(submitButton)
}