package org.saddy.Seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AlertHandling {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://edu.itinstruct.com");

        //login to app
//        By by = By.id("username");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.xpath("//button")).click();
        sleeptime(3);

//        driver.findElement(By.xpath("//button[.='Simple Alert']")).click();
//
//        sleeptime(2);
////        driver.switchTo().alert().accept();
//
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//        prompt alert


//        driver.findElement(By.xpath("//button[.='Confirm Alert']")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.dismiss();

        driver.findElement(By.xpath("//button[.='Prompt Alert']")).click();
        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
        alert.sendKeys("Test Alert");
        sleeptime(3);
        alert.accept();

        sleeptime(3);
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
