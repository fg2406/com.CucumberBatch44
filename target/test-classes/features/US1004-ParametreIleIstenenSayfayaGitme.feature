Feature: Parametre ile istenen sayfaya gitme

  Scenario: TC06 Eski usul amazona gitme
    Given kullanici amazon sayfasina gider
  #  Then kullanici techpreducation sayfasina gider(bu gitmez stringolrak farkli yukardaki ile)

  Scenario: Tc07 parametre ile istenen sayfaya gitme
    Given kullanici "amazon" sayfasina gider

    # "" tirnak icine direk adresi yazsak gider,StepDefinitions da istenenUrl yazmistik
  # ama bu anlamli olmaz tek tek uzun uzun url adresini yazmak,configuration da adresler varsa burda tek baslik yaz gider
  # amazon adresi mesela var orda