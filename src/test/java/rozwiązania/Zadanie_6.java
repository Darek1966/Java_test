package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie_6 {

    public WebDriver getDriver() {

        // Ad 1 Otwórz i zmaksymalizuj przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ad 2 Przejdź do strony https://programautomatycy.pl/test-page/
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void findElementByXpath() {

        // Ad 1 & 2
        WebDriver driver = getDriver();

        // Ad 3 Zlokalizuj radio button liczby 3 w sekcji “Wybierz liczbę” na formularzu testowym 2,
        // przy użyciu xPath dowolnym sposobem i przypisz do zmiennej number3.
        WebElement number3 = driver.findElement(By.xpath("//span[@id='number-radio']")).findElement(By.xpath("//*[@value='3']"));

        // Ad 4 Zlokalizuj opcję wyboru koloru zielonego w sekcji “Wybierz kolor ” na formularzu testowym 2,
        // przy użyciu xPath dowolnym sposobem i przypisz do zmiennej greenColour.
        WebElement greenColour = driver.findElement(By.xpath("//select[@id='colour-select-multiple']")).findElement(By.xpath("//*[@value='Zielony']"));

        // Ad 5 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
