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

Mobile.startApplication('D:\\1. Kerja\\MST\\mst-qa-0.0.1.apk', true)

Mobile.setText(findTestObject('Object Repository/Obj_DataPrimary/android.widget.EditText - Username'), 'mstqa', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Obj_DataPrimary/android.widget.EditText - Password'), 'iFGeFYmXIrUhQZHvW7P22w==', 
    0)

Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.Button Add todo new'), 0)

Mobile.setText(findTestObject('Object Repository/Obj_DataPrimary/android.widget.EditText - Input Name'), 'MST QA Test', 
    0)

Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.ImageView - arrow previous month'), 0)

Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.ImageView - arrow previous month'), 0)

Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.Button Date - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.ImageView - Type'), 0)

Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.TextView - Primary'), 0)

Mobile.setText(findTestObject('Object Repository/Obj_DataPrimary/android.widget.EditText - Input Description'), 'Testing', 
    0)

Mobile.tap(findTestObject('Object Repository/Obj_DataPrimary/android.widget.Button BTN Add Todo'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

