package com.presentation.wikipedia;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class OpenWikiTest {


        AppiumDriver driver;

        @BeforeClass

        public void setUp () throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("platformName","Android"  );
            capabilities.setCapability("deviceName","emul1"  );
            capabilities.setCapability("platformVersion","8.0"  );
            capabilities.setCapability("automationName","Appium"  );
            capabilities.setCapability("appPackage","org.wikipedia"  );
            capabilities.setCapability("appActivity",".main.MainActivity"  );
            capabilities.setCapability("app","/Users/macbookpro/Documents/GitHub/QA22WikiMobile_Koshkin/src/test/resources/Wikipedia.2.7.50278.apk"  );

            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        }

        @Test

        public void testOpenApp(){

            System.out.println("APPLICATION WIKI OPENED");
        }

        @AfterClass

        public void tearDown() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }
    }



