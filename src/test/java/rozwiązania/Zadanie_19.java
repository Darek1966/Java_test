package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadanie_19 {
    public WebDriver getDriver(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void checkDisplayedTextInFrame() throws InterruptedException {
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement checkText = driver.findElement(By.id("movie-text"));
        System.out.println("Czy element jest wyświetlany: " + checkText.isDisplayed());
        driver.quit();
    }
}
