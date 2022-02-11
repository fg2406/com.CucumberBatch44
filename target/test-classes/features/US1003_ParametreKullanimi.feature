@parametreliTest
Feature:US1003 parametre ile stepdefinitions olusturma



  Scenario:  TC05_parametre kullanimi   # parametre icin aranacak yer tirnak icine alinir

    Given kullanici amazon sayfasina gider
    And "iPhone" icin arama yapar
    Then sonuclarin "iPhone" icerdigini test eder
    And ana sayfayi kapatir
    # And ve then sari oldu tirnak icine alinca ,yani calismayacagini birsey eksik stepdefinitions da oldugunu belirtti
    # bu durumda runner de true yapip calistirip eksikleri gorur alir stepdefinition eklersek
    # burasi normale doner