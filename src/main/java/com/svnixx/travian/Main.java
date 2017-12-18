/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.svnixx.travian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 *
 * @author joseramon.gago
 */
public class Main {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver.exe");
        System.setProperty("phantomjs.binary.path", "src/main/java/resources/phantomjs.exe");
        WebDriver driver = new PhantomJSDriver();
        //WebDriver driver = new ChromeDriver();
        
        driver.get("https://ts19.travian.net");

        WebElement userInput = driver.findElement(By.name("name"));
        WebElement passInput = driver.findElement(By.name("password"));
        
        userInput.sendKeys("saltimbanqui");
        passInput.sendKeys("pupas123");
        
        driver.findElement(By.name("s1")).click();
        System.out.println(driver.getPageSource());
    }
}
