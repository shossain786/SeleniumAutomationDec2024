package org.saddy.Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HandleModalWindow {
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

        driver.findElement(By.xpath("//button[.='Open Modal']")).click();
        String title = driver.findElement(By.xpath("//h2[.='Modal Window']")).getText();
        System.out.println("Title of the Modal Window: " + title);

        driver.findElement(By.id("modalInputText")).sendKeys("Testing Modal window");
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='modalCheckbox']"));

        System.out.println("By Default Status of the check box: " + checkBox.isSelected());

        checkBox.click();
        System.out.println("Post clicking Status of the check box: " + checkBox.isSelected());


        Select skillDropDown = new Select(driver.findElement(By.xpath("//select[@id='modalSelect']")));
        skillDropDown.selectByVisibleText("Selenium");

        sleeptime(3);

        driver.findElement(By.xpath("//span[.='×']")).click();
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
