import org.apache.logging.log4j.LogManager;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Demo extends Base {
    static Logger log = Logger.getLogger(Demo.class.getName());

    @Test
    public void TestSearch() throws InterruptedException {
       /* WebElement hesap= driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/a[1]/span"));
        hesap.click();
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement favoriler = driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/a[2]/span"));
        favoriler.click();
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement sepet= driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/a[3]/span"));
        sepet.click();
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement arama = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/div/div/input"));
        arama.sendKeys("pantolon");
        arama.click();
        WebElement aramabuton =driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/button"));
        aramabuton.click();
        Thread.sleep(3000);
        driver.navigate().back();
       JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);*/
       WebElement dahafazlaurungoster= driver.findElement(By.xpath("//*[@id='moreContentButton']"));
        dahafazlaurungoster.click();
        Thread.sleep(4000);
        Random random= new Random();
        int sayı= random.nextInt(92);
        WebElement urunsec=driver.findElement(By.xpath(" //*[@id='o-featuredCategoriesLinks']/li["+sayı+"]"));
        urunsec.click();
        Thread.sleep(5000);
        WebElement secılenurun=driver.findElement(By.xpath("//*[@id='productList']/div[2]"));
        secılenurun.click();
        WebElement bedensec=driver.findElement(By.xpath("//*[@id='sizes']/div/span[3]"));
        bedensec.click();
        WebElement sepeteekle=driver.findElement(By.id("addBasket"));
        sepeteekle.click();
        Thread.sleep(3000);
        WebElement fıyat=driver.findElement(By.xpath("//*[@id='priceNew']"));
        System.out.println(fıyat.getText());
        String fıyat1=fıyat.getText();
        WebElement sepetegıt=driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/a[3]/span"));
        sepetegıt.click();
        Thread.sleep(3000);
        WebElement sepetfıyat=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/div[2]/ul/li[1]/span[2]"));
        System.out.println(sepetfıyat.getText());
        String sepetfıyat1=sepetfıyat.getText();
        if (fıyat1.equals(sepetfıyat1)){
            System.out.println("fiyatlar eşit");
        }
        else {
            System.out.println("fiyatlar eşit değil");
        }
        //Assert.assertEquals("eşit",fıyat1,sepetfıyat1);
        WebElement adetsec = driver.findElement(By.id("quantitySelect0"));
        adetsec.click();
        Thread.sleep(3000);
        WebElement adetarttır =driver.findElement(By.xpath("//*[@id='quantitySelect0']/option[2]"));
        adetarttır.click();
        Thread.sleep(3000);
        WebElement urunsil=driver.findElement(By.xpath("//*[@id='removeCartItemBtn0']"));
        urunsil.click();
        Thread.sleep(3000);

    }
}
