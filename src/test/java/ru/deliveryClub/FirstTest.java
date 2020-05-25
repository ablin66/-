package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver83.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.delivery-club.ru/ekb");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Доставка еды из ресторанов Екатеринбурга от 45 минут! Delivery Club"));

        driver.quit();
    }
}
