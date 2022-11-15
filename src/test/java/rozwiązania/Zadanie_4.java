package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie_4 {

    public WebDriver getDriver() {

        // Ad 1 Otwórz i zmaksymalizuj przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ad 2 Przejdź do strony https://programautomatycy.pl
        driver.navigate().to("https://programautomatycy.pl");
        return driver;
    }

    @Test
    public void findElementByTagName() {

        // Ad 1 & 2
        WebDriver driver = getDriver();

        // Ad 3 Zlokalizuj stopkę, która znajduje się na dole strony za pomocą nazwy tagu i przypisz do zmiennej footer
        WebElement footer = driver.findElement(By.tagName("footer"));

        // Ad 4 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
