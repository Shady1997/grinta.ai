package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.PageBase;
import pages.SearchPage;

public class Testcase001_SearchingProducts extends TestBase {

	@Test(priority = 2, groups = "smoke", description = "Search for product")
	private void SearchProducts() throws InterruptedException {
		SearchPage searchPage = new SearchPage(driver);
		// fill search data and start search
		searchPage.searchForProduct();
		// take screenshot to login page
		PageBase.captureScreenshot(driver, "SearchResult");
		// verify Result successfully
		Assert.assertEquals(driver.getPageSource().contains("نتائج البحث"), true);
	}

}
