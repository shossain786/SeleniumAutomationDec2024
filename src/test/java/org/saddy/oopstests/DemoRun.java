package org.saddy.oopstests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.saddy.oops.BankInterface;

public class DemoRun {
    public static void main(String[] args) {
        BankInterface demoBank = new DemoBank();
        demoBank.deposit(12000, 24234235235L);

        BankInterface demoBank1 = new DemoBank1();

        demoBank1.deposit(2222, 2342342342L);

        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new FirefoxDriver();

    }
}
