package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari {
  /*
    -Amazon sayfasına gidiniz
    -Arama kutusunu locate ediniz
    -Arama kutusunun tagName'inin input olduğunu test ediniz
    -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
    -Sayfayı kapatınız
     */
  public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//      -Amazon sayfasına gidiniz
      driver.get("https://amazon.com");
//      -Arama kutusunu locate ediniz
      WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
//      -Arama kutusunun tagName'inin input olduğunu test ediniz
      String expectedTagname= "input";
      String actualTagname= aramaKutusu.getTagName();
      if (actualTagname.equals(expectedTagname)){
          System.out.println("Tagname Testi PASSSED"+actualTagname);
      }else System.out.println("Tagname Testi FAILED");

//      -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
      String expectedNameAtributu = "field-keywords";
      String actualNameAtributu = aramaKutusu.getAttribute("name");
      if (actualNameAtributu.equals(expectedNameAtributu)){
          System.out.println("TEST PASSED");
      }else System.out.println("TEST FAILED");
      // Arama kutusunun konumunu yazdırınız
      System.out.println("Arama kutusu konumu "+aramaKutusu.getLocation());
//      -Sayfayı kapatınız
      driver.close();
  }
}
