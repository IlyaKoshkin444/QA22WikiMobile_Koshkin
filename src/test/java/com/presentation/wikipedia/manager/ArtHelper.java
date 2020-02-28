package com.presentation.wikipedia.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ArtHelper extends  HelperBase{

    public ArtHelper(AppiumDriver driver) {
        super(driver);
    }

    public void initSkip(){ tap(By.id("fragment_onboarding_skip_button"));}

    public void initSearchArticle() {
        tap(By.id("search_container"));
    }

    public void typeRequest(String text) {
        type(By.id("search_src_text"), text);
    }


    public boolean isThereResult() {
        return isElementPresent(By.id("page_list_item_container"));
    }
}