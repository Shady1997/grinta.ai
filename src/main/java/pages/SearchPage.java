package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "search_input")
	public WebElement searchField;

	public void searchForProduct() {
		searchField.sendKeys("مستحضرات طبية حديثة");// fill search field data
		searchField.sendKeys(Keys.ENTER);// click enter to start searching
	}

}
