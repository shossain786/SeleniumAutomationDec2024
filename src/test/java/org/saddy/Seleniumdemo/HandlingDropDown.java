package org.saddy.Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HandlingDropDown {
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

        WebElement automationType = driver.findElement(By.xpath("//select[@id='automationType']"));

        Select select = new Select(automationType);
        System.out.println("By Default Selected Value: " + select.getFirstSelectedOption().getText());
//        select.selectByIndex(2);
//        select.selectByValue("Regression");
        select.selectByVisibleText("Performance Testing");
//        select.selectByContainsVisibleText("ance Tes");

        System.out.println("Data Selected: " + select.getFirstSelectedOption().getText());

        List<WebElement> dropdownValue = select.getOptions();

        for (WebElement element : dropdownValue) {
            System.out.println(element.getText());
        }

        sleeptime(2);
        driver.quit();
    }

    static void sleeptime(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
