@WebU
Feature: US1011 WebUniversity Window Handle



 Scenario Outline: TC16 Reusable Methods ile Handle Testi

   Given kullanici "WebUniversityUrl" sayfasina gider
   And Login Portal'a  kadar asagi iner
   And Login Portal'a tiklar
   Then Acilan diger window'a gecer
   And "<username>" ve  "<password>" kutularina deger yazdirir
   And WebUniversity Login butonuna basar
   And 2 saniye bekler
   And Popup'ta cikan yazinin "validation failed" oldugunu test eder
   Then Ok diyerek Popup'i kapatir
   And Ilk sayfaya geri doner
   Then Ilk sayfaya donuldugunu test eder
   And sayfayi kapatir



    Examples:
     | username | password |
     |filiz     |12345     |




  #1."http://webdriveruniversity.com/" adresine gidin
  #2."Login Portal" a  kadar asagi inin
  #3."Login Portal" a tiklayin
  #4.Diger window'a gecin
  #5."username" ve  "password" kutularina deger yazdirin
  #6."login" butonuna basin
  #7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
  #8.Ok diyerek Popup'i kapatin
  #9.Ilk sayfaya geri donun
  #10.Ilk sayfaya donuldugunu test edin

  #!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
  # Then ok diyerek yerine Login butonunu tiklar dersek daha once class in birinde yapmistik
  # gidip oranin locatesini kullanir calisir karismasin diye burda yailan stepler onemlidir
  # kisa olmasi degil,acik ,anlasilir olmasi onemlidir