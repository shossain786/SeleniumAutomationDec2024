package org.saddy.Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://edu.itinstruct.com");

        //login to app
//        By by = By.id("username");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("submit")).click();

//        verify that login successful
        String text = driver.findElement(By.xpath("//b[.='Input Form']")).getText();
        System.out.println("Data fetched from home page: " + text);

//        String lbl = driver.findElement(By.className("field_lbl")).getText();

        WebElement ele =  driver.findElement(By.className("field_lbl"));
        String lbl = ele.getText();
        ele.isDisplayed();
        ele.isEnabled();

        List<WebElement> elements = driver.findElements(By.className("field_lbl"));

        for (WebElement element : elements) {
            System.out.println(element.getText());
        }


        driver.quit();

    }


    public void displayNumbes(){
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
