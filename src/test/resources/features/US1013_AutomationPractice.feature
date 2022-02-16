Feature: US1013 Invalid email testi



  Scenario: TC18 Invalid email ile giris yapilamaz
    Given kullanici "AutomationPracticeUrl" sayfasina gider
    And user sign in linkine tiklar
    And email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar
    Then error mesajinin “Invalid email address”  oldugunu dogrulayin














#http://automationpractice.com/index.php sayfasina gidelim
#Cucumber ile asagidaki testi yapalim
#        -   Given user web sayfasinda
#        -   And user sign in linkine tiklar
#        -   And email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar
#        - Then error mesajinin “Invalid email address”  oldugunu dogrulayin
#Collapse