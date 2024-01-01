package demoqa.pages;

import static utils.Keywords.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import demoqa.iterfaces.IValidateLinks;

public class ElementsPage implements IValidateLinks{
	private String URL = "https://demoqa.com/";
	private String ElementsURL = "https://demoqa.com/elements";

	public ElementsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Elements']")
	public WebElement elements;

	@FindBy(xpath = "//div[text()='Forms']")
	public WebElement forms;

	@FindBy(xpath = "//div[text()='Alerts, Frame & Windows']")
	public WebElement alerts;

	@FindBy(xpath = "//div[text()='Widgets']")
	public WebElement widgets;

	@FindBy(xpath = "//div[text()='Interactions']")
	public WebElement interactions;

	@FindBy(xpath = "//div[text()='Book Store Application']")
	public WebElement books;

	@Override
	public void openPage() {
		goTo(URL);
		goTo(ElementsURL);
	}

	@Override
	public void validatePageLinks() {
		isElementVisible(
				new ArrayList<WebElement>(Arrays.asList(elements, forms, alerts, widgets, interactions, books)));
	}

}
