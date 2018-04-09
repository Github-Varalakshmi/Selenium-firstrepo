package com.paragaon.netapp.dicoverModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QtreeKeymissing {

	public static void QtreeOwnerKeyMissing(WebDriver driver) throws InterruptedException {

        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='discoverDropdown']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[text()='QTrees Owner (Key Missing) (temp)']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

}
