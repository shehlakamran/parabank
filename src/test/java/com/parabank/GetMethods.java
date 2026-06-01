package com.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        WebElement username = driver.findElement(By.cssSelector("input.input[name='username']"));
        username.click();
        username.sendKeys("shehla");
        WebElement password = driver.findElement(By.cssSelector("input.input[name='password']"));
        password.click();
        password.sendKeys("sarah456Khan@$");
        String title = driver.getTitle();
        System.out.println(title);
    }
}
