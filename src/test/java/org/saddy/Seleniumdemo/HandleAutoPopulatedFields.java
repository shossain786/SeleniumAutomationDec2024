package org.saddy.Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleAutoPopulatedFields {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://edu.itinstruct.com");

        //login to app
//        By by = By.id("username");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.xpath("//button")).click();
        sleeptime(3);

        driver.findElement(By.xpath("//input[@id='autoPopulate']")).sendKeys("test");
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='suggestions']/div"));

        boolean flag = false;

        for (WebElement element : elements) {
            if (element.getText().equals("Regression Test")) {
                element.click();
                flag = true;
                break;
            }
        }

        sleeptime(3);
        if (flag)
            System.out.println("Test Passed!");
        else
            System.out.println("Test Failed!");
        driver.quit();

//
    }


    static void sleeptime(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
