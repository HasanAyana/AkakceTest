import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseDriver {
    @Test
    public void Test2() {
        driver.get("https://www.akakce.com/");


        MyFunc.Bekle(2);


        WebElement girisButton = driver.findElement(By.xpath("//a[@href='https://www.akakce.com/akakcem/giris/']"));
        girisButton.click();
        MyFunc.Bekle(1);

        WebElement eposta = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        eposta.sendKeys("asd123@gmail.com");
        MyFunc.Bekle(1);

        WebElement sifre = driver.findElement(By.xpath("//input[@type='password']"));
        sifre.sendKeys("Grup6Geliyor!");
        MyFunc.Bekle(1);

        WebElement giris = driver.findElement(By.xpath("//input[@id='lfb']"));
        giris.click();
        MyFunc.Bekle(1);

        WebElement ersantext = driver.findElement(By.linkText("Ersan"));
        Assert.assertTrue(ersantext.getText().contains("Ersan"), "Login failed");
        ersantext.click();
        MyFunc.Bekle(1);

        WebElement siparislerim = driver.findElement(By.linkText("Siparişlerim"));
        siparislerim.click();
        MyFunc.Bekle(1);

        WebElement sipariYok = driver.findElement(By.xpath("//*[@id='user-order-info']/div"));
        Assert.assertTrue(sipariYok.getText().contains("Kayıtlı siparişiniz bulunmuyor."), "Test failed");
        MyFunc.Bekle(1);


        WebElement anasayfa = driver.findElement(By.xpath("//a[@href='/']"));
        anasayfa.click();
        MyFunc.Bekle(1);


        WebElement ersantext1 = driver.findElement(By.linkText("Ersan"));
        ersantext1.click();
        MyFunc.Bekle(1);

        WebElement mesaj = driver.findElement(By.xpath("//a[text()='Mesajlarım']"));
        mesaj.click();
        MyFunc.Bekle(1);

        WebElement mesajbul = driver.findElement(By.xpath("//p[text()='Listelenecek mesaj bulunamadı.']"));
        Assert.assertTrue(mesajbul.getText().contains("Listelenecek mesaj bulunamadı."), "Mesaj var");
        MyFunc.Bekle(1);

        WebElement anasayfa1 = driver.findElement(By.xpath("//a[@href='/']"));
        anasayfa1.click();
        MyFunc.Bekle(1);


        WebElement ersantext2 = driver.findElement(By.linkText("Ersan"));
        ersantext2.click();
        MyFunc.Bekle(1);


        WebElement hesapSil = driver.findElement(By.xpath("//a[@href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        hesapSil.click();
        MyFunc.Bekle(1);

        WebElement deleteAccount = driver.findElement(By.xpath("//input[@id='p']"));
        deleteAccount.sendKeys("Grup6Geliyor!");
        MyFunc.Bekle(1);

        WebElement delete = driver.findElement(By.xpath("//input[@id='u']"));
        delete.click();
    }
}