import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        1- Amazon sayfasina gidiniz
        2- Basligin "Amazon" icerdigini test ediniz
        3-Url'nin amazon icerdigini test ediniz
        4-Sayfayi kapatiniz
         */

//        1- Amazon sayfasina gidiniz
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
//        2- Basligin "Amazon" icerdigini test ediniz
        String actualTitile=driver.getTitle();
        String istenenKelime = "Amazon";
        if (actualTitile.contains(istenenKelime)){
            System.out.println("title testi PASSED");
        }else System.out.println("title testi FAILED");
//        3-Url'nin amazon icerdigini test ediniz
        String actualUrl = driver.getCurrentUrl();
        String istenenUrl="amazon";
        if (actualUrl.contains(istenenUrl)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi failed");
//        4-Sayfayi kapatiniz
        driver.close();


    }
}
