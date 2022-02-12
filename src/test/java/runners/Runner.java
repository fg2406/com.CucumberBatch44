package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //runner in cucumber ile calismasini saglar bu uyum
@CucumberOptions(


        plugin={"html:target\\cucumber-reports.html"}, //raporlama icin bunu eklemek yeterli,burdan calistirinca  html raporu tager altinda olusur
        features ="src/test/resources/features",  //bilgisayarsaki features in yolunu koy
        glue="stepdefinitions",  //yapistirici demek glue,features ile nereyi yapistirayim(calistiracak birlikte)
        tags ="@Editor",          //buraya features teki feature icine senario nun ustune yazilian yazilir
        dryRun=false
)



public class Runner {  //runWith yazinca yesil calistirma cikti

  //Runner classs'in body'sine hicbirsey yazmiyoruz
    //bu class icin onemli olan kullailacak iki notasyon yazilacak bunlar bizim herseyimiz



}
//eger bu class tan calistirirsak tags ismi olan class'a yere gider ,orayi calistirir
//dryRun: false yapinca hersey calisir,true yapinca hic calismadan hatayi gormek(eksik stepler) icin yazilir,hatadan eminsek
//once true yapar bakabiliriz,hata yoksa zaten true gerek yok