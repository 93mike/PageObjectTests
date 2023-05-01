package pages.magento_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.base.BasePage;

import java.lang.Thread;

public class MagentoHomePage extends BasePage {
    public MagentoHomePage(WebDriver driver) {
        super(driver);
    }

    private final By navigationWomen = By.xpath("//following-sibling::li//span[text()='Women']");
    private final By navigationWomenTops = By.xpath("//span[text()='Women']/parent::a/following-sibling::ul/li[contains(@class, 'first')]//span[text()='Tops']");
    private final By navigationWomenTopsJackets = By.xpath("//span[text()='Women']/parent::a/following-sibling::ul/li[contains(@class, 'first')]//span[text()='Jackets']");
    private final By jacketsTitle = By.xpath("//h1/span[text()='Jackets']");
    private final By subMenuHome = By.xpath("//li[@class='item home']");
    private final By subMenuWomen = By.xpath("//li[@class='item home']/following-sibling::li/a[contains(text(),'Women')]");
    private final By subMenuTops = By.xpath("//li[@class='item home']/following-sibling::li/a[contains(text(),'Tops')]");
    private final By subMenuJackets = By.xpath("//li/strong[contains(text(),'Jackets')]");

    public MagentoHomePage selectJacketsFromNavMenu() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement((driver.findElement(navigationWomen)))
                .clickAndHold().build().perform();
        actions.moveToElement(driver.findElement(navigationWomenTops))
                .clickAndHold().build().perform();
        driver.findElement(navigationWomenTopsJackets).click();

        Assert.assertEquals(driver.findElement(jacketsTitle).getText(), "Jackets");
        Assert.assertEquals(driver.findElement(subMenuHome).getText(), "Home");
        Assert.assertEquals(driver.findElement(subMenuWomen).getText(), "Women");
        Assert.assertEquals(driver.findElement(subMenuTops).getText(), "Tops");
        Assert.assertEquals(driver.findElement(subMenuJackets).getText(), "Jackets");

        return this;
    }
}