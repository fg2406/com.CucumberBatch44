package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
//import utilities.Driver;


public class Hooks {

     //stepdefinition altinda bir after methodunun olmasi onmelidir adinin onemi yoktur
    //onemli olan stepdefinitions da bir after method olmasidir,raporlama icin bu class onmelidir
    //cucumberde feature ve stepdefinition eslesmesi class seviyesinde degil package seviyesindedir
    //senaryo faild olursa foto cekip raporlar,bu class bunu yapar


       @Before
        public void setUp(){

        }

        @After

        public void tearDown(Scenario scenario){
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            if (scenario.isFailed()) {
                scenario.attach(screenshot, "image/png","screenshots");
            }
            Driver.closeDriver();  //bu oldugu icin bir daha sayfayi kapatir demeye gerek kalmaz,
            //close her durumda calsilir if icinde degil cunku
        }
    }






