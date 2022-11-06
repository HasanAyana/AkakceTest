import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SignUp extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");
        driver.manage().deleteAllCookies();

        WebElement akakce = driver.findElement(By.xpath("//a[@title='Anasayfaya gitmek için tıklayın']"));
        System.out.println(akakce.getText());
        MyFunc.Bekle(1);

        // hesap ac
        WebElement hesapAc = driver.findElement(By.xpath("//a[@rel='nofollow']"));
        hesapAc.click();
        MyFunc.Bekle(1);


        WebElement ad = driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("Ersan");
        MyFunc.Bekle(1);

        WebElement soyad = driver.findElement(By.xpath("//input[@id='rnufs']"));
        soyad.sendKeys("Kuneri");
        MyFunc.Bekle(1);

        WebElement eposta = driver.findElement(By.xpath("//input[@id='rnufe1']"));
        eposta.sendKeys("asd123@gmail.com");
        MyFunc.Bekle(1);

        WebElement eposta2 = driver.findElement(By.xpath("//input[@id='rnufe2']"));
        eposta2.sendKeys("asd123@gmail.com");
        MyFunc.Bekle(1);

        WebElement sifre = driver.findElement(By.xpath("//input[@id='rnufp1']"));
        sifre.sendKeys("Grup6Geliyor!");
        MyFunc.Bekle(1);

        WebElement resifre = driver.findElement(By.xpath("//input[@id='rnufp2']"));
        resifre.sendKeys("Grup6Geliyor!");
        MyFunc.Bekle(1);

        WebElement cinsiyet = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        cinsiyet.click();
        MyFunc.Bekle(1);

        WebElement ilsec = driver.findElement(By.xpath("//select[@id='locpr']"));
        ilsec.click();

        MyFunc.Bekle(1);
        Select select = new Select(ilsec);
        select.selectByValue("35");

        WebElement ilcesec = driver.findElement(By.xpath("//select[@id='locds']"));
        ilcesec.click();
        Select select2 = new Select(ilcesec);
        select2.selectByValue("476");

        WebElement gun = driver.findElement(By.xpath("//select[@id='bd']"));
        gun.click();
        Select select1 = new Select(gun);
        select1.selectByValue("30");

        WebElement ay = driver.findElement(By.xpath("//select[@id='bm']"));
        ay.click();
        Select select3 = new Select(ay);
        select3.selectByValue("3");

        WebElement yil = driver.findElement(By.xpath("//select[@id='by']"));
        yil.click();
        Select select4 = new Select(yil);
        select4.selectByValue("1992");

        WebElement kullanimsoz = driver.findElement(By.xpath("//input[@id='rnufpca']"));
        kullanimsoz.click();

        WebElement hesapac = driver.findElement(By.xpath("//input[@id='rfb']"));
        hesapac.click();
    }
}