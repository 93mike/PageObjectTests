package tests.searchWomenClothes;

import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.Constant.Urls.*;

public class SearchWomenClothesTests extends BaseTest {
    @Test
    public  void checkTitleOfsSearchWomenClothes() throws InterruptedException {
        basePage.open(HOME_PAGE);
        magentoHomePage.selectJacketsFromNavMenu();
    }

    @Test
    public void checkSortMethods(){
        basePage.open(WOMEN_JACKETS_PAGE);
        jacketsPage.checkFilter();
    }
}