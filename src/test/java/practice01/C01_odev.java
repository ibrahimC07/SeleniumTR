package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_odev {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//      1-  Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.manage().window().maximize();
        driver.get("https://youtube.com");
//      2-  Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//      3-  Tekrar YouTube’sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();
//      4-  Yeniden Amazon sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
//      5-  Sayfayi Refresh(yenile) yapalim
        Thread.sleep(2000);
        driver.navigate().refresh();
//      6-  Sayfayi kapatalim / Tum sayfalari kapatalim
        Thread.sleep(2000);
        driver.close();

    }
}
