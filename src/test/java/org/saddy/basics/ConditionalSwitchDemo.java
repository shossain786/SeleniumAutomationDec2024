package org.saddy.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class ConditionalSwitchDemo {
    static WebDriver driver;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a browser name: ");
        String browser = scanner.next();
        launchBrowser(browser);
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.close();
    }

    static void launchBrowser(String browserName) {
        switch (browserName) {
            case "chrome":
                System.out.println("inside chrome");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.out.println("inside firefox");
//                driver = new FirefoxDriver();
                break;
            case "edge":
                System.out.println("inside edge");
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Browser name not matching. Please retry.");
        }
    }
}
