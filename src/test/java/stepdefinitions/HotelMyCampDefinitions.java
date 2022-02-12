package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampDefinitions {

    HMCPage hmcPage=new HMCPage();

    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        hmcPage.mainPageLoginLinki.click();

    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String kullaniciTipi) {
        hmcPage.usernameTextBox.sendKeys(ConfigReader.getProperty(kullaniciTipi));

    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTuru) {
        hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty(passwordTuru));

    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.loginButonu.click();

    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {

        Assert.assertTrue(hmcPage.basariliGirisYaziElementi.isDisplayed());

    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {

        Assert.assertTrue(hmcPage.girisYapilamadiYaziElementi.isDisplayed());

    }


    @Then("scenario outline'dan kullanici adi olarak {string} yazar")
    public void scenarioOutlineDanKullaniciAdiOlarakYazar(String username) {
        hmcPage.usernameTextBox.sendKeys(username);
    }

    @And("scenario outline'dan password olarak {string} yazar")
    public void scenarioOutlineDanPasswordOlarakYazar(String password) {
        hmcPage.passwordTextBox.sendKeys(password);
    }


    @When("scenario outline'den {string} yazar")
    public void scenarioOutlineDenYazar(String username) {
      hmcPage.usernameTextBox.sendKeys(username);
    }

    @And("scenario outline'dan {string} yazar")
    public void scenarioOutlineDanYazar(String password) {
     hmcPage.passwordTextBox.sendKeys(password);

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
}
