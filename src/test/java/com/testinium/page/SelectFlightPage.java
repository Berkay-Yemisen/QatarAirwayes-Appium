package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class SelectFlightPage extends BaseTest {

    Logger logger = LogManager.getLogger(SelectFlightPage.class);
    @Step("Rastgele uçuş  seçilir")
    public void selectFlight(){
        List<MobileElement> randomElement = appiumDriver.findElements(By.xpath("//*[@class='android.view.ViewGroup' and @resource-id='com.m.qr:id/rvmp_item_search_result_root_view']"));
        randomElement.get(new Random().nextInt(randomElement.size())).click();
        logger.info("Rastgele ucus secildi");
        System.out.println(randomElement);
    }

    @Step("Ekomomi Sınıfı seçilir")
    public void economyClass(){
        appiumDriver.findElement(By.id("com.m.qr:id/rvmp_activity_flight_details_select_button")).click();
        logger.info("Ekonomi sinifi secildi");
    }
}
