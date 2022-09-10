import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Ilkclass {
    public static void main(String[] args) {
        /*
        En temel haliyle bir otomasyon yapmak için
        Class'ımıza otomasyon için gerekli olan webdriver'in yerini göstermemiz gerekir
        bunun için java kutuphanesinde System.setProperty() method'unu kullanırız
        ve method'un içine ilk olarak driver'i yazarız. İkinci olarak onun fiziki yolunu kopyalarız
         */


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");

        System.out.println("Actual title = " + driver.getTitle()); // Gidilen sitenin basligini yazdirir
        System.out.println("Actual Url  = " + driver.getCurrentUrl()); // gidilen sayfanin url'ni getirir

      //  System.out.println("driver.getPageSource() = " + driver.getPageSource()); kaynak kodlarini getirir

    }
}
