package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class BookingPage extends BaseTest {

    Logger logger = LogManager.getLogger(HomePage.class);
    @Step("Tek yön seçilir")
    public void oneWay(){
        appiumDriver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc='One-way']")).click();
        logger.info("Tek yon secildi");
    }
    @Step("Kalkış yeri <from> seçilir")
    public void fromAirport(String from){
        appiumDriver.findElement(By.id("com.m.qr:id/rvmp_fragment_rtow_flight_selection_destination_airport_name_text_view")).click();
        try {
            Thread.sleep(2 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.findElement(By.id("com.m.qr:id/rvmp_fragment_ond_selection_filter_edittext")).sendKeys(from);
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout")).click();
        logger.info("Kalkis yeri Berlin secildi");
    }

    @Step("Varış yeri <to> seçilir")
    public void toAirport(String to){
        appiumDriver.findElement(By.id("com.m.qr:id/rvmp_fragment_rtow_flight_selection_destination_select_destination_text_view")).click();
        try {
            Thread.sleep(2 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.findElement(By.id("com.m.qr:id/rvmp_fragment_ond_selection_filter_edittext")).sendKeys(to);
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout")).click();
        logger.info("Varis yeri Istanbul secildi");
    }

    @Step("Gün seçilir")
    public void selectDate(){
        try {
            Thread.sleep(2 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.findElement(By.id("com.m.qr:id/rvmp_fragment_rtow_flight_selection_date_holder_date_text_view")).click();
        /*try {
            Thread.sleep(2 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }


        appiumDriver.findElement(By.xpath("//*[@text='2' and @clickable='true']")).click();


         */
        //MobileElement element = appiumDriver.findElement(By.id("com.m.qr:id/drawer_root"));
        Actions action = new Actions(appiumDriver);

        for(int i = 0; i<9; i++){
            action.sendKeys(Keys.TAB).perform();
        }
        action.sendKeys(Keys.ENTER).perform();
        appiumDriver.findElement(By.id("com.m.qr:id/fragment_calendar_confirm_button")).click();
        logger.info("Gun secildi");
    }

    @Step("Uçuş aranır")
    public void searchFlight(){
        appiumDriver.findElement(By.id("com.m.qr:id/rvmp_booking_search_flights_button")).click();
        logger.info("Ucus arandi");
    }

}


