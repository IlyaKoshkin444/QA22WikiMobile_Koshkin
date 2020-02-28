package com.presentation.wikipedia.test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchArtTest extends  TestBase {
    @Test
    public void testSearchArticle() throws InterruptedException {
        app.getArticle().initSkip();
        app.getArticle().pause(3000);
        app.getArticle().initSearchArticle();
        app.getArticle().pause(3000);
        app.getArticle().typeRequest("Selenium");
        app.getArticle().pause(3000);

        Assert.assertTrue(app.getArticle().isThereResult());

    }
}