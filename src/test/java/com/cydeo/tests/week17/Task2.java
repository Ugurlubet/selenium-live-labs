package com.cydeo.tests.week17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        /*
        * TC002 As a user I should be able to see the password hidden as default

     1- Open  a  chrome  browser
     2- Go to "https://vytrack.com/"
     3- Click LOGIN button
     4- Verify the  password is hidden*/


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vytrack.com");
        driver.findElement(By.cssSelector("#top-menu #menu-item-849")).click();
        String actual=driver.findElement(By.id("prependedInput2")).getDomAttribute("type");

        if (actual.equals("password")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.quit();










    }
}
