package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class HomePage extends BaseTest {

    Logger logger = LogManager.getLogger(HomePage.class);
    @Step("<x> saniye kadar bekle")
    public void waitForSecods(int x) throws InterruptedException {
        Thread.sleep(1000*x);
    }

    @Step("skip yap")
    public void skip(){
        appiumDriver.findElement(By.xpath("//*[@text='Skip']")).click();
        try {
            Thread.sleep(1 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.findElement(By.xpath("//*[@text='Skip']")).click();
        try {
            Thread.sleep(2 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MobileElement element = appiumDriver.findElement(By.id("com.m.qr:id/push_consent_decline"));
        if(element.isDisplayed()){
            logger.info("Ana sayfa acildi");
            element.click();
        }
        else {
            logger.info("Ana sayfa acilmadi");
        }
    }

    @Step("Book'a tıkla")
    public void clickBook(){
        appiumDriver.findElement(By.xpath("//*[@text='Book']")).click();
        logger.info("Book tiklandi");
    }



}
