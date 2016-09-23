package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_link_page {
	
	//Search field id
		@FindBy(xpath=".//*[@id='query']")
		private WebElement Search;
		public WebElement getsearch() {
			return Search;
		}
		
	
	//Search enter button
		@FindBy(xpath=".//*[@id='search']")
		private WebElement Search_enter;
		public WebElement getSearch_enter() {
			return Search_enter;
		}
		

	//Results page message heading table
		@FindBy(xpath=".//*[@id='kb-nav--main']/div[1]/h1")
		private WebElement result_message;
		public WebElement getresult_message() {
			return result_message;
		}
		
	//First result in the search result table
		@FindBy(xpath=".//*[@id='results-list']/li[1]")
		private WebElement first_result;
		public WebElement getfirst_result() {
			return first_result;
		}
	
	//Error message int he searvch table
			@FindBy(xpath=".//*[@id='no-results-message']/h2")
			private WebElement error_search;
			public WebElement geterror_search() {
				return error_search;
			}
		
}
