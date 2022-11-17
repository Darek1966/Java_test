package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie_10 {

    public WebDriver getDriver() {

        // Ad 1 Otwórz i zmaksymalizuj przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ad 2 Przejdź do strony https://programautomatycy.pl/courses
        driver.navigate().to("https://programautomatycy.pl/courses");
        return driver;
    }

    @Test
    public void getPageTitle() {

        // Ad 1 & 2
        WebDriver driver = getDriver();

        // Ad 3 Pobierz i wyświetl tytuł strony / tytuł karty
        System.out.println(driver.getTitle());

        // Ad 4 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
