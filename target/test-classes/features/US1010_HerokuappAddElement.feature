Feature: US1010 Herokuapp sayfasinda add butonu testi

  @Hero
  Scenario: TC15 sonradan gorunen elemanlar

    Given kullanici "HerokuappAddElementUrl" sayfasina gider
    When Add Element butona basar
    Then Delete butonu goruunceye kadar bekler
    And Delete butonunun gorundugunu test eder
    Then Delete butonuna basarak butonu siler
    And sayfayi kapatir



