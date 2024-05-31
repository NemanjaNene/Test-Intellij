package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test1 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.get("https://kompresoring.com/");
        driver.findElement(By.xpath("//*[@id=\"menu-1-984d077\"]/li[7]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("form-field-name")).sendKeys("Aleksandra Nikitovic");
        driver.findElement(By.id("form-field-field_b773a64")).sendKeys("Xx6164656xX");
        driver.findElement(By.name("form_fields[email]")).sendKeys("Alexandra.1@gmail.com");
        driver.findElement(By.id("form-field-message")).sendKeys("Testiranje funkcionalnosti sajta");

        driver.findElement(By.className("elementor-button-text")).click();

        System.out.println(driver.findElement(By.cssSelector(".elementor-message.elementor-message-danger")).getText());

        driver.navigate().back();
        driver.findElement(By.cssSelector("a#sm-17171383827798123-1")).click();
        Thread.sleep(2000);

        //driver.findElement(By.xpath("//*[@id=\"menu-1-e0a840b\"]/li[2]/a")).click();
        //Thread.sleep(2000);









    }
}
