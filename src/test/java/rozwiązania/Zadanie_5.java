package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie_5 {

    public WebDriver getDriver() {

        // Ad 1 Otwórz i zmaksymalizuj przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ad 2 Przejdź do strony https://programautomatycy.pl/test-page/
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void findElementByCssSelector() {

        // Ad 1 & 2
        WebDriver driver = getDriver();

        // Ad 3 Zlokalizuj pole wyboru w sekcji “Wybierz kolor” na formularzu testowym 2,
        // przy użyciu CSS selektora za pomocą pełnej nazwy atrybutu klasy i przypisz do zmiennej coloursFullClassName.
        WebElement coloursFullClassName = driver.findElement(By.cssSelector("select[class='wpcf7-form-control wpcf7-select colour']"));

        // Ad 4 Zlokalizuj pole wyboru w sekcji “Wybierz kolor” na formularzu testowym 2,
        // przy użyciu CSS selektora za pomocą nazwy klasy i przypisz do zmiennej coloursClassName.
        WebElement coloursClassName = driver.findElement(By.cssSelector(".colour"));

        // Ad 5 Zlokalizuj pole wyboru w sekcji “Wybierz kolor” na formularzu testowym 2,
        // przy użyciu CSS selektora za pomocą id i przypisz do zmiennej coloursId
        WebElement coloursId = driver.findElement(By.cssSelector("#colour-select-multiple"));

        // Ad 6 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
