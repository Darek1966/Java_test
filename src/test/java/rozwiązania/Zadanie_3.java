package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie_3 {

    public WebDriver getDriver() {

        // Ad 1 Otwórz i zmaksymalizuj przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ad 2 Przejdź do strony https://programautomatycy.pl/test-page/
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void findElementByClassName() {

        // Ad 1 & 2
        WebDriver driver = getDriver();

        // Ad 3 Zlokalizuj grupę przycisków w sekcji “wybierz liczbę” na formularzu testowym 2
        // przy użyciu nazwy klasy i przypisz do zmiennej numbersRadioButtons
        WebElement numbersRadioButtons = driver.findElement(By.className("number"));

        // Ad 4 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
