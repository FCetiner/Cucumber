package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPages;
import utilities.Driver;

public class EditorStepDefinitions {
    EditorPages editorPages=new EditorPages();

    @When("kullanici editor anasayfaya gider")
    public void kullaniciHttpsEditorDatatablesNetAdresineGider() {
        Driver.getDriver().get("https://editor.datatables.net");
    }


    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPages.newButton.click();
    }
    @Then("firstname olarak {string} yazar")
    public void firstname_olarak_yazar(String firstname) {
      editorPages.firstNameBox.sendKeys(firstname);
    }
    @Then("lastname olarak {string} yazar")
    public void lastname_olarak_yazar(String lastName) {
        editorPages.lastNameBox.sendKeys(lastName);
    }
    @Then("Position olarak {string} yazar")
    public void position_olarak_yazar(String position) {
        editorPages.possitionBox.sendKeys(position);
    }
    @Then("Office olarak {string} yazar")
    public void office_olarak_yazar(String office) {
      editorPages.officeBox.sendKeys(office);
    }
    @Then("Extension olarak {string} yazar")
    public void extension_olarak_yazar(String extension) {
       editorPages.extensionBox.sendKeys(extension);
    }
    @And("Start date olarak {string} yazar")
    public void startDateOlarakYazar(String startDate) {
        editorPages.dateBox.sendKeys(startDate);
    }
  
    @Then("Salary olarak {string} yazar")
    public void salary_olarak_yazar(String salary) {
        editorPages.salary.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
       editorPages.createButonElement.click();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String firstname) {
        editorPages.searchBoxElement.sendKeys(firstname);
    }
    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isim_bolumunde_oldugunu_dogrular(String firstname) {
    String sonucStr=editorPages.aramasonucuElement.getText();
        Assert.assertTrue(sonucStr.contains(firstname));
    }


    @And("{int} saniye bekler")
    public void saniyeBekler(int sure) {
        try {
            Thread.sleep(sure*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
