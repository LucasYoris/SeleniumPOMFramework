package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Test {

    private WebDriver driver = Hooks.getDriver();

    @Given("^el usuario se encuentra en la página home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_página_home_de_imalittletester() throws Throwable {
        String title = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        Assert.assertEquals(title,driver.getTitle());
    }

    @When("^el usuario clickea el botón the little tester comics$")
    public void el_usuario_clickea_el_botón_the_little_tester_comics() throws Throwable {
        WebElement btnComics = driver.findElement(By.id("menu-item-2008"));
        btnComics.click();
    }

    @Then("^Se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {
        Thread.sleep(2000);
        WebElement pageComicTitle = driver.findElement(By.className("page-title"));
        Assert.assertTrue("No se mostró el titulo",pageComicTitle.isDisplayed());
        Assert.assertEquals("Category: comics",pageComicTitle.getText());
    }


}
