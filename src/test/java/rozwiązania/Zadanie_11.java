package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie_11 {

    public WebDriver getDriver() {

        // Ad 1 Otwórz i zmaksymalizuj przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ad 2 Przejdź do strony https://programautomatycy.pl/test-page/
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void getText() {

        // Ad 1 & 2
        WebDriver driver = getDriver();

        // Ad 3 Zlokalizuj opcję o wartości “Pies” w sekcji “Wybierz zwierzę” na formularzu testowym 2, dowolnym sposobem
        WebElement dog = driver.findElement(By.id("animal-select")).findElement(By.xpath("//option[@value='Pies']"));

        // Ad 4 Pobierz i wydrukuj z wyszukanego elementu tekst “Pies”
        System.out.println(dog.getText());

        // Ad 5 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
