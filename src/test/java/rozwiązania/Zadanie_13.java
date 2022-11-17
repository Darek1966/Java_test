package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie_13 {

    public WebDriver getDriver() {

        // Ad 1 Otwórz i zmaksymalizuj przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ad 2 Przejdź do strony https://programautomatycy.pl/test-page/
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void elementIsDisplayed() {

        // Ad 1 & 2
        WebDriver driver = getDriver();

        // Ad 3 Zlokalizuj pole tekstowe “Tytuł filmu” na formularzu testowym 2, dowolnym sposobem
        WebElement movieTitle = driver.findElement(By.id("movie-text"));

        // Ad 4 Sprawdź, czy wyszukane pole jest wyświetlone
        System.out.println(movieTitle.isDisplayed());

        // Ad 5 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
