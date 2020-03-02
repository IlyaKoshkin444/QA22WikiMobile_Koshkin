package com.presentation.wikipedia.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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


    public boolean isThereResult(int timeout) {
        wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']")));

    return isElementPresent(By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']"));
    }

    public void initLoginButton() { tap(By.id("view_announcement_action_positive"));
    }
    public void fillLoginForm(String user, String password) throws InterruptedException {
        type(By.xpath("//*[@resource-id='org.wikipedia:id/login_username_text']//['android.widget.FrameLayout']//['android.widget.EditText']"), user);
        pause(3000);
        type(By.xpath("//*[@resource-id='org.wikipedia:id/login_password_input']//['android.widget.FrameLayout']//['android.widget.EditText']"), password);
        pause(3000);
    }

    public void initConfirmLoginButton() {
        tap(By.id("login_button"));
    }

    public void swipeArticlesUp() {
        driver.hideKeyboard();
        swipeUp();
    }


    public void initChoiceArticle() throws InterruptedException {
        tap(By.xpath("//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.ListView//android.view.ViewGroup[1]"));
        pause(3000);
        tap(By.id("article_menu_bookmark"));
        tap(By.id("onboarding_button"));
        tap(By.id("item_image_4"));
        tap(By.id("snackbar_action"));
    }
}