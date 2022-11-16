package rozwiązania;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie_8 {

    public WebDriver getDriver() {

        // Ad 1 Otwórz i zmaksymalizuj przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ad 2 Przejdź do strony https://programautomatycy.pl/test-page/
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void enterTextIntoTheElement() {

        // Ad 1 & 2
        WebDriver driver = getDriver();

        // Ad 3 Zlokalizuj pole tekstowe “Tytuł książki” na formularzu testowym 2
        // przy użyciu identyfikatora (id) i przypisz do zmiennej bookTitle
        WebElement bookTitle = driver.findElement(By.id("book-text"));

        // Ad 4 Wyślij tekst do zlokalizowanego pola tekstowego w postaci dowolnego tytułu książki
        bookTitle.sendKeys("Wiedźmin");

        // Ad 5 Zlokalizuj pole tekstowe “Tytuł filmu” na formularzu testowym 2
        // przy użyciu nazwy elementu (name) i przypisz do zmiennej movieTitle
        WebElement movieTitle = driver.findElement(By.name("your-movie"));

        // Ad 6 Wyślij tekst do zlokalizowanego pola tekstowego w postaci dowolnej nazwy filmu
        movieTitle.sendKeys("Nietykalni");

        // Ad 7 Zweryfikuj na stronie, czy poprawnie został wysłany tekst do pól tekstowych
    }
}
