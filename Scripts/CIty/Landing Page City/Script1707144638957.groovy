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

WebUI.navigateToUrl('https://sit.auto2000.co.id/dealer-toyota')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Header Component/a_Hubungi Kami'), 0)

WebUI.verifyElementPresent(findTestObject('Header Component/div_Jakarta Pusat'), 0)

WebUI.verifyElementPresent(findTestObject('Breadcrumbs City/div_Home'), 0)

WebUI.verifyElementPresent(findTestObject('Breadcrumbs City/div_Dealer Toyota'), 0)

WebUI.verifyElementPresent(findTestObject('Breadcrumbs City/span_Jakarta Pusat'), 0)

WebUI.verifyElementPresent(findTestObject('Header/div_DKI Jakarta'), 0)

WebUI.verifyElementPresent(findTestObject('Header/div_Jakarta Pusat'), 0)

WebUI.verifyElementPresent(findTestObject('Header/button_FILTER'), 0)

WebUI.verifyElementPresent(findTestObject('Header/button_LIST VIEW'), 0)

WebUI.verifyElementPresent(findTestObject('Header/button_MINTA PENAWARAN'), 0)

WebUI.verifyElementPresent(findTestObject('Header/div_Menampilkan 11 Cabang di Jakarta Pusat'), 0)

WebUI.scrollToElement(findTestObject('Section Branch/Section Branch/Listing Branch'), 0)

WebUI.verifyElementPresent(findTestObject('Section Branch/Section Branch/Listing Branch'), 0)

WebUI.scrollToElement(findTestObject('Section Promo City/div_trendingBerkendara Dengan All New Agya Bikin Hidup Makin Bahagia1 Jan 2024 - 1 Mar 2024'), 
    0)

WebUI.verifyElementPresent(findTestObject('Section Promo City/div_trendingBerkendara Dengan All New Agya Bikin Hidup Makin Bahagia1 Jan 2024 - 1 Mar 2024'), 
    0)

WebUI.verifyElementPresent(findTestObject('Section Promo City/h2_PROMO AUTO2000 Jakarta Pusat'), 0)

WebUI.verifyElementPresent(findTestObject('Section Promo City/p_Berikut adalah promo yang berlaku di cabang Auto2000 Jakarta Pusat'), 
    0)

WebUI.scrollToElement(findTestObject('Section Event Ciity/div_Ikuti Cara Membersihkan Lubang AC Mobil Toyota Anda12 Jan 2024Begini Cara Cek Oli Transmisi Mobil Matic Toyota12 Jan 2024'), 
    0)

WebUI.verifyElementPresent(findTestObject('Section Event Ciity/div_Ikuti Cara Membersihkan Lubang AC Mobil Toyota Anda12 Jan 2024Begini Cara Cek Oli Transmisi Mobil Matic Toyota12 Jan 2024'), 
    0)

WebUI.verifyElementPresent(findTestObject('Section Event Ciity/h2_Event Auto2000 Jakarta Pusat'), 0)

WebUI.verifyElementPresent(findTestObject('Section Event Ciity/p_Berikut adalah Berita Seputar Auto2000 Jakarta Pusat'), 
    0)

