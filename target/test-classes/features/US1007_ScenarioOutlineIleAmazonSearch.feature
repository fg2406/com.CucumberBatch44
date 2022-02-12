Feature: US1007 Scenario Outline ile amazon search

  Scenario Outline: TC12 amazonda bir listedeki tum elementleri aratma

    Given kullanici adi olarak "AmazonUrl" girer
    Then "<aranacakEleman>" icin arama yapar
    And sonuclarin "<aranacakEleman>" icerdigini test eder
    And sayfayi kapatir
   # her aramadan sonra kapatiyor ona gore yazarsin




    Examples:
    |aranacakEleman|
    |Apple|
    |Java |
    |Nutella|
    |Armut  |