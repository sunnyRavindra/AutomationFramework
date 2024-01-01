package demoqa.pages;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoqa.iterfaces.IValidateLinks;

public class HomePage implements IValidateLinks{

	private String URL = "https://demoqa.com/";

	public HomePage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//*[text()='Elements']")
	public WebElement elements;

	@FindBy(xpath = "//*[text()='Forms']")
	public WebElement forms;

	@FindBy(xpath = "//*[text()='Alerts, Frame & Windows']")
	public WebElement alerts;

	@FindBy(xpath = "//*[text()='Widgets']")
	public WebElement widgets;

	@FindBy(xpath = "//*[text()='Interactions']")
	public WebElement interactions;

	@FindBy(xpath = "//*[text()='Book Store Application']")
	public WebElement books;

	@Override
	public void openPage() {
		goTo(URL);
	}

	@Override
	public void validatePageLinks() {
		isElementVisible( new ArrayList<WebElement>(Arrays.asList(elements,forms,alerts,widgets,interactions,books)) );
	}


}
