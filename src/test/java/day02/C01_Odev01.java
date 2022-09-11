package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Amazon sayfasina gidelim
        driver.get("https://amazon.com");
        //sayfa basligi(title) yazdirin
        System.out.println("driver.getTitle() = " + driver.getTitle());
        //sayfa basliginin "Amazon" icerdigini test edin
        String actualResult = driver.getTitle();
        String beklenenSonuc= "Amazon";
        if (actualResult.contains(beklenenSonuc)){
            System.out.println("test PASSED");
        }else System.out.println("test FAILED");
        //sayfa adresini(url) yazdirin
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        //sayfa url'nin "amazon icerdigini test edin.
        String actualResult01 = driver.getCurrentUrl();
        String istenenKelime = "amazon";
        if (actualResult01.contains(istenenKelime)){
            System.out.println("test PASSED");
        }else System.out.println("Test FAILED");
        //sayfa handle degerlerini yaziniz
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        //sayfa HTML kodlarinda "Gateway kelimesini gectigini test edin
//        String beklenenSonuc01 = driver.getPageSource();
//        String istenenKelime01 = "Gateway";
//        if (beklenenSonuc01.contains(istenenKelime01)){
//            System.out.println("Test PASSED");
//        }else System.out.println("Test Failed");
        //Sayfayi kapatin
        driver.close();


    }
}
