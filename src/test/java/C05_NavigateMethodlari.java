import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");

        //driver.navigate().to() methodu sayfada ileri geri yapilacaksak kullanilir
        //driver.get() methodu gibi bizi istedigimiz Url'e goturur
        driver.navigate().to("https://techproeducation.com");
        //Tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();
        // Tekrar techpro sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
        //Techproed sayfasina yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        // Son olarak sayfayi kapatiniz
        driver.close();

    }
}
