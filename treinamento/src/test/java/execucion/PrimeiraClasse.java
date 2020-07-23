package execucion;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {

    @Test
    public void primeiroTeste() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/java/browser/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();
        Assert.assertEquals("Selenium" ,driver.findElement(By.xpath("//*[@id=\"wp-tabs-container\"]/div[1]/div[3]/div/div/div/div[2]/h2/span")).getText());



        driver.quit();



    }


}
