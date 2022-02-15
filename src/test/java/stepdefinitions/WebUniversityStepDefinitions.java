package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class WebUniversityStepDefinitions {

     // JavascriptExecutor jsc=(JavascriptExecutor) Driver.getDriver();
       WebUniversityPage webUniversityPage=new WebUniversityPage();
      Actions actions=new Actions(Driver.getDriver());

    @Given("Login Portal'a  kadar asagi iner")  //asagi inmek icin actions class yada javaScriptExecutor kullaniriz
    public void login_portal_a_kadar_asagi_iner() {
     actions.sendKeys(Keys.PAGE_DOWN).perform();
    // jsc.executeScript("arguments[0].click() ;",webUniversityPage.webUniversityLoginPortal);

    }


    @Given("Login Portal'a tiklar")
    public void login_portal_a_tiklar() {
    webUniversityPage.webUniversityLoginPortal.click();

    }

    @Then("Acilan diger window'a gecer")
    public void acilan_diger_window_a_gecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");
        System.out.println(Driver.getDriver().getWindowHandle());
        String handle1=Driver.getDriver().getWindowHandle();


    }

    @Then("{string} ve  {string} kutularina deger yazdirir")
    public void ve_kutularina_deger_yazdirir(String username, String password) {
        System.out.println("diger sayfaya gecer");
      webUniversityPage.webUniversityPasswordBox.sendKeys(password);
      webUniversityPage.webUniversityUserNameBox.sendKeys(username);


    }

    @Then("WebUniversity Login butonuna basar")
    public void web_university_login_butonuna_basar() {
      webUniversityPage.webUniversityLoginButton.click();


    }

    @Then("Popup'ta cikan yazinin {string} oldugunu test eder")
    public void popup_ta_cikan_yazinin_oldugunu_test_eder(String popUpYazi) {

        String alertYazisi=Driver.getDriver().switchTo().alert().getText();  //driver alert getirip text'i aldik
        System.out.println(alertYazisi);
        Assert.assertEquals(popUpYazi,alertYazisi);

    }

    @Then("Ok diyerek Popup'i kapatir")   //alert in verdigi uyari mesaji
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();

    }



    @Then("Ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {

        String handle1=Driver.getDriver().getWindowHandle();
        Set<String> handleDegerrleri=Driver.getDriver().getWindowHandles();
        String handle2="";
        for (String each:handleDegerrleri
        ) {
            if (!handleDegerrleri.contains(handle1)){
                handle2=each;
            }
        }
        System.out.println(handle2);

        Driver.getDriver().switchTo().window(handle2);

        String actualTitle=Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        String expectedTitle= "WebDriverUniversity.com";


        Assert.assertEquals(expectedTitle,actualTitle);

        // Assert.assertTrue(actualTitle.equals(expectedTitle));

    }


    @And("Ilk sayfaya geri doner")
    public void ilkSayfayaGeriDoner() {

    }
}



