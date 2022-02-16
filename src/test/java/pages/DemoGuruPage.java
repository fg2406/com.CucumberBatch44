package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoGuruPage {

public DemoGuruPage(){

    PageFactory.initElements(Driver.getDriver(),this);

}

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> baslikWebelemntListesi;

   //sutunda index yok,1 den baslar

    @FindBy(xpath = "//button[@id='save']")
    public WebElement cookiesKabulButonu;

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> baslikWebelementListesi;

    @FindBy(xpath = "//iframe[@class='faktor-iframe-wrapper']")
    public WebElement iframe;

    @FindBy(xpath = "//span[text()='Accept All']")
    public WebElement cookiesKabulEtButonu;
    

    public  List<WebElement> sutunListesiGetir(int index){
        String dinamikXpath= "//tbody//tr//td["+(index+1)+"]";

        List<WebElement> istenenSutunWebelementleri= Driver.getDriver().findElements(By.xpath(dinamikXpath));

        return istenenSutunWebelementleri;
    }


}





