import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Amazon sayfasina gidiniz

        driver.get("https://amazon.com");

        // Kaynak kodlarin icinde "Gateway" kelimesinin oldugunu test ediniz
       // System.out.println("driver.getPageSource() = " + driver.getPageSource()); // Sayfadaki kaynak kodlarini gosterir
        String istenenKelime= "Gateway";
        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("pageSource test PASSED");
        }else System.out.println("pageSource test FAILED");

        driver.close(); //Sayfayi kapatir
        //driver.guit();  // birden fazla sayfa varsa hepsini kapatir


    }
}
