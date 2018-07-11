package com.qa.ShoppingSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchItem {
	
	@FindBy(id = "search_query_top")
	private WebElement SearchBox;
	
	@FindBy(name = "submit_search")
	private WebElement EnterSearch;
	
	
	public void SearchBut (String Search) {

		SearchBox.sendKeys(Search);
		EnterSearch.click();
	
}
}
