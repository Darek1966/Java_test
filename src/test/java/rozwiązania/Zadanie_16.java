package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadanie_16 {

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
        Select dayDropBoxByXpath = new Select(driver.findElement(By.xpath("//*[@id='colour-select-multiple']")));

        // Ad 4 Zaznacz opcję “Czarny” za pomocą wartości elementu (value)
        dayDropBoxByXpath.selectByValue("Czarny");

        // Ad 5 Sprawdź czy element został zaznaczony
        System.out.println(dayDropBoxByXpath.getFirstSelectedOption().getText());

        // Ad 6 Zamknij przeglądarkę oraz sesję
        driver.quit();
    }
}
