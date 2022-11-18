package rozwiązania;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Zadanie_18 {

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

        // Ad 4 Sprawdź, czy zlokalizowany element istnieje na stronie za pomocą asercji
        Assert.assertTrue(textField.size() > 0);

        // Ad 5 Zlokalizuj cały element wielokrotnego wyboru w sekcji “Wybierz kolor” na formularzu testowym 2, przy użyciu klasy Select
        Select colourSelect = new Select(driver.findElement(By.xpath("//*[@id='colour-select-multiple']")));

        // Ad 6 Zaznacz opcję “Czarny” za pomocą wartości elementu (value)
        colourSelect.selectByValue("Czarny");

        // Ad 7 Sprawdź za pomocą asercji, czy element został zaznaczony
        Assert.assertEquals("Czarny", colourSelect.getFirstSelectedOption().getText());

        // Ad 8 Zlokalizuj radio button liczby 3 w sekcji “Wybierz liczbę” na formularzu testowym 2, dowolnym sposobem.
        WebElement number3 = driver.findElement(By.xpath("//span[@id='number-radio']")).findElement(By.xpath("//*[@value='3']"));

        // Ad 9 Kliknij na zlokalizowany element
        number3.click();

        // Ad 10 Sprawdź za pomocą asercji, czy element został zaznaczony
        Assert.assertTrue(number3.isSelected());

        // Ad 11 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
