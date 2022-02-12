@WebU
Feature: US1011 WebUniversity Window handle

  Scenario Outline: TC16 Resuable Methods ile window Handle

    Given kullanici "WebUniversityUrl" sayfasina gider
    And Login Portal'a kadar asagi iner
    And Login Portal'a tiklar
    Then acilan diger window'a gecer
    And "<username>" ve  "<password>" kutularina deger yazar
    And  WebUniversity login butonuna basar
    And 2 saniye bekler
    Then Popup'ta cikan yazinin "validation failed" oldugunu test eder
    Then Ok diyerek Popup'i kapatir
    And ilk sayfaya geri doner
    And Ilk sayfaya donuldugunu test eder

  Examples:
    |username|password|
    |mehmet  |donat   |