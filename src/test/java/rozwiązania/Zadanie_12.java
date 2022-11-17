package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie_12 {

    public WebDriver getDriver() {

        // Ad 1 Otwórz i zmaksymalizuj przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ad 2 Przejdź do strony https://programautomatycy.pl/test-page/
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void elementIsEnabled() {

        // Ad 1 & 2
        WebDriver driver = getDriver();

        // Ad 3 Zlokalizuj pole tekstowe “Tytuł książki” na formularzu testowym 2, dowolnym sposobem
        WebElement bookTitle = driver.findElement(By.id("book-text"));

        // Ad 4 Sprawdź, czy wyszukane pole jest edytowalne
        System.out.println(bookTitle.isEnabled());

        // Ad 5 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
