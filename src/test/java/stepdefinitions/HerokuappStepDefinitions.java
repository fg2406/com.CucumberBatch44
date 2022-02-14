package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class HerokuappStepDefinitions {


    HerokuappPage herokuappPage=new HerokuappPage();

    @When("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
     herokuappPage.addButtonElementi.click();

    }


    @Then("Delete butonuna gorununceye kadar bekler")
    public void delete_butonuna_gorununceye_kadar_bekler() {
      //  Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));,bu sekildede olur
        ReusableMethods.waitForVisibility(herokuappPage.deleteButonElement,20);


    }

    @Then("Delete butonunun gorundugunu test eder")
    public void delete_butonunun_gorundugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonElement.isDisplayed());
    }

    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler()  {
     herokuappPage.deleteButonElement.click();
    }

    @And("{int} sayniye bekler")
    public void sayniyeBekler(int sure) {

        try {
            Thread.sleep(sure*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
   //beklemeyi ReusableMethod dan yapabiliriz yada driver.mange.timeout seklinde de yapabilirz