package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadanie_15 {

    public WebDriver getDriver() {

        // Ad 1 Otwórz i zmaksymalizuj przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ad 2 Przejdź do strony https://programautomatycy.pl/test-page/
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void elementExists() {

        // Ad 1 & 2
        WebDriver driver = getDriver();

        // Ad 3 Zlokalizuj pole tekstowe w sekcji “Jakiś tekst” na formularzu testowym 2, dowolnym sposobem.
        List<WebElement> textField = driver.findElements(By.cssSelector("#text-text"));

        // Ad 4 Sprawdź, czy zlokalizowany element istnieje na stronie
        if (textField.size() > 0) {
            System.out.println("Pole tekstowe istnieje");
        } else {
            System.out.println("Pole tekstowe nie istnieje");
        }

        // Ad 5 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
