package com.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.naming.ldap.LdapReferralException;
import java.util.ArrayList;
import java.util.Set;

public class Learning {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        WebElement e1= driver.findElement(By.xpath("//a[text()='Admin Page']"));
        e1.click();
        Thread.sleep(5000);
        WebElement e2 = driver.findElement(By.id("accessMode1"));
        e2.click();
        System.out.println(e2.isSelected());

    }
}
