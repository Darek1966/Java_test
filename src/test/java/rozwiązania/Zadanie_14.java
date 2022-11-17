package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie_14 {

    public WebDriver getDriver() {

        // Ad 1 Otwórz i zmaksymalizuj przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ad 2 Przejdź do strony https://programautomatycy.pl/test-page/
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void elementIsSelected() {

        // Ad 1 & 2
        WebDriver driver = getDriver();

        // Ad 3 Zlokalizuj radio button liczby 3 w sekcji “Wybierz liczbę” na formularzu testowym 2, dowolnym sposobem.
        WebElement number3 = driver.findElement(By.xpath("//span[@id='number-radio']")).findElement(By.xpath("//*[@value='3']"));

        // Ad 4 Kliknij na zlokalizowany element
        number3.click();

        // Ad 5 Sprawdź, czy kliknięty element jest zaznaczony
        System.out.println(number3.isSelected());

        // Ad 6 Zlokalizuj opcję wyboru koloru zielonego w sekcji “Wybierz kolor ” na formularzu testowym 2, dowolnym sposobem.
        WebElement greenColour = driver.findElement(By.xpath("//select[@id='colour-select-multiple']")).findElement(By.xpath("//*[@value='Zielony']"));

        // Ad 7 Kliknij na zlokalizowany element
        greenColour.click();

        // Ad 8 Sprawdź, czy kliknięty element jest zaznaczony
        System.out.println(greenColour.isSelected());

        // Ad 9 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
