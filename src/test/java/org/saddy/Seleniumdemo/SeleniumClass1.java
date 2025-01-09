package org.saddy.Seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass1 {
    public static void main(String[] args) {
        //Selenium 4.
        WebDriver driver = new ChromeDriver();  //launch a browser
        driver.manage().window().maximize(); //to maximize the window
        driver.get("https://yahoo.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
