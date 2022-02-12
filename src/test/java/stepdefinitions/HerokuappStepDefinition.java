package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ReusableMethods;

public class HerokuappStepDefinition {
HerokuappPage herokuappPage=new HerokuappPage();

    @When("Add Element butona basar")
    public void add_element_butona_basar() {
      herokuappPage.addButonElement.click();
    }
    @Then("Delete butonu goruunceye kadar bekler")
    public void delete_butonu_goruunceye_kadar_bekler() {
        ReusableMethods.waitForVisibility(herokuappPage.deleteButonElement,20);
    }
    @Then("Delete butonunun gorundugunu test eder")
    public void delete_butonunun_gorundugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonElement.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuappPage.deleteButonElement.click();
    }
}
