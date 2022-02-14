Feature: US1010 Herokuapp sayfasinda add butonu testi

 @Hero
  Scenario: TC15 sonradan gorunen elemanlar calismali


    # bu kisim bize kalmis direk adreside yazabilirdik ,configuration da koyabilirz
  # cok kulllanmayacaksak direk buraya yazmak mantikli,surekli gidlen adresler ise
  # configuration.propertiese koymak mantikli

    Given kullanici "HerokuappAddElementUrl" sayfasina gider
    When Add Element butonuna basar
    Then Delete butonuna gorununceye kadar bekler
    And Delete butonunun gorundugunu test eder
    Then Delete butonuna basarak butonu siler
    And sayfayi kapatir



    # soru:Yeni bir test methodu olusturalim
    #https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    #“Add Element” butona basin
    #“Delete” butonu gorunur oluncaya kadar bekleyin
    #“Delete” butonunun gorunur oldugunu test edin
    #Delete butonuna basarak butonu silin
    #Delete butonuna basarak butonu siler
   # Given:bilinen,belirlenmis
   # When: ne zaman olursa
   # Then: sonra
   # and: ve