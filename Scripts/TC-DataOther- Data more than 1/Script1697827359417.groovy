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

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

// Load test data from the CSV file
def testData = findTestData('D:\1. Kerja\MST\Skenaio') // Replace with the actual path to your CSV file

Mobile.startApplication('D:\\1. Kerja\\MST\\mst-qa-0.0.1.apk', true)

Mobile.setText(findTestObject('Object Repository/Obj_DataPrimary/android.widget.EditText - Username'), 'mstqa', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Obj_DataPrimary/android.widget.EditText - Password'), 'iFGeFYmXIrUhQZHvW7P22w==', 0)

Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.Button'), 0)

for (int i = 1; i <= testData.getRowNumbers(); i++) {
	// Get data from the CSV file for each iteration
	def name = testData.getValue(i, 'Name')
	def date = testData.getValue(i, 'Date')
	def type = testData.getValue(i, 'Type')
	def description = testData.getValue(i, 'Description')

	Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.Button Add todo new'), 0)

	Mobile.setText(findTestObject('Object Repository/Obj_DataPrimary/android.widget.EditText - Input Name'), name, 0)

	Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.TextView -'), 0)
	
	

	// You can add code here to set the date, type, and description fields.

	Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.Button BTN Add Todo'), 0)

	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

Mobile.closeApplication()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

