package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@hotel",
        dryRun = true
)
public class Runner {
    //Runner classinin bodysine hiçbir kod yazmiyoruz
    //Bu class icin onemli olan kullanacagimiz iki adet notasyon

    //dryRun=false yazildiginda yukarida belirlenen tag ile etiketlenen tüm senaryolari sirasi ile calistirir
    //dryrun=true dedigimizde ise eksik stepler olup olmadigini kontrol eder
    // ve varsa bize eksik stepleri rapor eder


}
