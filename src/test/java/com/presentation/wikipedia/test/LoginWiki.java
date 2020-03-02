package com.presentation.wikipedia.test;

import org.testng.annotations.Test;

public class LoginWiki extends TestBase {
    @Test
    public void testLoginWiki() throws InterruptedException {
        app.getArticle().initSkip();
        app.getArticle().pause(3000);
        app.getArticle().initLoginButton();
        app.getArticle().pause(3000);
        app.getArticle().fillLoginForm("Eliyahu.Kosh", "wiki23081967");
        app.getArticle().pause(3000);
        app.getArticle().initConfirmLoginButton();
        app.getArticle().pause(3000);
    }
}
