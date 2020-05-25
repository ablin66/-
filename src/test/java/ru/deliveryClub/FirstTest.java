package ru.deliveryClub;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32111\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.delivery-club.ru/ekb");
    }
}
