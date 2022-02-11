package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPages;
import utilities.ConfigReader;

public class HotelMyCampStepDefinitions {
    HMCPages hmcPages=new HMCPages();

    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        hmcPages.mainPageLoginLinki.click();
    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String kullaniciTipi) {
        hmcPages.usernameTextBox.sendKeys(ConfigReader.getProperty(kullaniciTipi));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTuru) {
        hmcPages.passwordBox.sendKeys(ConfigReader.getProperty(passwordTuru));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmcPages.loginButonu.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(hmcPages.basariliGirisYaziElementi.isDisplayed());
    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPages.girisYapilamadiYaziElementi.isDisplayed());
    }



    @Then("scenario outline'dan kullanici adi olarak {string} yazar")
    public void scenarioOutlineDanKullaniciAdiOlarakYazar(String username) {
        hmcPages.usernameTextBox.sendKeys(username);
    }

    @And("scenario outline'dan password olarak {string} yazar")
    public void scenarioOutlineDanPasswordOlarakYazar(String password) {
        hmcPages.passwordBox.sendKeys(password);
    }
}
