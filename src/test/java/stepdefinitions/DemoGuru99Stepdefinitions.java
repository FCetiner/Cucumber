package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGuru99Stepdefinitions {
    DemoGuruPage demoGuruPage=new DemoGuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenBaslikStr) {
               List<WebElement> baslikWebElementListesi=demoGuruPage.baslikWebElementListesi;
        List<String> baslikStringListesi= ReusableMethods.getElementsText(baslikWebElementListesi);

        int istenenSutunIndexi=baslikStringListesi.indexOf(istenenBaslikStr);

        List<WebElement> istenenSutunWebElementListesi=demoGuruPage.sutunListesiGetir(istenenSutunIndexi);
        List<String> istenenSutunStrList=ReusableMethods.getElementsText(istenenSutunWebElementListesi);
        System.out.println(istenenBaslikStr + "Sutunundaki elementler \n"+istenenSutunStrList);

    }


}
