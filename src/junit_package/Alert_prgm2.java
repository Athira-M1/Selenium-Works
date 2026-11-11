package junit_package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_prgm2 {

ChromeDriver driver;

@BeforeEach
public void setup()
{
    driver = new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Alerts.html");
    driver.manage().window().maximize();
}

@Test
public void alert_method1() throws Exception
{
	
    WebElement alert1 = driver.findElement(By.xpath("//*[@id='OKTab']/button"));
    alert1.click();

    Alert alrt1 = driver.switchTo().alert();
    String text1 = alrt1.getText();

    System.out.println("Alert Text : " + text1);

    Thread.sleep(2000);
    alrt1.accept();


	Thread.sleep(5000);
    WebElement alert2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
    alert2.click();

    Thread.sleep(2000);

    WebElement alertbox2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button"));
    alertbox2.click();

    Alert alrt2 = driver.switchTo().alert();
    String text2 = alrt2.getText();

    System.out.println("Alert Text : " + text2);

    Thread.sleep(2000);
    alrt2.dismiss();

	Thread.sleep(3000);
    WebElement alert3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
    alert3.click();

    WebElement alertbox3 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
    alertbox3.click();

    Alert alrt3 = driver.switchTo().alert();
    String text3 = alrt3.getText();

    System.out.println("Alert Text : " + text3);

    alrt3.sendKeys("abcd");

    Thread.sleep(3000);
    alrt3.accept();
}

@AfterEach
public void closing_method()
{
    driver.quit();
}

}


