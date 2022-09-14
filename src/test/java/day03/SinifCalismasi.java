package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SinifCalismasi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
         Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */
//        a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
//        b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
//        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextbox = driver.findElement(By.id("session_email"));
        WebElement passwordTextbox = driver.findElement(By.id("session_password"));
        WebElement signin = driver.findElement(By.name("commit"));

//        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//        i. Username : testtechproed@gmail.com
//        ii. Password : Test1234!
        emailTextbox.sendKeys("testtechproed@gmail.com");
        passwordTextbox.sendKeys("Test1234!");
        signin.click();
//                e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement expectedUser = driver.findElement(By.className("navbar-text"));
        Thread.sleep(2000);
        if(expectedUser.isDisplayed()){
            System.out.println("ExpectedUser Testi PASSED "+expectedUser.getText());
        }else System.out.println("ExpectedUser Testi FAILED");
        //----------------------------------------------------------
        String istenenUserYazisi = "testtechproed@gmail.com";
        String actualUserYazısı = expectedUser.getText();
        if(actualUserYazısı.equals(istenenUserYazisi)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");
        /*
         Bir Webelementin üzerindeki yaziyi konsolda yazdırabilmek için getText() methodu kullanılır
         */


//                f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
        WebElement signOut = driver.findElement(By.linkText("Sign out"));
        if (addresses.isDisplayed()){
            System.out.println("Adresses TESTİ PASSED");
        }else System.out.println("Adresses Testi FAILED");
        if (signOut.isDisplayed()){
            System.out.println("SignOut TESTİ PASSED");
        }else System.out.println("SignOut Testi FAILED");
//        3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkSayisi = driver.findElements(By.tagName("a"));
        System.out.println("linklerin sayisi :"+ linkSayisi.size());

        //4. Linkleri yazdiriniz
        for (WebElement w:linkSayisi) {
            System.out.println("linkler :"+w.getText());
        }
        //5.Lambda ile yazdiriniz

        linkSayisi.stream().forEach(t-> System.out.println(t.getText()));

        //6. Sayfayi kapatiniz
        driver.close();








    }
}
