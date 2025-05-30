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

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/svg_Start Date_feather feather-calendar'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 250)

WebUI.selectOptionByValue(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/select_204520442043204220412040203920382037_364d99'), 
    '2023', true)

WebUI.delay(2)

WebUI.clickOffset(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_1'), 2, 2)

WebUI.selectOptionByValue(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/select_204520442043204220412040203920382037_364d99'), 
    '2026', true)

WebUI.clickOffset(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_1'), 1, 1)

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_save'))

WebUI.scrollToPosition(0, 5)

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/p_Semua'))

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/svg_Start Date_feather feather-calendar'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 250)

WebUI.selectOptionByValue(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/select_204520442043204220412040203920382037_364d99'), 
    '2029', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/select_204520442043204220412040203920382037_364d99'), 
    '2023', true)

WebUI.delay(2)

WebUI.clickOffset(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/span_1'), 2, 2)

WebUI.selectOptionByValue(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/select_204520442043204220412040203920382037_364d99'), 
    '2026', true)

WebUI.clickOffset(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/span_29'), 1, 1)

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_save'))

WebUI.scrollToPosition(0, 1)

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Search'))

