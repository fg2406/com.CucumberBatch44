package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //runner in cucumber ile calismasini saglar bu uyum
@CucumberOptions(

        plugin={"html:target\\Pcucumber-reports1.html",
                "json:target/json-reports/Pcucumber1.json",
                "junit:target/xml-report/Pcucumber1.xml"}, //raporlama icin bunu eklemek yeterli,burdan calistirinca  html raporu tager altinda olusur
        features ="src/test/resources/features",  //bilgisayarsaki features in yolunu koy
        glue="stepdefinitions",  //yapistirici demek glue,features ile nereyi yapistirayim(calistiracak birlikte)
        tags ="@DemoGuru",          //buraya features teki feature icine senario nun ustune yazilian yazilir
        dryRun=false
)



public class Runner {  //runWith yazinca yesil calistirma cikti

  //Runner classs'in body'sine hicbirsey yazmiyoruz
    //bu class icin onemli olan kullailacak iki notasyon yazilacak bunlar bizim herseyimiz



}
//eger bu class tan calistirirsak tags ismi olan class'a yere gider ,orayi calistirir
//dryRun: false yapinca hersey calisir,true yapinca hic calismadan hatayi gormek(eksik stepler) icin yazilir,hatadan eminsek
//once true yapar bakabiliriz,hata yoksa zaten true gerek yok


// sirali calistirma mumkun,tags kismina ayni isimleri verirsek sirayla calistirir
//ama birde ayni anda farkli browser lerde paralel calistirmak istiyorsak farkli bir yontem var

// paralel testing cucumber icin pom.xml extra birseyler ekledik
//sonra kac tane ayni anda calissin istiyorsak paralel1,paralel2.... gibi runner aciyoruz
//tags larina yazip features ayni ismi veriyoruz ,terminalden calistiriyorz
//mvn clean verify yazip calistiriyoruz
