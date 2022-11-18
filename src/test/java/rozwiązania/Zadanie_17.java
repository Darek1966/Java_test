package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Zadanie_17 {

    public WebDriver getDriver() {

        // Ad 1 Otwórz i zmaksymalizuj przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ad 2 Przejdź do strony https://programautomatycy.pl/test-page/
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void selectSingleOptionByValue() {

        // Ad 1 & 2
        WebDriver driver = getDriver();

        // Ad 3 Zlokalizuj cały element wielokrotnego wyboru w sekcji “Wybierz kolor” na formularzu testowym 2, przy użyciu klasy Select
        Select colourSelect = new Select(driver.findElement(By.xpath("//*[@id='colour-select-multiple']")));

        // Ad 4 Zaznacz opcję “Czarny” za pomocą wartości elementu (value)
        colourSelect.selectByValue("Czarny");

        // Ad 5 Zaznacz opcję “Zielony” za pomocą widocznego tekstu
        colourSelect.selectByVisibleText("Zielony");

        // Ad 6 Zaznacz opcję “Niebieski” za pomocą indeksu
        colourSelect.selectByIndex(1);

        // Ad 7 Sprawdź czy elementy zostały zaznaczone
        List<WebElement> colours = colourSelect.getAllSelectedOptions();
        for (WebElement colour : colours) {
            System.out.println(colour.getText());
        }

        // Ad 8 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
