package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class TekrarTesti {
    /*
       1. Bir class oluşturun : AmazonSearchTest
       2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
       a. web sayfasına gidin. https://www. amazon.com/
       b. Search(ara) “city bike”
       c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
       e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        a. web sayfasına gidin. https://www. amazon.com/
        driver.get("https://amazon.com");
//        b. Search(ara) “city bike”
        WebElement cityBike = driver.findElement(By.id("twotabsearchtextbox"));
        cityBike.sendKeys("city bike"+ Keys.ENTER );
//        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> goruntulemeSayisi = driver.findElements(By.className("sg-col-inner"));
        String sonuc = goruntulemeSayisi.get(0).getText();
        System.out.println(sonuc);
//        d. Sadece sonuctaki rakami getiriniz?
        String[] sonucRakamiSadece = sonuc.split(" ");
        System.out.println("City bike arama sonucu :"+sonucRakamiSadece[2]);

//       e. sadece sonuctaki rakami lambda ile getir?
        Arrays.stream(sonuc.split(" ")).limit(3).skip(2).forEach(System.out::println);

//        e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın

        List<WebElement> ilkResimTikla = driver.findElements(By.className("s-image"));
        WebElement sonucResim = ilkResimTikla.get(0);
        sonucResim.click();
        //f. sayfayi kapat

        driver.close();

    }
}
