Feature: US1008 Scenario Outline kullanarak farkli degerlerle negative login testi
@Nega
  Scenario Outline: TC13 kullanici farkli kullanici adi ve password

  Given  kullanici "HMCUrl" sayfasina gider
    And  login linkine tiklar
    When scenario outline'den "<username>" yazar
    And scenario outline'dan "<password>" yazar
    And  Login butonuna basar
    Then giris yapilamadigini test eder






    Examples:
      |username|password|
      |MANAGER |MANAGER1|
      |manager |manager1|
      |MANager |MANager1|
      |Man ager|Man ager1!|