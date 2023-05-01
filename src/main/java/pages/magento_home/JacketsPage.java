package pages.magento_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JacketsPage extends BasePage {
    public JacketsPage(WebDriver driver) {
        super(driver);
    }

    private final By items = By.xpath("//li[@class='item product product-item']");

    public JacketsPage checkFilter() {
        driver.findElement(By.xpath("//div[contains(text(),'Style')]")).click();
        String valueOfItems = driver.findElement(By.xpath("//a[contains(text(),'Windbreaker')]/span[contains(text(),'4')]")).getText();
        Matcher matcher = Pattern.compile("\\d+").matcher(valueOfItems);
        matcher.find();
        int i = Integer.valueOf(matcher.group());
        driver.findElement(By.xpath("//div[contains(text(),'Style')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Windbreaker')]/span[contains(text(),'4')]")).click();
        int countOfWindbreaker = driver.findElements(items).size();
        String s = String.valueOf(countOfWindbreaker);

        Assert.assertEquals(s, "4");
        return this;
    }
}